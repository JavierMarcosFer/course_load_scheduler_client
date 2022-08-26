package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CurrentCoursesAction;
import org.dselent.course_load_scheduler.client.event_handler.CurrentCoursesEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class CurrentCoursesEvent extends DisplayEvent<CurrentCoursesAction, CurrentCoursesEventHandler>{
	public static Type<CurrentCoursesEventHandler> TYPE = new Type<CurrentCoursesEventHandler>();

	private CurrentCoursesAction action;

	public CurrentCoursesEvent(CurrentCoursesAction action, HasWidgets container)
	{
		super(action, container);
	}

	public CurrentCoursesAction getAction()
	{
		return action;
	}
	@Override
	public Type<CurrentCoursesEventHandler> getAssociatedType()
	{
		return TYPE;
	}
	@Override
	protected void dispatch(CurrentCoursesEventHandler handler)
	{
		handler.onCurrentCourses(this);
	}
}
