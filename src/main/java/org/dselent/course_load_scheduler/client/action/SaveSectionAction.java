package org.dselent.course_load_scheduler.client.action;

public class SaveSectionAction extends Action {
	private String courseNum;
	private Integer instanceNum;
	private Integer sectionNum;
	private Integer expectedPop;
	private String type;
	private Integer startTime;
	private Integer endTime;
	private String days;
	
	public SaveSectionAction(String courseNum, Integer instanceNum, Integer sectionNum,
			Integer expectedPop, String type, Integer startTime, Integer endTime, String days) {
		this.courseNum = courseNum;
		this.instanceNum = instanceNum;
		this.sectionNum = sectionNum;
		this.expectedPop = expectedPop;
		this.type = type;
		this.startTime = startTime;
		this.endTime = endTime;
		this.days = days;
	}

	public String getCourseNum() {
		return courseNum;
	}

	public Integer getInstanceNum() {
		return instanceNum;
	}

	public Integer getSectionNum() {
		return sectionNum;
	}

	public Integer getExpectedPop() {
		return expectedPop;
	}

	public String getType() {
		return type;
	}

	public Integer getStartTime() {
		return startTime;
	}

	public Integer getEndTime() {
		return endTime;
	}

	public String getDays() {
		return days;
	}

	@Override
	public String toString() {
		return "SaveSectionAction [courseNum=" + courseNum + ", instanceNum=" + instanceNum + ", sectionNum="
				+ sectionNum + ", expectedPop=" + expectedPop + ", type=" + type + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", days=" + days + "]";
	}
}
