package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.ArrayList;

import org.dselent.course_load_scheduler.client.action.CourseSearchAction;
import org.dselent.course_load_scheduler.client.action.ReceiveCourseSearchAction;
import org.dselent.course_load_scheduler.client.model.CourseInstanceDto;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveCourseSearchKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.CourseSearchKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class CourseSearchTranslatorImpl implements ActionTranslator<CourseSearchAction, ReceiveCourseSearchAction>{

	@Override
	public JSONObject translateToJson(CourseSearchAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(CourseSearchKeys.SUBJECT), action.getSubject());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(CourseSearchKeys.TERM), action.getTerm());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(CourseSearchKeys.LEVEL), action.getLevel());
		
		return jsonObject;
	}
	
	@Override
	public ReceiveCourseSearchAction translateToAction(JSONObject json)
	{			
		JSONValue jsonIdObject = json.get("id");
		JSONObject idObject = jsonIdObject.isArray().get(0).isObject();
		
		JSONArray idList = JSONHelper.getArrayValue(idObject, JSONHelper.convertKeyName(ReceiveCourseSearchKeys.ID));
		ArrayList<Integer> ids = new ArrayList<Integer>();
		for (int x = 0; x<idList.size(); x++) {
			Integer value = JSONHelper.getIntValue(idList.get(x).isObject(), JSONHelper.convertKeyName(ReceiveCourseSearchKeys.ID));
			ids.add(value);
		}
		
		JSONValue jsonCourseIdObject = json.get("courseId");
		JSONObject courseIdObject = jsonCourseIdObject.isArray().get(0).isObject();
		
		JSONArray courseIdList = JSONHelper.getArrayValue(courseIdObject, JSONHelper.convertKeyName(ReceiveCourseSearchKeys.COURSE_ID));
		ArrayList<Integer> courseIds = new ArrayList<Integer>();
		for (int x = 0; x<courseIdList.size(); x++) {
			Integer value = JSONHelper.getIntValue(courseIdList.get(x).isObject(), JSONHelper.convertKeyName(ReceiveCourseSearchKeys.COURSE_ID));
			courseIds.add(value);
		}
		
		JSONValue jsonTermObject = json.get("term");
		JSONObject termObject = jsonTermObject.isArray().get(0).isObject();
		
		JSONArray termList = JSONHelper.getArrayValue(termObject, JSONHelper.convertKeyName(ReceiveCourseSearchKeys.TERM));
		ArrayList<String> terms = new ArrayList<String>();
		for (int x = 0; x<courseIdList.size(); x++) {
			String value = JSONHelper.getStringValue(termList.get(x).isObject(), JSONHelper.convertKeyName(ReceiveCourseSearchKeys.TERM));
			terms.add(value);
		}
		
		JSONValue jsonSectionObject = json.get("sectionNum");
		JSONObject sectionObject = jsonSectionObject.isArray().get(0).isObject();
		
		JSONArray numSectionList = JSONHelper.getArrayValue(sectionObject, JSONHelper.convertKeyName(ReceiveCourseSearchKeys.SECTION_NUM));
		ArrayList<Integer> sectionNums = new ArrayList<Integer>();
		for (int x = 0; x<courseIdList.size(); x++) {
			Integer value = JSONHelper.getIntValue(numSectionList.get(x).isObject(), JSONHelper.convertKeyName(ReceiveCourseSearchKeys.SECTION_NUM));
			sectionNums.add(value);
		}
		
		CourseInstanceDto results = new CourseInstanceDto(ids, courseIds, terms, sectionNums);
		
		
		ReceiveCourseSearchAction action = new ReceiveCourseSearchAction(results);	
	
		return action;
		
	}
	
}
