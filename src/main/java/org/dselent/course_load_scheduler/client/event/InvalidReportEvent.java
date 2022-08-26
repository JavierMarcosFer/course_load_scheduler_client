/**
 * 
 */
package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidReportAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidReportEventHandler;

/**
 * @author bobbyshome
 *
 */
public class InvalidReportEvent extends BaseEvent<InvalidReportAction, InvalidReportEventHandler> {
	
	public static Type<InvalidReportEventHandler> TYPE = new Type<InvalidReportEventHandler>();
	
	private InvalidReportAction action;
	
	public InvalidReportEvent(InvalidReportAction action) {
		super(action);
	}
	
	public InvalidReportAction getAction()
	{
		return action;
	}

	@Override
	public Type<InvalidReportEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(InvalidReportEventHandler handler) {
		handler.onInvalidReport(this);
	}

}
