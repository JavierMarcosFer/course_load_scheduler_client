package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.AddInstanceAction;
import org.dselent.course_load_scheduler.client.action.ReceiveAddInstanceAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.AddInstanceKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;

public class AddInstanceTranslatorImpl implements ActionTranslator<AddInstanceAction, ReceiveAddInstanceAction> {
	
	@Override
	public JSONObject translateToJson(AddInstanceAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(AddInstanceKeys.COURSE_NUMBER), action.getNumber());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(AddInstanceKeys.INSTANCE_NUMBER), action.getInstanceNum());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(AddInstanceKeys.TERM), action.getTerm());
		
		return jsonObject;
	}

	@Override
	public ReceiveAddInstanceAction translateToAction(JSONObject json) {
		
		ReceiveAddInstanceAction action = new ReceiveAddInstanceAction();
		return action;
	}
}
