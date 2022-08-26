package org.dselent.course_load_scheduler.client.action;

public class SendSubmitRegistrationCartAction extends Action {
	private Integer instructorId;
	
	public SendSubmitRegistrationCartAction() {}
	
	public SendSubmitRegistrationCartAction(Integer instructorId) {
		this.instructorId = instructorId;
	}

	public Integer getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(Integer instructorId) {
		this.instructorId = instructorId;
	}

	@Override
	public String toString() {
		return "SendSubmitRegistrationCartAction [instructorId=" + instructorId + "]";
	};
}
