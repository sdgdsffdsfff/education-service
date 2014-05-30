package edu.mcm.dao.domain.advanced;

/**
 * 职业信息
 * @author wanggang
 *
 */
public class CareerInfo {

	private int company_code; // 就职公司代码
	private int work_code; // 职业代码，也就是职位代码
	private int start; // 工作起始时间
	private int end; // 工作结束时间
	private String location; // 工作地点
	private int province; // 省份编码
	private int city; // 城市编码
	private int monthly_salary; // 月薪
	private int annual_salary; // 年薪
	private String description; // 工作内容简单描述
	private String remark; // 备注

	public CareerInfo() {
		//
	}

	public int getCompany_code() {
		return company_code;
	}

	public void setCompany_code(int company_code) {
		this.company_code = company_code;
	}

	public int getWork_code() {
		return work_code;
	}

	public void setWork_code(int work_code) {
		this.work_code = work_code;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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

	public int getMonthly_salary() {
		return monthly_salary;
	}

	public void setMonthly_salary(int monthly_salary) {
		this.monthly_salary = monthly_salary;
	}

	public int getAnnual_salary() {
		return annual_salary;
	}

	public void setAnnual_salary(int annual_salary) {
		this.annual_salary = annual_salary;
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
