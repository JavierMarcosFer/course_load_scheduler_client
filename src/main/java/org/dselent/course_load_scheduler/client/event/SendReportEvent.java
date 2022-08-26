package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendReportAction;
import org.dselent.course_load_scheduler.client.event_handler.SendReportEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SendReportEvent extends DisplayEvent<SendReportAction, SendReportEventHandler> {
	
	public static Type<SendReportEventHandler> TYPE = new Type<SendReportEventHandler>();
	
	private SendReportAction action;
	
	public SendReportEvent(SendReportAction action, HasWidgets container) {
		super(action, container);
		this.action = action;
	}

	public SendReportAction getAction() {
		return action;
	}

	@Override
	public Type<SendReportEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(SendReportEventHandler handler) {
		handler.onSendReport(this);
	}

}
