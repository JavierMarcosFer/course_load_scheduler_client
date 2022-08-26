/**
 * 
 */
package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.SendReportEvent;

import com.google.gwt.event.shared.EventHandler;

/**
 * @author bobbyshome
 *
 */
public interface SendReportEventHandler extends EventHandler {
	public void onSendReport(SendReportEvent evt);
}
