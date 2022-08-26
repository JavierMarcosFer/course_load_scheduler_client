package org.dselent.course_load_scheduler.client.action;

import java.util.ArrayList;
import java.util.List;

public class InvalidCourseIdAction extends Action {
	
	private List<String> reasonList;
	
	public InvalidCourseIdAction (ArrayList<String> reasonList)
	{
		this.reasonList = reasonList;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(String reason : reasonList)
		{
			sb.append(reason);
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	public boolean addReasons(ArrayList<String> reasonList)
	{
		return reasonList.addAll(reasonList);
	}
	
	public void addReason(String reason)
	{
		reasonList.add(reason);
	}
	
	public List<String> getReason() {
		return reasonList;
	}
	
	public String getReason(int index)
	{
		return reasonList.get(index);
	}
	
	public int getNumberOfReasons()
	{
		return reasonList.size();
	}
	
}
