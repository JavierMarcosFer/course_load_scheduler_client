package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.AddToCartAction;
import org.dselent.course_load_scheduler.client.action.ReceiveAddToCartAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.AddToCartKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;

public class AddToCartActionTranslatorImpl implements ActionTranslator<AddToCartAction, ReceiveAddToCartAction>{

	@Override
	public JSONObject translateToJson(AddToCartAction action) {
		JSONObject jsonObject = new JSONObject();

		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(AddToCartKeys.COURSE_ID), action.getId());
		return jsonObject;
	}

	@Override
	public ReceiveAddToCartAction translateToAction(JSONObject json) {
		ReceiveAddToCartAction action = new ReceiveAddToCartAction();
		return action;
	}

}
