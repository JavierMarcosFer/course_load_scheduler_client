package org.dselent.course_load_scheduler.client.action;

public class EditCourseAction extends Action {
	
	private String number;
	private String name;
	private String type;
	private String description;
	private Integer level;
	private String department;
	private Integer courseId;
	
	public EditCourseAction(String name, String number, String type, Integer level, String department, String description, Integer courseId) {
		this.number = number;
		this.name = name;
		this.type = type;
		this.description = description;
		this.level = level;
		this.department = department;
		this.courseId = courseId;
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
	
	public Integer getCourseId() {
		return courseId;
	}

	@Override
	public String toString() {
		return "EditCourseAction [number=" + number + ", name=" + name + ", type=" + type + ", description="
				+ description + ", level=" + level + ", department=" + department + ", courseId=" + courseId + "]";
	}
	
}
