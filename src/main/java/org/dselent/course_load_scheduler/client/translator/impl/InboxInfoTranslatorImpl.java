package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.ArrayList;
import java.util.Date;

import org.dselent.course_load_scheduler.client.action.ReceiveInboxInfoAction;
import org.dselent.course_load_scheduler.client.action.SendInboxInfoAction;
import org.dselent.course_load_scheduler.client.model.InboxDto;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveInboxInfoKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendInboxInfoKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class InboxInfoTranslatorImpl implements ActionTranslator<SendInboxInfoAction, ReceiveInboxInfoAction>{

	@Override
	public JSONObject translateToJson(SendInboxInfoAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		return jsonObject;
	}
	
	@Override
	public ReceiveInboxInfoAction translateToAction(JSONObject json)
	{		
		JSONValue jsonIdObject = json.get("id");
		JSONObject idObject = jsonIdObject.isArray().get(0).isObject();
		
		JSONArray idList = JSONHelper.getArrayValue(idObject, JSONHelper.convertKeyName(ReceiveInboxInfoKeys.ID));
		ArrayList<Integer> ids = new ArrayList<Integer>();
		for (int x = 0; x<idList.size(); x++) {
			Integer value = JSONHelper.getIntValue(idList.get(x).isObject(), JSONHelper.convertKeyName(ReceiveInboxInfoKeys.ID));
			ids.add(value);
		}
		
		JSONValue jsonUserObject = json.get("inboxUser");
		JSONObject userObject = jsonUserObject.isArray().get(0).isObject();
		
		JSONArray userList = JSONHelper.getArrayValue(userObject, JSONHelper.convertKeyName(ReceiveInboxInfoKeys.INBOX_USER));
		ArrayList<Integer> users = new ArrayList<Integer>();
		for (int x = 0; x<idList.size(); x++) {
			Integer value = JSONHelper.getIntValue(userList.get(x).isObject(), JSONHelper.convertKeyName(ReceiveInboxInfoKeys.INBOX_USER));
			users.add(value);
		}
		
		JSONValue jsonSenderObject = json.get("sender");
		JSONObject senderObject = jsonSenderObject.isArray().get(0).isObject();
		
		JSONArray senderList = JSONHelper.getArrayValue(senderObject, JSONHelper.convertKeyName(ReceiveInboxInfoKeys.SENDER));
		ArrayList<Integer> senders = new ArrayList<Integer>();
		for (int x = 0; x<idList.size(); x++) {
			Integer value = JSONHelper.getIntValue(senderList.get(x).isObject(), JSONHelper.convertKeyName(ReceiveInboxInfoKeys.SENDER));
			senders.add(value);
		}
		
		JSONValue jsonSubjectObject = json.get("subjectLine");
		JSONObject subjectObject = jsonSubjectObject.isArray().get(0).isObject();
		
		JSONArray subjectList = JSONHelper.getArrayValue(subjectObject, JSONHelper.convertKeyName(ReceiveInboxInfoKeys.SUBJECT_LINE));
		ArrayList<String> subjects = new ArrayList<String>();
		for (int x = 0; x<idList.size(); x++) {
			String value = JSONHelper.getStringValue(subjectList.get(x).isObject(), JSONHelper.convertKeyName(ReceiveInboxInfoKeys.SUBJECT_LINE));
			subjects.add(value);
		}
		
		JSONValue jsonContentObject = json.get("content");
		JSONObject contentObject = jsonContentObject.isArray().get(0).isObject();
		
		JSONArray contentList = JSONHelper.getArrayValue(contentObject, JSONHelper.convertKeyName(ReceiveInboxInfoKeys.CONTENT));
		ArrayList<String> contents = new ArrayList<String>();
		for (int x = 0; x<idList.size(); x++) {
			String value = JSONHelper.getStringValue(contentList.get(x).isObject(), JSONHelper.convertKeyName(ReceiveInboxInfoKeys.CONTENT));
			contents.add(value);
		}
		
		JSONValue jsonStatusObject = json.get("status");
		JSONObject statusObject = jsonStatusObject.isArray().get(0).isObject();
		
		JSONArray statusList = JSONHelper.getArrayValue(statusObject, JSONHelper.convertKeyName(ReceiveInboxInfoKeys.STATUS));
		ArrayList<Integer> statuses = new ArrayList<Integer>();
		for (int x = 0; x<idList.size(); x++) {
			Integer value = JSONHelper.getIntValue(statusList.get(x).isObject(), JSONHelper.convertKeyName(ReceiveInboxInfoKeys.STATUS));
			statuses.add(value);
		}
		
		JSONValue jsonCreatedObject = json.get("createdAt");
		JSONObject createdObject = jsonCreatedObject.isArray().get(0).isObject();
		
		JSONArray createdList = JSONHelper.getArrayValue(createdObject, JSONHelper.convertKeyName(ReceiveInboxInfoKeys.CREATED_AT));
		ArrayList<Date> createds = new ArrayList<Date>();
		for (int x = 0; x<idList.size(); x++) {
			Long value = JSONHelper.getLongValue(createdList.get(x).isObject(), JSONHelper.convertKeyName(ReceiveInboxInfoKeys.CREATED_AT));
			createds.add(new Date(value));
		}
		
		JSONValue jsonUpdatedObject = json.get("updatedAt");
		JSONObject updatedObject = jsonUpdatedObject.isArray().get(0).isObject();
		
		JSONArray updatedList = JSONHelper.getArrayValue(updatedObject, JSONHelper.convertKeyName(ReceiveInboxInfoKeys.UPDATED_AT));
		ArrayList<Date> updateds = new ArrayList<Date>();
		for (int x = 0; x<idList.size(); x++) {
			Long value = JSONHelper.getLongValue(updatedList.get(x).isObject(), JSONHelper.convertKeyName(ReceiveInboxInfoKeys.UPDATED_AT));
			updateds.add(new Date(value));
		}
		
		
		InboxDto message = new InboxDto();
		message.setId(ids);
		message.setInboxUser(users);
		message.setSender(senders);
		message.setSubjectLine(subjects);
		message.setContent(contents);
		message.setStatus(statuses);
		message.setCreatedAt(createds);
		message.setUpdatedAt(updateds);
		
		
		ReceiveInboxInfoAction action = new ReceiveInboxInfoAction(message);	
	
		return action;
	}
	
}
