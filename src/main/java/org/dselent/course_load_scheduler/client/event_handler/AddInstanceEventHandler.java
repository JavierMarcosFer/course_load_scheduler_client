package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.AddInstanceEvent;

import com.google.gwt.event.shared.EventHandler;

public interface AddInstanceEventHandler extends EventHandler{
	public void onAddInstance(AddInstanceEvent evt);
}
