package org.dselent.course_load_scheduler.client.action;

public class AddCourseAction extends Action {
	
	private String number;
	private String name;
	private String type;
	private String description;
	private Integer level;
	private String department;
	
	public AddCourseAction(String name, String number, String type, Integer level, String department, String description) {
		this.number = number;
		this.name = name;
		this.type = type;
		this.description = description;
		this.level = level;
		this.department = department;
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}

	public Integer getLevel() {
		return level;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "AddCourseAction [number=" + number + ", name=" + name + ", type=" + type + ", description="
				+ description + ", level=" + level + ", department=" + department + "]";
	}
	
}
