package edu.mcm.dao.domain.advanced;

import java.util.List;

/**
 * 项目信息
 * @author wanggang
 *
 */
public class ProjectInfo {

	private String name; // 项目名称
	private String url; // 项目主页
	private String description; // 项目简介
	private String type; // 项目类型
	private int start; // 项目起始时间
	private int end; // 项目结束时间
	private String content; // 项目详细内容
	private List<String> pic_urls; // 项目图片地址
	private String innovation; // 项目创新点
	private String assessment; // 项目评估
	private String value; // 项目价值点
	private int team_size; // 团队大小

	public ProjectInfo() {
		//
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<String> getPic_urls() {
		return pic_urls;
	}

	public void setPic_urls(List<String> pic_urls) {
		this.pic_urls = pic_urls;
	}

	public String getInnovation() {
		return innovation;
	}

	public void setInnovation(String innovation) {
		this.innovation = innovation;
	}

	public String getAssessment() {
		return assessment;
	}

	public void setAssessment(String assessment) {
		this.assessment = assessment;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getTeam_size() {
		return team_size;
	}

	public void setTeam_size(int team_size) {
		this.team_size = team_size;
	}

}
