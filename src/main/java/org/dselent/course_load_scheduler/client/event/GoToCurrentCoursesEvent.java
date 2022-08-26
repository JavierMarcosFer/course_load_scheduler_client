package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToCurrentCoursesAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToCurrentCoursesEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class GoToCurrentCoursesEvent extends DisplayEvent<GoToCurrentCoursesAction, GoToCurrentCoursesEventHandler> {
	
	public static Type<GoToCurrentCoursesEventHandler> TYPE = new Type<GoToCurrentCoursesEventHandler>();
	
	private GoToCurrentCoursesAction action;

	public GoToCurrentCoursesEvent(GoToCurrentCoursesAction action, HasWidgets container) {
		super(action, container);
	}

	public GoToCurrentCoursesAction getAction() {
		return action;
	}

	@Override
	public Type<GoToCurrentCoursesEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(GoToCurrentCoursesEventHandler handler) {
		handler.onGoToCurrentCourses(this);
	}
	
}
