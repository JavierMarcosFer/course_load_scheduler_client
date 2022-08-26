package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.DeleteSectionAction;
import org.dselent.course_load_scheduler.client.event_handler.DeleteSectionEventHandler;
import com.google.gwt.event.shared.GwtEvent;

public class DeleteSectionEvent extends GwtEvent<DeleteSectionEventHandler> {
	
	public static Type<DeleteSectionEventHandler> TYPE = new Type<DeleteSectionEventHandler>();
	
	private DeleteSectionAction action;

	public DeleteSectionEvent(DeleteSectionAction action) {
		this.action = action;
	}

	public DeleteSectionAction getAction() {
		return action;
	}

	@Override
	public Type<DeleteSectionEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(DeleteSectionEventHandler handler) {
		handler.onDeleteSection(this);
	}

}
