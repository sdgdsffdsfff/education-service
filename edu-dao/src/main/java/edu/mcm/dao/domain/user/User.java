package edu.mcm.dao.domain.user;

import java.util.List;

import edu.mcm.dao.domain.advanced.CareerInfo;
import edu.mcm.dao.domain.advanced.EducationInfo;
import edu.mcm.dao.domain.advanced.ProjectInfo;
import edu.mcm.dao.domain.basic.UserBasic;

/**
 * 用户信息，包括student和teacher
 * @author wanggang
 *
 */
public class User {

	private UserBasic user_basic;
	private List<EducationInfo> education_infos;
	private List<CareerInfo> career_infos;
	private List<ProjectInfo> project_infos;

	public User() {
		//
	}

	public UserBasic getUser_basic() {
		return user_basic;
	}

	public void setUser_basic(UserBasic user_basic) {
		this.user_basic = user_basic;
	}

	public List<EducationInfo> getEducation_infos() {
		return education_infos;
	}

	public void setEducation_infos(List<EducationInfo> education_infos) {
		this.education_infos = education_infos;
	}

	public List<CareerInfo> getCareer_infos() {
		return career_infos;
	}

	public void setCareer_infos(List<CareerInfo> career_infos) {
		this.career_infos = career_infos;
	}

	public List<ProjectInfo> getProject_infos() {
		return project_infos;
	}

	public void setProject_infos(List<ProjectInfo> project_infos) {
		this.project_infos = project_infos;
	}

}
