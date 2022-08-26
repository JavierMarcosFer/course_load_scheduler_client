package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveInboxInfoAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveInboxInfoEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveInboxInfoEvent extends DisplayEvent<ReceiveInboxInfoAction, ReceiveInboxInfoEventHandler>{

	public static Type<ReceiveInboxInfoEventHandler> TYPE = new Type<ReceiveInboxInfoEventHandler>();
	
	public ReceiveInboxInfoEvent(ReceiveInboxInfoAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<ReceiveInboxInfoEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveInboxInfoEventHandler handler) {
		handler.onReceiveInboxInfo(this);		
	}

}
