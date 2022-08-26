package org.dselent.course_load_scheduler.client.action;

public class GetCourseDetailsAction extends Action{
	private Integer courseId;
	
	public GetCourseDetailsAction(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "GetCourseDetailsAction [courseId=" + courseId + "]";
	}
	
	
}

