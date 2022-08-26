package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.SaveInstanceEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SaveInstanceEventHandler extends EventHandler {
	public void onSaveInstance(SaveInstanceEvent evt);
}
