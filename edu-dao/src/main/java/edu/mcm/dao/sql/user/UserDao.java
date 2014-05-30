package edu.mcm.dao.sql.user;

/**
 * 用户信息接口
 * @author wanggang
 *
 */
public interface UserDao {

	/**
	 * 插入用户信息
	 */
	public void insertUserInfo(InsertUserInfo insertUserInfo);

	/**
	 * 更新用户信息
	 */
	public void updateUserInfo(InsertUserInfo insertUserInfo);

	/**
	 * 获取用户信息
	 */
	public SelectUserInfo selectUserInfo(SelectUserInfoParams selectUserInfoParams);

	/**
	 * 删除用户信息
	 */
	public void deleteUserInfo(SelectUserInfoParams selectUserInfoParams);

}
