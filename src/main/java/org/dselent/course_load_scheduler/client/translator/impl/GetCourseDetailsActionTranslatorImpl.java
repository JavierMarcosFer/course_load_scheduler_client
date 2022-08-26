package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.GetCourseDetailsAction;
import org.dselent.course_load_scheduler.client.action.ReceiveCourseDetailsAction;
import org.dselent.course_load_scheduler.client.model.DetailedCourseInformation;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveCourseDetailsKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.GetCourseDetailsKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class GetCourseDetailsActionTranslatorImpl implements ActionTranslator<GetCourseDetailsAction, ReceiveCourseDetailsAction>
{
	@Override
	public JSONObject translateToJson(GetCourseDetailsAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(GetCourseDetailsKeys.ID), action.getCourseId());
		
		return jsonObject;
	}
	
	@Override
	public ReceiveCourseDetailsAction translateToAction(JSONObject json)
	{
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		String courseName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveCourseDetailsKeys.NAME));
		String courseNum = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveCourseDetailsKeys.NUMBER));
		Integer level = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ReceiveCourseDetailsKeys.LEVEL));
		Integer expectedPop = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ReceiveCourseDetailsKeys.EXPECTED_POP));
		String days = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveCourseDetailsKeys.DAYS));
		
		DetailedCourseInformation course = new DetailedCourseInformation(courseName, courseNum, level, expectedPop, days);
		
		
		ReceiveCourseDetailsAction action = new ReceiveCourseDetailsAction(course);	
	
		return action;
	}


}
