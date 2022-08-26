package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveReportEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveReportEventHandler extends EventHandler {
	public void onReceiveReport (ReceiveReportEvent evt);
}
