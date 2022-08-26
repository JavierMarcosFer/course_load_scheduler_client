package org.dselent.course_load_scheduler.client.action;

public class SendDeleteMessageAction extends Action {

	private Integer id;
	public SendDeleteMessageAction() {
	}

	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "SendDeleteMessageAction [id=" + id + "]";
	}
	
}
