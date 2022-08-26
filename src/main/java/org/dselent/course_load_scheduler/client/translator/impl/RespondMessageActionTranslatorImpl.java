package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.ReceiveRespondMessageAction;
import org.dselent.course_load_scheduler.client.action.SendRespondMessageAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendRespondMessageKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;

public class RespondMessageActionTranslatorImpl implements ActionTranslator<SendRespondMessageAction, ReceiveRespondMessageAction>{

	@Override
	public JSONObject translateToJson(SendRespondMessageAction action) {
		JSONObject jsonObject = new JSONObject();

		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(SendRespondMessageKeys.ID), action.getId());
		return jsonObject;
	}

	@Override
	public ReceiveRespondMessageAction translateToAction(JSONObject json) {
		ReceiveRespondMessageAction action = new ReceiveRespondMessageAction();
		return action;
	}

}
