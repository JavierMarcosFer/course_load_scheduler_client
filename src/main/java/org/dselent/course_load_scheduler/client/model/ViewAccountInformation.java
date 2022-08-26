package org.dselent.course_load_scheduler.client.model;

public class ViewAccountInformation extends Model {

	// attributes
	
	private String userName;
	private String firstName;
	private String lastName;
	private Long phoneNum;
	private String email;
	private String secondaryEmail;
	private Integer reqCourses;
	private Float remaining;
	

	// methods
	
	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}
	public Long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getSecondaryEmail() {
		return secondaryEmail;
	}

	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

	public Integer getReqCourses() {
		return reqCourses;
	}

	public void setReqCourses(Integer reqCourses) {
		this.reqCourses = reqCourses;
	}
	public Float getRemaining() {
		return remaining;
	}

	public void setRemaining(Float remaining) {
		this.remaining = remaining;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((phoneNum == null) ? 0 : phoneNum.hashCode());
		result = prime * result + ((secondaryEmail == null) ? 0 : secondaryEmail.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((reqCourses == null) ? 0 : reqCourses.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ViewAccountInformation other = (ViewAccountInformation) obj;
		if (email == null) {
			if (other.getEmail() != null)
				return false;
		} else if (!email.equals(other.getEmail()))
			return false;
		if (firstName == null) {
			if (other.getFirstName() != null)
				return false;
		} else if (!firstName.equals(other.getFirstName()))
			return false;
		if (lastName == null) {
			if (other.getLastName() != null)
				return false;
		} else if (!lastName.equals(other.getLastName()))
			return false;
		if (phoneNum == null) {
			if (other.getPhoneNum() != null)
				return false;
		} else if (!phoneNum.equals(other.getPhoneNum()))
			return false;
		if (secondaryEmail == null) {
			if (other.getSecondaryEmail() != null)
				return false;
		} else if (!secondaryEmail.equals(other.getSecondaryEmail()))
			return false;
		if (userName == null) {
			if (other.getUserName() != null)
				return false;
		} else if (!userName.equals(other.getUserName()))
			return false;
		if (reqCourses == null) {
			if (other.reqCourses != null)
				return false;
		} else if (!reqCourses.equals(other.reqCourses))
			return false;
		if (remaining == null) {
			if (other.remaining != null)
				return false;
		} else if (!remaining.equals(other.remaining))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNum=" + phoneNum + ", email=" + email + ", secondaryEmail=" + secondaryEmail
				+ ", reqCourses=" + reqCourses + "]";
	}
}
