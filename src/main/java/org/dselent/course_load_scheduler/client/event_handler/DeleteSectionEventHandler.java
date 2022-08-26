package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.DeleteSectionEvent;

import com.google.gwt.event.shared.EventHandler;

public interface DeleteSectionEventHandler extends EventHandler{
	public void onDeleteSection(DeleteSectionEvent evt);
}
