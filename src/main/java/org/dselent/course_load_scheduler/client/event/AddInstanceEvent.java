package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.AddInstanceAction;
import org.dselent.course_load_scheduler.client.event_handler.AddInstanceEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class AddInstanceEvent extends DisplayEvent<AddInstanceAction, AddInstanceEventHandler>{
	public static Type<AddInstanceEventHandler> TYPE = new Type<AddInstanceEventHandler>();
	private AddInstanceAction action;

	public AddInstanceEvent(AddInstanceAction action, HasWidgets container)
	{
		super(action, container);
	}

	public AddInstanceAction getAction()
	{
		return action;
	}
	public Type<AddInstanceEventHandler> getAssociatedType()
	{
		return TYPE;
	}
	protected void dispatch(AddInstanceEventHandler handler)
	{
		handler.onAddInstance(this);
	}
}
