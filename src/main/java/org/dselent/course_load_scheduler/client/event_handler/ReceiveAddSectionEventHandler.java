package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveAddSectionEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveAddSectionEventHandler extends EventHandler{
	public void onReceiveAddSection(ReceiveAddSectionEvent evt);
}
