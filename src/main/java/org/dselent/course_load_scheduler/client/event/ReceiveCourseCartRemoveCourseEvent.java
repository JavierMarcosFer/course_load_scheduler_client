package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveCourseCartRemoveCourseAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveCourseCartRemoveCourseEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveCourseCartRemoveCourseEvent
		extends DisplayEvent<ReceiveCourseCartRemoveCourseAction, ReceiveCourseCartRemoveCourseEventHandler> {
	
	public static Type<ReceiveCourseCartRemoveCourseEventHandler> TYPE = new Type<ReceiveCourseCartRemoveCourseEventHandler>();

	public ReceiveCourseCartRemoveCourseEvent(ReceiveCourseCartRemoveCourseAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<ReceiveCourseCartRemoveCourseEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveCourseCartRemoveCourseEventHandler handler) {
		handler.onReceiveCourseCartRemoveCourseEventHandler(this);
	}

}
