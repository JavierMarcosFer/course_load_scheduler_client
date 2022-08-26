package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToEditCourseAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToEditCourseEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class GoToEditCourseEvent  extends GwtEvent<GoToEditCourseEventHandler>{
	public static Type<GoToEditCourseEventHandler> TYPE = new Type<GoToEditCourseEventHandler>();

	private GoToEditCourseAction action;
	
	public GoToEditCourseEvent(GoToEditCourseAction action) {
		this.action = action;
	}
	
	public GoToEditCourseAction getAction() {
		return action;
	}

	@Override
	public Type<GoToEditCourseEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(GoToEditCourseEventHandler handler)
	{
		handler.onGoToEditCourse(this);
	}
}
