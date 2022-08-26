package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToDetailedCourseInformationAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToDetailedCourseInformationEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class GoToDetailedCourseInformationEvent
		extends DisplayEvent<GoToDetailedCourseInformationAction, GoToDetailedCourseInformationEventHandler> {
	
	public static Type<GoToDetailedCourseInformationEventHandler> TYPE = new Type<GoToDetailedCourseInformationEventHandler>();

	public GoToDetailedCourseInformationEvent(GoToDetailedCourseInformationAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<GoToDetailedCourseInformationEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(GoToDetailedCourseInformationEventHandler handler) {
		handler.onGoToDetailedCourseInformation(this);
	}

}
