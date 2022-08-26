package org.dselent.course_load_scheduler.client.action;

public class AddToCartAction extends Action {
	
	private String courseId;

	public AddToCartAction(String courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "SubmitCourseToCartAction [courseName=" + courseId + "]";
	}

	public String getId() {
		return courseId;
	}

}
