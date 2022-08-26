package org.dselent.course_load_scheduler.client.action;

public class AddInstanceAction extends Action {
//num, instance number, term
	private String courseNumber;
	private Integer instanceNum;
	private Integer term;
	
	public AddInstanceAction(String courseNumber, Integer instanceNum, Integer term) {
		this.courseNumber = courseNumber;
		this.instanceNum = instanceNum;
		this.term = term;
	}
	
	public AddInstanceAction(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getNumber() {
		return courseNumber;
	}

	public Integer getInstanceNum() {
		return instanceNum;
	}

	public Integer getTerm() {
		return term;
	}

	@Override
	public String toString() {
		return "AddInstanceAction [number=" + courseNumber + ", instanceNum=" + instanceNum + ", term=" + term + "]";
	}
	
	
	
}
