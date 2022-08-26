package org.dselent.course_load_scheduler.client.model;

public class DetailedCourseInformation extends Model{
	private String courseName;
	private String courseNum;
	private Integer level;
	private Integer expectedPop;
	private String days;
	
	public DetailedCourseInformation(String courseName, String courseNum, Integer level, Integer expectedPop,
			String days) {
		this.courseName = courseName;
		this.courseNum = courseNum;
		this.level = level;
		this.expectedPop = expectedPop;
		this.days = days;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getExpectedPop() {
		return expectedPop;
	}

	public void setExpectedPop(Integer expectedPop) {
		this.expectedPop = expectedPop;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "DetailedCourseInformation [courseName=" + courseName + ", courseNum=" + courseNum + ", level=" + level
				+ ", expectedPop=" + expectedPop + ", days=" + days + "]";
	}
	
	
}
