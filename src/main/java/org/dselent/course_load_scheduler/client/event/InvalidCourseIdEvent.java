package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidCourseIdAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidCourseIdEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class InvalidCourseIdEvent extends GwtEvent<InvalidCourseIdEventHandler> {
	
	public static Type<InvalidCourseIdEventHandler> TYPE = new Type<InvalidCourseIdEventHandler>();
	
	private InvalidCourseIdAction action;

	public InvalidCourseIdEvent(InvalidCourseIdAction action) {
		this.action = action;
	}

	public InvalidCourseIdAction getAction() {
		return action;
	}

	@Override
	public Type<InvalidCourseIdEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(InvalidCourseIdEventHandler handler) {
		handler.onInvalidCourseId(this);
	}

}
