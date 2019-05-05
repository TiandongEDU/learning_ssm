package cn.java.safecar.entity;

import java.io.Serializable;

public class UserCourse implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long userId;
	private Long courseId;
	private Double score;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	
}
