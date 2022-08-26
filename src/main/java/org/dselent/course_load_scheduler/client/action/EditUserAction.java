package org.dselent.course_load_scheduler.client.action;

public class EditUserAction extends Action {

	private String newLastName;
	private String newEmail;
	private Double newRequirements;
	private Boolean newAdministrator;
	
	public EditUserAction(String newLastName, String newEmail, Double newRequirements, Boolean newAdministrator)
	{
		this.newLastName = newLastName;
		this.newEmail = newEmail;
		this.newRequirements = newRequirements;
		this.newAdministrator = newAdministrator;
	}

	public String getNewLastName() {
		return newLastName;
	}

	public String getNewEmail() {
		return newEmail;
	}

	public Double getNewRequirements() {
		return newRequirements;
	}

	public Boolean getNewAdministrator() {
		return newAdministrator;
	}

	@Override
	public String toString() {
		return "EditUserAction [newLastName=" + newLastName + ", newEmail=" + newEmail + ", newRequirements="
				+ newRequirements + ", newAdministrator=" + newAdministrator + "]";
	}

	
	
}
