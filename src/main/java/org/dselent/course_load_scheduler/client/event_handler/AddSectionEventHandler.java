package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.AddSectionEvent;

import com.google.gwt.event.shared.EventHandler;

public interface AddSectionEventHandler extends EventHandler{
	public void onAddSection(AddSectionEvent evt);
}
