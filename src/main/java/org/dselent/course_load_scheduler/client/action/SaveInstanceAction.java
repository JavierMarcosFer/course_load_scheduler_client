package org.dselent.course_load_scheduler.client.action;

public class SaveInstanceAction extends Action {
	private String courseNum;
	private Integer instanceNum;
	private Integer term;
	
	public SaveInstanceAction(String courseNum, Integer instanceNum, Integer term) {
		this.courseNum = courseNum;
		this.instanceNum = instanceNum;
		this.term = term;
	}

	public String getCourseNum() {
		return courseNum;
	}

	public Integer getInstanceNum() {
		return instanceNum;
	}

	public Integer getTerm() {
		return term;
	}

	@Override
	public String toString() {
		return "SaveInstanceAction [courseNum=" + courseNum + ", instanceNum=" + instanceNum + ", term=" + term + "]";
	}
}
