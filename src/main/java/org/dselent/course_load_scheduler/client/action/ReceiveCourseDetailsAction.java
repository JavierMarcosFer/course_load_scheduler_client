package org.dselent.course_load_scheduler.client.action;

import org.dselent.course_load_scheduler.client.model.DetailedCourseInformation;

public class ReceiveCourseDetailsAction extends Action{
	private DetailedCourseInformation courseInfo;

	public ReceiveCourseDetailsAction(DetailedCourseInformation courseInfo) {
		this.courseInfo = courseInfo;
	}

	public DetailedCourseInformation getCourseInfo() {
		return courseInfo;
	}

	public void setCourseInfo(DetailedCourseInformation courseInfo) {
		this.courseInfo = courseInfo;
	}

	@Override
	public String toString() {
		return "ReceiveCourseDetailsAction [courseInfo=" + courseInfo + "]";
	}
}
