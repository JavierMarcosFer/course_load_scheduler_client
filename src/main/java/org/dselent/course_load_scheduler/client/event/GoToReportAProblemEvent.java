package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToReportAProblemAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToReportAProblemEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class GoToReportAProblemEvent extends DisplayEvent<GoToReportAProblemAction, GoToReportAProblemEventHandler>{

	public static Type<GoToReportAProblemEventHandler> TYPE = new Type<GoToReportAProblemEventHandler>();
	
	private GoToReportAProblemAction action;
	
	public GoToReportAProblemEvent(GoToReportAProblemAction action, HasWidgets container){
		super(action, container);
	}
	
	public GoToReportAProblemAction getAction()
	{
		return action;
	}
	
	@Override
	public Type<GoToReportAProblemEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(GoToReportAProblemEventHandler handler)
	{
		handler.onGoToReportAProblem(this);
	}
	
}
