package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToAddEditUserAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToAddEditUserEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class GoToAddEditUserEvent extends DisplayEvent<GoToAddEditUserAction, GoToAddEditUserEventHandler> {
	
	public static Type<GoToAddEditUserEventHandler> TYPE = new Type<GoToAddEditUserEventHandler>();
	
	private GoToAddEditUserAction action;

	public GoToAddEditUserEvent(GoToAddEditUserAction action, HasWidgets container) {
		super(action, container);
	}

	public GoToAddEditUserAction getAction() {
		return action;
	}

	@Override
	public Type<GoToAddEditUserEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(GoToAddEditUserEventHandler handler) {
		handler.onGoToAddEditUser(this);
	}

}
