package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveCurrentCoursesAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveCurrentCoursesEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveCurrentCoursesEvent extends DisplayEvent<ReceiveCurrentCoursesAction, ReceiveCurrentCoursesEventHandler> {
	
	public static Type<ReceiveCurrentCoursesEventHandler> TYPE = new Type<ReceiveCurrentCoursesEventHandler>();

	public ReceiveCurrentCoursesEvent(ReceiveCurrentCoursesAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<ReceiveCurrentCoursesEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveCurrentCoursesEventHandler handler) {
		handler.onReceiveCurrentCourses(this);
	}

}