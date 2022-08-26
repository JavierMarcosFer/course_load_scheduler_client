package org.dselent.course_load_scheduler.client.action;

public class DeleteUserAction extends Action{
	private Integer userId;
	
	public DeleteUserAction(Integer userId) {
		this.userId = userId;
	}
	
	public Integer getUserId() {
		return userId;
	}
	
	@Override
	public String toString() {
		return "DeleteUserAction [userId=" + userId + "]";
	}
}
