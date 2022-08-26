package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.SaveSectionEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SaveSectionEventHandler extends EventHandler {
	public void onSaveSection(SaveSectionEvent evt);
}
