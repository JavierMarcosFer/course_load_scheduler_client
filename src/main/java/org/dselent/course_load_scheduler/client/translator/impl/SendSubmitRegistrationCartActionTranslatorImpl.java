package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.ReceiveSubmitRegistrationCartAction;
import org.dselent.course_load_scheduler.client.action.SendSubmitRegistrationCartAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SubmitCartKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;

public class SendSubmitRegistrationCartActionTranslatorImpl implements ActionTranslator<SendSubmitRegistrationCartAction, ReceiveSubmitRegistrationCartAction>{

	@Override
	public JSONObject translateToJson(SendSubmitRegistrationCartAction action) {
		JSONObject jsonObject = new JSONObject();

		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(SubmitCartKeys.INSTRUCTOR_ID), action.getInstructorId());
		return jsonObject;
	}

	@Override
	public ReceiveSubmitRegistrationCartAction translateToAction(JSONObject json) {
		ReceiveSubmitRegistrationCartAction action = new ReceiveSubmitRegistrationCartAction();
		return action;
	}

}
