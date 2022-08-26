package org.dselent.course_load_scheduler.client.action;

import org.dselent.course_load_scheduler.client.model.InboxDto;

public class ReceiveInboxInfoAction extends Action{
	private InboxDto inbox;
	
	public ReceiveInboxInfoAction(InboxDto inbox) {
		this.inbox = inbox;
	}

	public InboxDto getInbox() {
		return inbox;
	}

	@Override
	public String toString() {
		return "ReceiveInboxInfoAction [inbox=" + inbox + "]";
	}
}
