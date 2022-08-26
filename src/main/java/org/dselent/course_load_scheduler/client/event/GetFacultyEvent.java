package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GetFacultyAction;
import org.dselent.course_load_scheduler.client.event_handler.GetFacultyEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class GetFacultyEvent extends GwtEvent<GetFacultyEventHandler>{

	public static Type<GetFacultyEventHandler> TYPE = new Type<GetFacultyEventHandler>();
	private GetFacultyAction action;
	
	public GetFacultyEvent(GetFacultyAction fcma) {
		this.action = fcma;
	}
	
	public GetFacultyAction getAction() {
		return action;
	}
	
	@Override
	public Type<GetFacultyEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(GetFacultyEventHandler handler) {
		handler.onGetFaculty(this);
	}

}
