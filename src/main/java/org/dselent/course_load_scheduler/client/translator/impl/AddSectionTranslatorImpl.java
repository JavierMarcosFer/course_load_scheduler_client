package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.AddSectionAction;
import org.dselent.course_load_scheduler.client.action.ReceiveAddSectionAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.AddSectionKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;

public class AddSectionTranslatorImpl implements ActionTranslator<AddSectionAction, ReceiveAddSectionAction>{

	@Override
	public JSONObject translateToJson(AddSectionAction action) {
		JSONObject jsonObject = new JSONObject();

		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(AddSectionKeys.COURSE_NUMBER), action.getCourseNumber());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(AddSectionKeys.INSTANCE_NUMBER), action.getInstanceNumber());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(AddSectionKeys.EXPECTED_POP), action.getExpectedPop());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(AddSectionKeys.LECTURE_TYPE), action.getLectureType());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(AddSectionKeys.DAYS), action.getDays());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(AddSectionKeys.TIME_START), action.getTimeStart());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(AddSectionKeys.TIME_END), action.getTimeEnd ());

		return jsonObject;
	}

	@Override
	public ReceiveAddSectionAction translateToAction(JSONObject json) {
		ReceiveAddSectionAction action = new ReceiveAddSectionAction();
		return action;
	}

}
