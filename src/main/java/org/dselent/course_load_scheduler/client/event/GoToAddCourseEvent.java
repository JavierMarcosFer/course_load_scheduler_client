package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToAddCourseAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToAddCourseEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class GoToAddCourseEvent extends DisplayEvent<GoToAddCourseAction, GoToAddCourseEventHandler> {
	
	public static Type<GoToAddCourseEventHandler> TYPE = new Type<GoToAddCourseEventHandler>();
	
	private GoToAddCourseAction action;

	public GoToAddCourseEvent(GoToAddCourseAction action, HasWidgets container) {
		super(action, container);
	}

	public GoToAddCourseAction getAction() {
		return action;
	}

	@Override
	public Type<GoToAddCourseEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(GoToAddCourseEventHandler handler) {
		handler.onGoToAddCourse(this);
	}

}
