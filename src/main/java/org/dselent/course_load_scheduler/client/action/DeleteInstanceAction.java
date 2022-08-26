package org.dselent.course_load_scheduler.client.action;

public class DeleteInstanceAction extends Action {
	private String courseNum;
	private Integer instanceNum;
	
	public DeleteInstanceAction(String courseNum, Integer instanceNum) {
		this.courseNum = courseNum;
		this.instanceNum = instanceNum;
	}

	public String getCourseNum(){
		return courseNum;
	}

	public Integer getInstanceNum(){
		return instanceNum;
	}
	
	@Override
	public String toString() {
		return "DeleteInstanceAction [courseNum=" + courseNum + ", instanceNum=" + instanceNum + "]";
	}
}
