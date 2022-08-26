package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToEditSectionAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToEditSectionEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class GoToEditSectionEvent extends DisplayEvent<GoToEditSectionAction, GoToEditSectionEventHandler>{
	public static Type<GoToEditSectionEventHandler> TYPE = new Type<GoToEditSectionEventHandler>();

	private GoToEditSectionAction action;
	
	public GoToEditSectionEvent(GoToEditSectionAction action, HasWidgets container) {
		super(action, container);
	}
	
	public GoToEditSectionAction getAction() {
		return action;
	}

	@Override
	public Type<GoToEditSectionEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(GoToEditSectionEventHandler handler)
	{
		handler.onGoToEditSection(this);
	}
}
