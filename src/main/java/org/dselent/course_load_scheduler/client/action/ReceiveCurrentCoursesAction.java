package org.dselent.course_load_scheduler.client.action;

import org.dselent.course_load_scheduler.client.model.CourseInstanceDto;

public class ReceiveCurrentCoursesAction extends Action{
	private CourseInstanceDto courses;
	
	public ReceiveCurrentCoursesAction(CourseInstanceDto courses) {
		this.courses = courses;
	}

	public CourseInstanceDto getCourses() {
		return courses;
	}

	public void setCourses(CourseInstanceDto courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "ReceiveCurrentCoursesAction [courses=" + courses + "]";
	}
	
	
}

