package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveUpdateAccountInfoAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveUpdateAccountInfoEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveUpdateAccountInfoEvent extends DisplayEvent<ReceiveUpdateAccountInfoAction, ReceiveUpdateAccountInfoEventHandler> {
	
	public static Type<ReceiveUpdateAccountInfoEventHandler> TYPE = new Type<ReceiveUpdateAccountInfoEventHandler>();
	
	public ReceiveUpdateAccountInfoEvent(ReceiveUpdateAccountInfoAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<ReceiveUpdateAccountInfoEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveUpdateAccountInfoEventHandler handler) {
		handler.onReceiveUpdateAccountInfo(this);
	}

}
