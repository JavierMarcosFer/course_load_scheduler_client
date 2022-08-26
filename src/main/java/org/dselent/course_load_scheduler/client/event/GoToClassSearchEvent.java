package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToClassSearchAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToClassSearchEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class GoToClassSearchEvent extends DisplayEvent<GoToClassSearchAction, GoToClassSearchEventHandler> {
	
	public static Type<GoToClassSearchEventHandler> TYPE =  new Type<GoToClassSearchEventHandler>();
	
	private GoToClassSearchAction action;

	public GoToClassSearchEvent(GoToClassSearchAction action, HasWidgets container) {
		super(action, container);
	}

	public GoToClassSearchAction getAction() {
		return action;
	}

	@Override
	public Type<GoToClassSearchEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(GoToClassSearchEventHandler handler) {
		handler.onGoToClassSearch(this);
	}

}
