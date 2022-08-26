package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.SendReportAction;
import org.dselent.course_load_scheduler.client.action.ReceiveReportAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.ReportProblemKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;

public class ReportProblemActionTranslatorImpl implements ActionTranslator<SendReportAction, ReceiveReportAction> {

	@Override
	public JSONObject translateToJson(SendReportAction action) {
		JSONObject jsonObject = new JSONObject();
		
//		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(ReportProblemKeys.EMAIL), action.getEmail());
//		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(ReportProblemKeys.NAME), action.getName());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(ReportProblemKeys.TYPE), action.getType());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(ReportProblemKeys.DESCRIPTION), action.getDescription());
		
		return jsonObject;
	}

	@Override
	public ReceiveReportAction translateToAction(JSONObject json) {

		ReceiveReportAction action = new ReceiveReportAction();
		
		return action;
	}

}
