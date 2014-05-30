package edu.mcm.dao.sql.user;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.mcm.utils.config.ConfigUtil;

/**
 * Education数据库链接类
 * @author wanggang
 *
 */
public class EduJDBC {

	private static Logger logger = LoggerFactory.getLogger(EduJDBC.class);

	private BasicDataSource dataSource;

	private String db_url;
	private String db_username;
	private String db_password;

	public EduJDBC() {
		dbInit();
		dbConnection();
	}

	/**
	 * 初始化数据库相关参数
	 */
	private void dbInit() {
		Properties props = ConfigUtil.getProps("data_db.properties");
		db_url = props.getProperty("sent.db.url");
		db_username = props.getProperty("sent.db.username");
		db_password = props.getProperty("sent.db.password");
	}

	/**
	 * 链接数据库
	 */
	private void dbConnection() {
		dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl(db_url);
		dataSource.setUsername(db_username);
		dataSource.setPassword(db_password);
		dataSource.setTestOnBorrow(true);
		dataSource.setValidationQuery("select 1");
	}

	/**
	 * 获取链接
	 */
	private Connection getConnection() {
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 关闭数据库
	 */
	public void close() {
		try {
			dataSource.close();
		} catch (SQLException e) {
			logger.info("Db close error.");
		}
	}

	@Override
	public String toString() {
		return "SentJDBC:[db_url=" + db_url + ",db_username=" + db_username + ",db_password=" + db_password + "]";
	}

	/**
	 * 创建用户基础信息表
	 */
	public void createSentimentTable(String tablename) {

		String sql = "";
		try (Connection conn = getConnection(); Statement pstmt = conn.createStatement();) {
			pstmt.execute(sql);
		} catch (SQLException e) {
			throw new RuntimeException("SQLException: " + e);
		}
	}

}
