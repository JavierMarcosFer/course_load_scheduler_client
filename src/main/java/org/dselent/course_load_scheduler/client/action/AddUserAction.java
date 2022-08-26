package org.dselent.course_load_scheduler.client.action;

public class AddUserAction extends Action {

	private String firstName;
	private String lastName;
	private String email;
	private Double requirements;
	private Boolean administrator;
	
	public AddUserAction(String firstName, String lastName, String email, Double requirements, Boolean administrator)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.requirements = requirements;
		this.administrator = administrator;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public Double getRequirements() {
		return requirements;
	}

	public Boolean getAdministrator() {
		return administrator;
	}

	@Override
	public String toString() {
		return "AddUserAction [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", requirements=" + requirements + ", administrator=" + administrator + "]";
	}
}
