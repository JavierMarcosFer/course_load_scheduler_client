package org.dselent.course_load_scheduler.client.action;

public class SendAccountInfoAction extends Action{
	
	private Integer userId;
	
	public SendAccountInfoAction(Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SendAccountInfoAction [userId=" + userId + "]";
	}
}
