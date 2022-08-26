package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveAddInstanceAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveAddInstanceEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveAddInstanceEvent extends DisplayEvent<ReceiveAddInstanceAction, ReceiveAddInstanceEventHandler> {
	public static Type<ReceiveAddInstanceEventHandler> TYPE = new Type<ReceiveAddInstanceEventHandler>();

	public ReceiveAddInstanceEvent(ReceiveAddInstanceAction action, HasWidgets container)
	{
		super(action, container);
	}

	@Override
	public Type<ReceiveAddInstanceEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveAddInstanceEventHandler handler)
	{
		handler.onReceiveAddInstance(this);
	}
}
