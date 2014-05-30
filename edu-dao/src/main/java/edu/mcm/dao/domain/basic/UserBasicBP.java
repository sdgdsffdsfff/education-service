package edu.mcm.dao.domain.basic;

import java.util.Date;

/**
 * 用户基本信息
 * @author wanggang
 *
 */
public class UserBasicBP {

	private final long username; // 用户ID，10位数字
	private final String domain_name; // 个性化域名
	private final String nickname; // 用户名
	private final int gender; // 性别，0--男，1--女，2--其他
	private final int sex; // 年龄
	private final String url; // 用户主页
	private final int province; // 省份编码
	private final int city; // 城市编码
	private final String location; // 区域位置
	private final String description; // 自我描述，或者简介
	private final String image_url; // 头像地址
	private final int followers_count; // 粉丝量
	private final int friends_count; // 关注量
	private final int statuses_count; // 状态量
	private final int favorites_count; // 收藏量
	private final int bi_followers_count; // 双向关注量
	private final Date created_at; // 创建时间
	private final boolean verified; // 是否认证
	private final int verified_type; // 认证类型
	private final String verified_info; // 认证信息
	private final String remark; // 备注
	private final long qq; // qq号
	private final String weibo; // 微博号
	private final String weixin; // 微信号
	private final Date lasttime; // 最后修改时间

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

	public UserBasicBP(Builder builder) {
		this.username = builder.username;
		this.domain_name = builder.domain_name;
		this.nickname = builder.nickname;
		this.gender = builder.gender;
		this.sex = builder.sex;
		this.url = builder.url;
		this.province = builder.province;
		this.city = builder.city;
		this.location = builder.location;
		this.description = builder.description;
		this.image_url = builder.image_url;
		this.followers_count = builder.followers_count;
		this.friends_count = builder.friends_count;
		this.statuses_count = builder.statuses_count;
		this.favorites_count = builder.favorites_count;
		this.bi_followers_count = builder.bi_followers_count;
		this.created_at = builder.created_at;
		this.verified = builder.verified;
		this.verified_type = builder.verified_type;
		this.verified_info = builder.verified_info;
		this.remark = builder.remark;
		this.qq = builder.qq;
		this.weibo = builder.weibo;
		this.weixin = builder.weixin;
		this.lasttime = builder.lasttime;
	}

	public static class Builder {

		private final long username; // 用户ID，10位数字
		private String nickname = ""; // 用户名
		private String domain_name = ""; // 个性化域名
		private int gender; // 性别，0--男，1--女，2--其他
		private int sex; // 年龄
		private String url = ""; // 用户主页
		private int province; // 省份编码
		private int city; // 城市编码
		private String location = ""; // 区域位置
		private String description = ""; // 自我描述，或者简介
		private String image_url = ""; // 头像地址
		private int followers_count; // 粉丝量
		private int friends_count; // 关注量
		private int statuses_count; // 状态量
		private int favorites_count; // 收藏量
		private int bi_followers_count; // 双向关注量
		private Date created_at = null; // 创建时间
		private boolean verified; // 是否认证
		private int verified_type; // 认证类型
		private String verified_info = ""; // 认证信息
		private String remark = ""; // 备注
		private long qq; // qq号
		private String weibo = ""; // 微博号
		private String weixin = ""; // 微信号
		private Date lasttime = null; // 最后修改时间

		public Builder(long username, String nickname) {
			this.username = username;
			this.nickname = nickname;
		}

		public Builder setDomain_name(String domain_name) {
			this.domain_name = domain_name;
			return this;
		}

		public Builder setGender(int gender) {
			this.gender = gender;
			return this;
		}

		public Builder setSex(int sex) {
			this.sex = sex;
			return this;
		}

		public Builder setUrl(String url) {
			this.url = url;
			return this;
		}

		public Builder setProvince(int province) {
			this.province = province;
			return this;
		}

		public Builder setCity(int city) {
			this.city = city;
			return this;
		}

		public Builder setLocation(String location) {
			this.location = location;
			return this;
		}

		public Builder setDescription(String description) {
			this.description = description;
			return this;
		}

		public Builder setImage_url(String image_url) {
			this.image_url = image_url;
			return this;
		}

		public Builder setFollowers_count(int followers_count) {
			this.followers_count = followers_count;
			return this;
		}

		public Builder setFriends_count(int friends_count) {
			this.friends_count = friends_count;
			return this;
		}

		public Builder setStatuses_count(int statuses_count) {
			this.statuses_count = statuses_count;
			return this;
		}

		public Builder setFavorites_count(int favorites_count) {
			this.favorites_count = favorites_count;
			return this;
		}

		public Builder setBi_followers_count(int bi_followers_count) {
			this.bi_followers_count = bi_followers_count;
			return this;
		}

		public Builder setCreated_at(Date created_at) {
			this.created_at = created_at;
			return this;
		}

		public Builder setVerified(boolean verified) {
			this.verified = verified;
			return this;
		}

		public Builder setVerified_type(int verified_type) {
			this.verified_type = verified_type;
			return this;
		}

		public Builder setVerified_info(String verified_info) {
			this.verified_info = verified_info;
			return this;
		}

		public Builder setRemark(String remark) {
			this.remark = remark;
			return this;
		}

		public Builder setQq(long qq) {
			this.qq = qq;
			return this;
		}

		public Builder setWeibo(String weibo) {
			this.weibo = weibo;
			return this;
		}

		public Builder setWeixin(String weixin) {
			this.weixin = weixin;
			return this;
		}

		public Builder setLasttime(Date lasttime) {
			this.lasttime = lasttime;
			return this;
		}

		public UserBasicBP build() {
			return new UserBasicBP(this);
		}

	}

	public long getUsername() {
		return username;
	}

	public String getDomain_name() {
		return domain_name;
	}

	public String getNickname() {
		return nickname;
	}

	public int getGender() {
		return gender;
	}

	public int getSex() {
		return sex;
	}

	public String getUrl() {
		return url;
	}

	public int getProvince() {
		return province;
	}

	public int getCity() {
		return city;
	}

	public String getLocation() {
		return location;
	}

	public String getDescription() {
		return description;
	}

	public String getImage_url() {
		return image_url;
	}

	public int getFollowers_count() {
		return followers_count;
	}

	public int getFriends_count() {
		return friends_count;
	}

	public int getStatuses_count() {
		return statuses_count;
	}

	public int getFavorites_count() {
		return favorites_count;
	}

	public int getBi_followers_count() {
		return bi_followers_count;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public boolean isVerified() {
		return verified;
	}

	public int getVerified_type() {
		return verified_type;
	}

	public String getVerified_info() {
		return verified_info;
	}

	public String getRemark() {
		return remark;
	}

	public long getQq() {
		return qq;
	}

	public String getWeibo() {
		return weibo;
	}

	public String getWeixin() {
		return weixin;
	}

	public Date getLasttime() {
		return lasttime;
	}

}
