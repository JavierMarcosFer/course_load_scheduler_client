package org.dselent.course_load_scheduler.client.action;

public class SendReportAction extends Action {
	
//	private String name;
//	private String email;
	private String type;
	private String description;
	
	public SendReportAction(String type, String description) {
//		this.name = name;
//		this.email = email;
		this.type = type;
		this.description = description;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "SubmitReportAction [" + /*"name=" + name + ", email=" + email + ", " +*/ "type=" + type + ", description="
				+ description + "]";
	}
	
}
