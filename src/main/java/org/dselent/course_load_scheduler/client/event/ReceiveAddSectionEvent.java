package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveAddSectionAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveAddSectionEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveAddSectionEvent extends DisplayEvent<ReceiveAddSectionAction, ReceiveAddSectionEventHandler> {
	public static Type<ReceiveAddSectionEventHandler> TYPE = new Type<ReceiveAddSectionEventHandler>();

	public ReceiveAddSectionEvent(ReceiveAddSectionAction action, HasWidgets container)
	{
		super(action, container);
	}

	@Override
	public Type<ReceiveAddSectionEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveAddSectionEventHandler handler)
	{
		handler.onReceiveAddSection(this);
	}
}
