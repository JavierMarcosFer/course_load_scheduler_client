package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseSearchAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseSearchEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class CourseSearchEvent extends DisplayEvent<CourseSearchAction, CourseSearchEventHandler>{
	public static Type<CourseSearchEventHandler> TYPE = new Type<CourseSearchEventHandler>();

	private CourseSearchAction action;

	public CourseSearchEvent(CourseSearchAction action, HasWidgets container)
	{
		super(action, container);
	}

	public CourseSearchAction getAction()
	{
		return action;
	}
	@Override
	public Type<CourseSearchEventHandler> getAssociatedType()
	{
		return TYPE;
	}
	@Override
	protected void dispatch(CourseSearchEventHandler handler)
	{
		handler.onCourseSearch(this);
	}
}