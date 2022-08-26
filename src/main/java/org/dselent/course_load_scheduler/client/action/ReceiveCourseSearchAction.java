package org.dselent.course_load_scheduler.client.action;

import org.dselent.course_load_scheduler.client.model.CourseInstanceDto;

public class ReceiveCourseSearchAction extends Action{
	
	private CourseInstanceDto courses;
	
	public ReceiveCourseSearchAction(CourseInstanceDto courses) {
		this.courses = courses;
	}

	public CourseInstanceDto getCourses() {
		return courses;
	}

	@Override
	public String toString() {
		return "ReceiveCourseSearchAction [courses=" + courses + "]";
	}
}
