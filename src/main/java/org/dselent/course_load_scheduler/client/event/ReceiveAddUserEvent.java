package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveAddUserAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveAddUserEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveAddUserEvent extends DisplayEvent<ReceiveAddUserAction, ReceiveAddUserEventHandler> {
	public static Type<ReceiveAddUserEventHandler> TYPE = new Type<ReceiveAddUserEventHandler>();

	public ReceiveAddUserEvent(ReceiveAddUserAction action, HasWidgets container)
	{
		super(action, container);
	}

	@Override
	public Type<ReceiveAddUserEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveAddUserEventHandler handler)
	{
		handler.onReceiveAddUser(this);
	}
}