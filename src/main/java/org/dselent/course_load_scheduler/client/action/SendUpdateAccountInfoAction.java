package org.dselent.course_load_scheduler.client.action;

public class SendUpdateAccountInfoAction extends Action {
	
	private String oldPassword;
	private String newPassword;
	private String repeatPassword;
	private String newEmail;
	private Integer newPhoneNum;
	
	public SendUpdateAccountInfoAction(String oldPassword, String newPassword, String newEmail, Integer newPhoneNum) {
		this.oldPassword = oldPassword;
		this.newEmail = newEmail;
		this.newPassword = newPassword;
		this.repeatPassword = newPassword;
		this.newPhoneNum = newPhoneNum;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public String getNewEmail() {
		return newEmail;
	}

	public Integer getNewPhoneNum() {
		return newPhoneNum;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public String getRepeatPassword() {
		return repeatPassword;
	}

	@Override
	public String toString() {
		return "SendUpdateAccountInfoAction [oldPassword=" + oldPassword + ", newPassword=" + newPassword
				+ ", repeatPassword=" + repeatPassword + ", newEmail=" + newEmail + ", newPhoneNum=" + newPhoneNum
				+ "]";
	}
	
	
}
