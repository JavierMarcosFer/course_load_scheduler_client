package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.AddSectionAction;
import org.dselent.course_load_scheduler.client.event_handler.AddSectionEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class AddSectionEvent extends DisplayEvent<AddSectionAction, AddSectionEventHandler>{
	public static Type<AddSectionEventHandler> TYPE = new Type<AddSectionEventHandler>();

	private AddSectionAction action;

	public AddSectionEvent(AddSectionAction action, HasWidgets container)
	{
		super(action, container);
	}

	public AddSectionAction getAction()
	{
		return action;
	}

	@Override
	public Type<AddSectionEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(AddSectionEventHandler handler)
	{
		handler.onAddSection(this);
	}
}
