package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.ArrayList;

import org.dselent.course_load_scheduler.client.action.CurrentCoursesAction;
import org.dselent.course_load_scheduler.client.action.ReceiveCurrentCoursesAction;
import org.dselent.course_load_scheduler.client.model.CourseInstanceDto;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveCurrentCoursesKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.CurrentCoursesKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class CurrentCoursesActionTranslatorImpl implements ActionTranslator<CurrentCoursesAction, ReceiveCurrentCoursesAction>{

	@Override
	public JSONObject translateToJson(CurrentCoursesAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(CurrentCoursesKeys.ID), action.getId());
		
		return jsonObject;
	}
	
	@Override
	public ReceiveCurrentCoursesAction translateToAction(JSONObject json)
	{			
		JSONValue jsonObject = json.get("success");
		JSONObject courseObject = jsonObject.isArray().get(0).isObject();
		
		JSONArray idList = JSONHelper.getArrayValue(courseObject, JSONHelper.convertKeyName(ReceiveCurrentCoursesKeys.ID));
		ArrayList<Integer> ids = new ArrayList<Integer>();
		for (int x = 0; x<idList.size(); x++) {
			Integer value = JSONHelper.getIntValue(idList.get(x).isObject(), JSONHelper.convertKeyName(ReceiveCurrentCoursesKeys.ID));
			ids.add(value);
		}
		
		JSONArray courseIdList = JSONHelper.getArrayValue(courseObject, JSONHelper.convertKeyName(ReceiveCurrentCoursesKeys.COURSE_ID));
		ArrayList<Integer> courseIds = new ArrayList<Integer>();
		for (int x = 0; x<courseIdList.size(); x++) {
			Integer value = JSONHelper.getIntValue(courseIdList.get(x).isObject(), JSONHelper.convertKeyName(ReceiveCurrentCoursesKeys.COURSE_ID));
			courseIds.add(value);
		}
		
		JSONArray termList = JSONHelper.getArrayValue(courseObject, JSONHelper.convertKeyName(ReceiveCurrentCoursesKeys.TERM));
		ArrayList<String> terms = new ArrayList<String>();
		for (int x = 0; x<courseIdList.size(); x++) {
			String value = JSONHelper.getStringValue(termList.get(x).isObject(), JSONHelper.convertKeyName(ReceiveCurrentCoursesKeys.TERM));
			terms.add(value);
		}
		
		JSONArray numSectionList = JSONHelper.getArrayValue(courseObject, JSONHelper.convertKeyName(ReceiveCurrentCoursesKeys.SECTION_NUM));
		ArrayList<Integer> sectionNums = new ArrayList<Integer>();
		for (int x = 0; x<courseIdList.size(); x++) {
			Integer value = JSONHelper.getIntValue(numSectionList.get(x).isObject(), JSONHelper.convertKeyName(ReceiveCurrentCoursesKeys.SECTION_NUM));
			sectionNums.add(value);
		}
		
		CourseInstanceDto results = new CourseInstanceDto(ids, courseIds, terms, sectionNums);
		
		
		ReceiveCurrentCoursesAction action = new ReceiveCurrentCoursesAction(results);	
	
		return action;
		
	}
	
}
