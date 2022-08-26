package org.dselent.course_load_scheduler.client.action;

public class AddSectionAction extends Action {

	private String courseNumber;
	private Integer instanceNumber;
	private Integer expectedPop;
	private String lectureType;
	private String days;
	private Integer timeStart;
	private Integer timeEnd;
	
	public AddSectionAction(String CourseNumber, Integer InstanceNumber) {
		this.courseNumber = CourseNumber;
		this.instanceNumber = InstanceNumber;
	}
	
	public AddSectionAction(Integer expectedPop, String lectureType, String days, Integer timeStart, Integer timeEnd) {
		this.expectedPop = expectedPop;
		this.lectureType = lectureType;
		this.days = days;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
	}

	public Integer getInstanceNumber() {
		return instanceNumber;
	}

	public String getCourseNumber() {
		return courseNumber;
	}
	
	public Integer getExpectedPop() {
		return expectedPop;
	}

	public String getLectureType() {
		return lectureType;
	}

	public String getDays() {
		return days;
	}

	public Integer getTimeStart() {
		return timeStart;
	}

	public Integer getTimeEnd() {
		return timeEnd;
	}

	@Override
	public String toString() {
		return "AddSectionAction [courseNumber=" + courseNumber + ", instanceNumber=" + instanceNumber
				+ ", expectedPop=" + expectedPop + ", lectureType=" + lectureType + ", days=" + days + ", timeStart="
				+ timeStart + ", timeEnd=" + timeEnd + "]";
	}
	
	
}
