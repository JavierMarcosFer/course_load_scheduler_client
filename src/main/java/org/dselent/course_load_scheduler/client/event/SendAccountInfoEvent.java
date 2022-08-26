package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendAccountInfoAction;
import org.dselent.course_load_scheduler.client.event_handler.SendAccountInfoEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SendAccountInfoEvent extends DisplayEvent<SendAccountInfoAction, SendAccountInfoEventHandler>{

	public static Type<SendAccountInfoEventHandler> TYPE = new Type<SendAccountInfoEventHandler>();
	
	public SendAccountInfoEvent(SendAccountInfoAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<SendAccountInfoEventHandler> getAssociatedType()
	{
		return TYPE;
	}
	protected void dispatch(SendAccountInfoEventHandler handler)
	{
		handler.onSendAccountInfo(this);
	}
}
