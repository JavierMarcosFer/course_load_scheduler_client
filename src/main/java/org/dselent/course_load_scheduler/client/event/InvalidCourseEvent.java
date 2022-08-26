package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidCourseAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidCourseEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class InvalidCourseEvent extends GwtEvent<InvalidCourseEventHandler> {
	
	public static Type<InvalidCourseEventHandler> TYPE = new Type<InvalidCourseEventHandler>();
	
	private InvalidCourseAction action;

	@Override
	public Type<InvalidCourseEventHandler> getAssociatedType() {
		return TYPE;
	}

	public InvalidCourseEvent(InvalidCourseAction action) {
		this.action = action;
	}

	public InvalidCourseAction getAction() {
		return action;
	}

	@Override
	protected void dispatch(InvalidCourseEventHandler handler) {
		handler.onInvalidCourse(this);
	}

}
