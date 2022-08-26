package org.dselent.course_load_scheduler.client.action;

public class RemoveCourseFromCartAction extends Action{
	private Integer instructorId;
	private Integer instanceId;
	public RemoveCourseFromCartAction(Integer instructorId, Integer instanceId) {
		this.instructorId = instructorId;
		this.instanceId = instanceId;
	}
	public Integer getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(Integer instructorId) {
		this.instructorId = instructorId;
	}
	public Integer getInstanceId() {
		return instanceId;
	}
	public void setInstanceId(Integer instanceId) {
		this.instanceId = instanceId;
	}
	@Override
	public String toString() {
		return "RemoveCourseFromCartAction [instructorId=" + instructorId + ", instanceId=" + instanceId + "]";
	}
	
	
}
