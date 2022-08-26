package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveDeleteUserAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveDeleteUserEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveDeleteUserEvent extends DisplayEvent<ReceiveDeleteUserAction, ReceiveDeleteUserEventHandler> {
	public static Type<ReceiveDeleteUserEventHandler> TYPE = new Type<ReceiveDeleteUserEventHandler>();

	public ReceiveDeleteUserEvent(ReceiveDeleteUserAction action, HasWidgets container)
	{
		super(action, container);
	}

	@Override
	public Type<ReceiveDeleteUserEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveDeleteUserEventHandler handler)
	{
		handler.onReceiveDeleteUser(this);
	}
}
