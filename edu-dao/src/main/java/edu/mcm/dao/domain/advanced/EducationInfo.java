package edu.mcm.dao.domain.advanced;

/**
 * 教育信息
 * @author wanggang
 *
 */
public class EducationInfo {

	private int code; // 学校代码
	private int type; // 学校类型，专科、本科、研究生、博士
	private int start; // 入学时间, 如：20080901
	private int end; // 毕业时间
	private int major; // 学院专业，这个应该从固定的数据表内获取
	private String awards; // 获奖信息
	private String practice; // 实习情况
	private String experience; // 社会经历
	private String description; // 教育描述
	private String remark; // 备注

	public EducationInfo() {
		//
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getMajor() {
		return major;
	}

	public void setMajor(int major) {
		this.major = major;
	}

	public String getAwards() {
		return awards;
	}

	public void setAwards(String awards) {
		this.awards = awards;
	}

	public String getPractice() {
		return practice;
	}

	public void setPractice(String practice) {
		this.practice = practice;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
