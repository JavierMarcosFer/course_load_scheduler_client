/**
 * 
 */
package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.InvalidReportEvent;

import com.google.gwt.event.shared.EventHandler;

/**
 * @author bobbyshome
 *
 */
public interface InvalidReportEventHandler extends EventHandler {
	public void onInvalidReport(InvalidReportEvent evt);
}
