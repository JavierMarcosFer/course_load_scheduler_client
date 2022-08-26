package org.dselent.course_load_scheduler.client.action;

public class DeleteSectionAction extends Action {
	private String courseNum;
	private Integer instanceNum;
	private Integer sectionNum;

	public DeleteSectionAction(String courseNum, Integer instanceNum, Integer sectionNum) {
		this.courseNum = courseNum;
		this.instanceNum = instanceNum;
		this.sectionNum = sectionNum;
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

	@Override
	public String toString() {
		return "DeleteSectionAction [courseNum=" + courseNum + ", instanceNum=" + instanceNum + ", sectionNum="
				+ sectionNum + "]";
	}
}
