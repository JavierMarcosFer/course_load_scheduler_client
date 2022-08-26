package org.dselent.course_load_scheduler.client.model;

import java.sql.Timestamp;

public class CourseSchedule extends Model {
	// attributes
	private String type;
	private String meetingDays;
	private Integer timeStart;
	private Integer timeEnd;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Integer id;
	private Integer sectionId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSectionId() {
		return sectionId;
	}
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMeetingDays() {
		return meetingDays;
	}
	public void setMeetingDays(String meetingDays) {
		this.meetingDays = meetingDays;
	}
	public Integer getTimeStart() {
		return timeStart;
	}
	public void setTimeStart(Integer timeStart) {
		this.timeStart = timeStart;
	}
	public Integer getTimeEnd() {
		return timeEnd;
	}
	public void setTimeEnd(Integer timeEnd) {
		this.timeEnd = timeEnd;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
}
