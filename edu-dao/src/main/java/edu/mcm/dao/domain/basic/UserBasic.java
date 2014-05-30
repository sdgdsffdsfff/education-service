package edu.mcm.dao.domain.basic;

import java.util.Date;

/**
 * 用户基本信息
 * @author wanggang
 *
 */
public class UserBasic {

	private long username; // 用户ID，10位数字
	private String domain_name; // 个性化域名
	private String nickname; // 用户名
	private int gender; // 性别，0--男，1--女，2--其他
	private int sex; // 年龄
	private String url; // 用户主页
	private int province; // 省份编码
	private int city; // 城市编码
	private String location; // 区域位置
	private String description; // 自我描述，或者简介
	private String image_url; // 头像地址
	private int followers_count; // 粉丝量
	private int friends_count; // 关注量
	private int statuses_count; // 状态量
	private int favorites_count; // 收藏量
	private int bi_followers_count; // 双向关注量
	private Date created_at; // 创建时间
	private boolean verified; // 是否认证
	private int verified_type; // 认证类型
	private String verified_info; // 认证信息
	private String remark; // 备注
	private long qq; // qq号
	private String weibo; // 微博号
	private String weixin; // 微信号
	private Date lasttime; // 最后修改时间

	@Override
	public String toString() {
		return "UserBasicBP:{" + "username=" + username + ",domain_name=" + domain_name + ",nickname=" + nickname
				+ ",gender=" + gender + ",sex=" + sex + ",url=" + url + ",province=" + province + ",city=" + city
				+ ",location=" + location + ",description=" + description + ",image_url=" + image_url
				+ ",followers_count=" + followers_count + ",friends_count=" + friends_count + ",statuses_count="
				+ statuses_count + ",favorites_count=" + favorites_count + ",bi_followers_count=" + bi_followers_count
				+ ",created_at=" + created_at + ",verified=" + verified + ",verified_type=" + verified_type
				+ ",verified_info=" + verified_info + ",remark=" + remark + ",qq=" + qq + ",weibo=" + weibo
				+ ",weixin=" + weixin + ",lasttime=" + lasttime + "}";
	}

	public UserBasic() {
		//
	}

	public long getUsername() {
		return username;
	}

	public void setUsername(long username) {
		this.username = username;
	}

	public String getDomain_name() {
		return domain_name;
	}

	public void setDomain_name(String domain_name) {
		this.domain_name = domain_name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getProvince() {
		return province;
	}

	public void setProvince(int province) {
		this.province = province;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public int getFollowers_count() {
		return followers_count;
	}

	public void setFollowers_count(int followers_count) {
		this.followers_count = followers_count;
	}

	public int getFriends_count() {
		return friends_count;
	}

	public void setFriends_count(int friends_count) {
		this.friends_count = friends_count;
	}

	public int getStatuses_count() {
		return statuses_count;
	}

	public void setStatuses_count(int statuses_count) {
		this.statuses_count = statuses_count;
	}

	public int getFavorites_count() {
		return favorites_count;
	}

	public void setFavorites_count(int favorites_count) {
		this.favorites_count = favorites_count;
	}

	public int getBi_followers_count() {
		return bi_followers_count;
	}

	public void setBi_followers_count(int bi_followers_count) {
		this.bi_followers_count = bi_followers_count;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public int getVerified_type() {
		return verified_type;
	}

	public void setVerified_type(int verified_type) {
		this.verified_type = verified_type;
	}

	public String getVerified_info() {
		return verified_info;
	}

	public void setVerified_info(String verified_info) {
		this.verified_info = verified_info;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public long getQq() {
		return qq;
	}

	public void setQq(long qq) {
		this.qq = qq;
	}

	public String getWeibo() {
		return weibo;
	}

	public void setWeibo(String weibo) {
		this.weibo = weibo;
	}

	public String getWeixin() {
		return weixin;
	}

	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

	public Date getLasttime() {
		return lasttime;
	}

	public void setLasttime(Date lasttime) {
		this.lasttime = lasttime;
	}

}
