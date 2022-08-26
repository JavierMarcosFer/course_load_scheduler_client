package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.AddCourseAction;
import org.dselent.course_load_scheduler.client.event_handler.AddCourseEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class AddCourseEvent extends DisplayEvent<AddCourseAction, AddCourseEventHandler>{
	public static Type<AddCourseEventHandler> TYPE = new Type<AddCourseEventHandler>();
	private AddCourseAction action;

	public AddCourseEvent(AddCourseAction action, HasWidgets container)
	{
		super(action, container);
	}

	public AddCourseAction getAction()
	{
		return action;
	}
	public Type<AddCourseEventHandler> getAssociatedType()
	{
		return TYPE;
	}
	protected void dispatch(AddCourseEventHandler handler)
	{
		handler.onAddCourse(this);
	}
}
