package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SaveSectionAction;
import org.dselent.course_load_scheduler.client.event_handler.SaveSectionEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class SaveSectionEvent extends GwtEvent<SaveSectionEventHandler> {
	
	public static Type<SaveSectionEventHandler> TYPE = new Type<SaveSectionEventHandler>();
	
	private  SaveSectionAction action;

	public  SaveSectionEvent(SaveSectionAction action) {
		this.action = action;
	}

	public SaveSectionAction getAction() {
		return action;
	}

	@Override
	public Type<SaveSectionEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(SaveSectionEventHandler handler) {
		handler.onSaveSection(this);
	}

}
