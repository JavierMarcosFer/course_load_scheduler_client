package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.GetFacultyEvent;

import com.google.gwt.event.shared.EventHandler;

public interface GetFacultyEventHandler extends EventHandler{
	public void onGetFaculty(GetFacultyEvent fcme);
}
