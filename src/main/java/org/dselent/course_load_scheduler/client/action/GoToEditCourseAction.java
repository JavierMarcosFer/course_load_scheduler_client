package org.dselent.course_load_scheduler.client.action;

public class GoToEditCourseAction extends Action {
	private String courseNum;
	
	public GoToEditCourseAction(String courseNum) {
		this.courseNum = courseNum;
	}

	public String getCourseNum() {
		return courseNum;
	}

	@Override
	public String toString() {
		return "GoToEditCourseAction [courseNum=" + courseNum + "]";
	}
	
	
}
