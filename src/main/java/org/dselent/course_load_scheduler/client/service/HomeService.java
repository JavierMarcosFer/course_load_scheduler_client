package org.dselent.course_load_scheduler.client.service;

import org.dselent.course_load_scheduler.client.event.SendDeleteMessageEvent;
import org.dselent.course_load_scheduler.client.event.SendReportEvent;
import org.dselent.course_load_scheduler.client.event.SendRespondMessageEvent;

public interface HomeService extends BaseService{
	void onReportProblem(SendReportEvent evt);
	
	void onDeleteMessage(SendDeleteMessageEvent evt);
	
	void onRespondMessage(SendRespondMessageEvent evt);
}
