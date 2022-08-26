package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.ReceiveDeleteMessageAction;
import org.dselent.course_load_scheduler.client.action.SendDeleteMessageAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendDeleteMessageKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;

public class DeleteMessageActionTranslatorImpl implements ActionTranslator<SendDeleteMessageAction, ReceiveDeleteMessageAction>{

	@Override
	public JSONObject translateToJson(SendDeleteMessageAction action) {
		JSONObject jsonObject = new JSONObject();

		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(SendDeleteMessageKeys.ID), action.getId());
		return jsonObject;
	}

	@Override
	public ReceiveDeleteMessageAction translateToAction(JSONObject json) {
		ReceiveDeleteMessageAction action = new ReceiveDeleteMessageAction();
		return action;
	}

}

