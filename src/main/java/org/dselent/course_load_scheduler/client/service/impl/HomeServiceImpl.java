package org.dselent.course_load_scheduler.client.service.impl;

import org.dselent.course_load_scheduler.client.action.SendDeleteMessageAction;
import org.dselent.course_load_scheduler.client.action.SendReportAction;
import org.dselent.course_load_scheduler.client.action.SendRespondMessageAction;
import org.dselent.course_load_scheduler.client.callback.DeleteMessageCallback;
import org.dselent.course_load_scheduler.client.callback.RespondMessageCallback;
import org.dselent.course_load_scheduler.client.callback.SendReportCallback;
import org.dselent.course_load_scheduler.client.event.SendDeleteMessageEvent;
import org.dselent.course_load_scheduler.client.event.SendReportEvent;
import org.dselent.course_load_scheduler.client.event.SendRespondMessageEvent;
import org.dselent.course_load_scheduler.client.network.NetworkRequest;
import org.dselent.course_load_scheduler.client.network.NetworkRequestStrings;
import org.dselent.course_load_scheduler.client.service.HomeService;
import org.dselent.course_load_scheduler.client.translator.impl.DeleteMessageActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.ReportProblemActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.RespondMessageActionTranslatorImpl;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.json.client.JSONObject;

public class HomeServiceImpl extends BaseServiceImpl implements HomeService{
	public HomeServiceImpl() {}
	
	@Override
	public void init()
	{
		bind();
	}

	@Override
	public void bind()
	{
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(SendReportEvent.TYPE, this);
		eventBusRegistration.put(SendReportEvent.TYPE, registration);
		
		registration = eventBus.addHandler(SendDeleteMessageEvent.TYPE, this);
		eventBusRegistration.put(SendDeleteMessageEvent.TYPE, registration);
		
		registration = eventBus.addHandler(SendRespondMessageEvent.TYPE, this);
		eventBusRegistration.put(SendRespondMessageEvent.TYPE, registration);
	}
	
	public void onReportProblem(SendReportEvent evt) {
		SendReportAction action = evt.getAction();
		ReportProblemActionTranslatorImpl sendReportActionTranslator = new ReportProblemActionTranslatorImpl();
		JSONObject json = sendReportActionTranslator.translateToJson(action);
		SendReportCallback sendReportCallback = new SendReportCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.REPORT_PROBLEM, sendReportCallback, json);
		request.send();
	}
	
	public void onDeleteMessage(SendDeleteMessageEvent evt) {
		SendDeleteMessageAction action = evt.getAction();
		DeleteMessageActionTranslatorImpl deleteMessageActionTranslator = new DeleteMessageActionTranslatorImpl();
		JSONObject json = deleteMessageActionTranslator.translateToJson(action);
		DeleteMessageCallback deleteMessageCallback = new DeleteMessageCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.DELETE_MESSAGE, deleteMessageCallback, json);
		request.send();
	}

	@Override
	public void onRespondMessage(SendRespondMessageEvent evt) {
		SendRespondMessageAction action = evt.getAction();
		RespondMessageActionTranslatorImpl deleteMessageActionTranslator = new RespondMessageActionTranslatorImpl();
		JSONObject json = deleteMessageActionTranslator.translateToJson(action);
		RespondMessageCallback deleteMessageCallback = new RespondMessageCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.DELETE_MESSAGE, deleteMessageCallback, json);
		request.send();
		
	}
}
