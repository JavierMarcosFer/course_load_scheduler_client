package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveDeleteCourseAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveDeleteCourseEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveDeleteCourseEvent extends DisplayEvent<ReceiveDeleteCourseAction, ReceiveDeleteCourseEventHandler> {
	public static Type<ReceiveDeleteCourseEventHandler> TYPE = new Type<ReceiveDeleteCourseEventHandler>();

	public ReceiveDeleteCourseEvent(ReceiveDeleteCourseAction action, HasWidgets container)
	{
		super(action, container);
	}

	@Override
	public Type<ReceiveDeleteCourseEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveDeleteCourseEventHandler handler)
	{
		handler.onReceiveDeleteCourse(this);
	}
}
