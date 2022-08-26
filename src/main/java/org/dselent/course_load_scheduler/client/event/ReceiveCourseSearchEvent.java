package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveCourseSearchAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveCourseSearchEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveCourseSearchEvent extends DisplayEvent<ReceiveCourseSearchAction, ReceiveCourseSearchEventHandler> {
	public static Type<ReceiveCourseSearchEventHandler> TYPE = new Type<ReceiveCourseSearchEventHandler>();

	public ReceiveCourseSearchEvent(ReceiveCourseSearchAction action, HasWidgets container)
	{
		super(action, container);
	}

	@Override
	public Type<ReceiveCourseSearchEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveCourseSearchEventHandler handler)
	{
		handler.onReceiveCourseSearch(this);
	}
}
