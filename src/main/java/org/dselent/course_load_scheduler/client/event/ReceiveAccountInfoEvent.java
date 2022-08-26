package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveAccountInfoAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveAccountInfoEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveAccountInfoEvent extends DisplayEvent<ReceiveAccountInfoAction, ReceiveAccountInfoEventHandler>{

	public static Type<ReceiveAccountInfoEventHandler> TYPE = new Type<ReceiveAccountInfoEventHandler>();
	
	public ReceiveAccountInfoEvent(ReceiveAccountInfoAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<ReceiveAccountInfoEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveAccountInfoEventHandler handler) {
		handler.onReceiveAccountInfo(this);		
	}

}