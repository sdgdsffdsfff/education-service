package edu.mcm.dao.sql.user;

/**
 * 查询用户信息参数
 * @author wanggang
 *
 */
public class SelectUserInfoParams {

	private String tablename;
	private long username;

	public SelectUserInfoParams() {
		//
	}

	public SelectUserInfoParams(String tablename, long username) {
		this.tablename = tablename;
		this.username = username;
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public long getUsername() {
		return username;
	}

	public void setUsername(long username) {
		this.username = username;
	}

}
