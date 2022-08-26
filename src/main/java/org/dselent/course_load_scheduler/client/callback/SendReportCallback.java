package org.dselent.course_load_scheduler.client.callback;

import java.util.ArrayList;

import org.dselent.course_load_scheduler.client.action.InvalidReportAction;
import org.dselent.course_load_scheduler.client.action.ReceiveReportAction;
import org.dselent.course_load_scheduler.client.event.InvalidReportEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveReportEvent;
import org.dselent.course_load_scheduler.client.translator.impl.ReportProblemActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class SendReportCallback extends DisplayCallback<JSONValue> {

	public SendReportCallback(SimpleEventBus eventBus, HasWidgets container) {
		super(eventBus, container);
	}

	@Override
	public void onSuccess(JSONValue result) {
		JSONObject json = JSONHelper.getObjectValue(result);
		ReportProblemActionTranslatorImpl ReportProblemActionTranslator = new ReportProblemActionTranslatorImpl();
		ReceiveReportAction action = ReportProblemActionTranslator.translateToAction(json);
		
		ReceiveReportEvent event = new ReceiveReportEvent(action, getContainer());
		eventBus.fireEvent(event);
	}

	public void onFailure(Throwable caught)
	{
		StringBuilder sb = new StringBuilder();
		
		StackTraceElement[] stackTraceElements = caught.getStackTrace();
		for(StackTraceElement stackTraceElement : stackTraceElements)
		{
			sb.append(stackTraceElement.toString());
			sb.append("\n");
		}
		
		ArrayList<String> reasonList = new ArrayList<String>();
		reasonList.add(sb.toString());
		
		InvalidReportAction ila = new InvalidReportAction(reasonList);
		InvalidReportEvent ile = new InvalidReportEvent(ila);
		eventBus.fireEvent(ile);
	}
	
}
