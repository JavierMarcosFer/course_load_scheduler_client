package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveReportAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveReportEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveReportEvent extends DisplayEvent<ReceiveReportAction, ReceiveReportEventHandler> {
	
	public static Type<ReceiveReportEventHandler> TYPE = new Type<ReceiveReportEventHandler>();

	public ReceiveReportEvent(ReceiveReportAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<ReceiveReportEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveReportEventHandler handler) {
		handler.onReceiveReport(this);
	}

}
