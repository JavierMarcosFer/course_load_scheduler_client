package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendInboxInfoAction;
import org.dselent.course_load_scheduler.client.event_handler.SendInboxInfoEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SendInboxInfoEvent extends DisplayEvent<SendInboxInfoAction, SendInboxInfoEventHandler>{

	public static Type<SendInboxInfoEventHandler> TYPE = new Type<SendInboxInfoEventHandler>();
	
	public SendInboxInfoEvent(SendInboxInfoAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<SendInboxInfoEventHandler> getAssociatedType()
	{
		return TYPE;
	}
	protected void dispatch(SendInboxInfoEventHandler handler)
	{
		handler.onSendInboxInfo(this);
	}
}
