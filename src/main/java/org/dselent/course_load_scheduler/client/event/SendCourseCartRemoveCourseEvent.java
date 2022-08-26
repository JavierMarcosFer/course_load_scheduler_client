package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendCourseCartRemoveCourseAction;
import org.dselent.course_load_scheduler.client.event_handler.SendCourseCartRemoveCourseEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SendCourseCartRemoveCourseEvent
		extends DisplayEvent<SendCourseCartRemoveCourseAction, SendCourseCartRemoveCourseEventHandler> {
	public static Type<SendCourseCartRemoveCourseEventHandler> TYPE = new Type<SendCourseCartRemoveCourseEventHandler>();

	public SendCourseCartRemoveCourseEvent(SendCourseCartRemoveCourseAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<SendCourseCartRemoveCourseEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(SendCourseCartRemoveCourseEventHandler handler) {
		handler.onCartRemoveCourse(this);
	}

}
