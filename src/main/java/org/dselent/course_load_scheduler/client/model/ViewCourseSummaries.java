package org.dselent.course_load_scheduler.client.model;

public class ViewCourseSummaries extends Model {
	// attributes
	

	private String courseNum;
	private String courseName;
	private String meetingDays;
	
	public String getMeetingDays() {
		return meetingDays;
	}
	public void setMeetingDays(String meetingDays) {
		this.meetingDays = meetingDays;
	}
	public String getCourseNum() {
		return courseNum;
	}
	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseNum == null) ? 0 : courseNum.hashCode());
		result = prime * result + ((meetingDays == null) ? 0 : meetingDays.hashCode());
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ViewCourseSummaries other = (ViewCourseSummaries) obj;
		if (courseNum == null) {
			if (other.courseNum != null)
				return false;
		} else if (!courseNum.equals(other.courseNum))
			return false;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		if (meetingDays == null) {
			if (other.meetingDays != null)
				return false;
		} else if (!meetingDays.equals(other.meetingDays))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CourseSection [courseName=" + courseName + ", courseNum=" + courseNum
				+ ", meetingDays=" + meetingDays + "]";
	}
}
