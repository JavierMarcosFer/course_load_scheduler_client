package org.dselent.course_load_scheduler.client.action;

public class GoToEditInstanceAction extends Action {
	
	Integer instanceNo;
	
	public GoToEditInstanceAction(Integer instanceNo) {
		this.instanceNo = instanceNo;
	}

	public Integer getInstanceNo() {
		return instanceNo;
	}

	@Override
	public String toString() {
		return "GoToEditInstance [instanceNo=" + instanceNo + "]";
	}
}
