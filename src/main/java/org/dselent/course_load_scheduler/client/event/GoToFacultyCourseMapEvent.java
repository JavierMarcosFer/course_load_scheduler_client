package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToFacultyCourseMapAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToFacultyCourseMapEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class GoToFacultyCourseMapEvent extends DisplayEvent<GoToFacultyCourseMapAction, GoToFacultyCourseMapEventHandler>{
	public static Type<GoToFacultyCourseMapEventHandler> TYPE = new Type<GoToFacultyCourseMapEventHandler>();

	private GoToFacultyCourseMapAction action;
	
	public GoToFacultyCourseMapEvent(GoToFacultyCourseMapAction action, HasWidgets container) {
		super(action, container);
	}
	
	public GoToFacultyCourseMapAction getAction() {
		return action;
	}

	@Override
	public Type<GoToFacultyCourseMapEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(GoToFacultyCourseMapEventHandler handler)
	{
		handler.onGoToFacultyCourseMap(this);
	}
}
