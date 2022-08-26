package org.dselent.course_load_scheduler.client.model;

import java.util.ArrayList;
import java.util.Date;

public class InboxDto extends Model {
	
	private ArrayList<Integer> id;
	private ArrayList<Integer> inboxUser;
	private ArrayList<Integer> sender;
	private ArrayList<String> subjectLine;
	private ArrayList<String> content;
	private ArrayList<Integer> status;
	private ArrayList<Date> createdAt;
	private ArrayList<Date> updatedAt;
	
	public InboxDto(ArrayList<Integer> id, ArrayList<Integer> inboxUser, ArrayList<Integer> sender,
			ArrayList<String> subjectLine, ArrayList<String> content, ArrayList<Integer> status,
			ArrayList<Date> createdAt, ArrayList<Date> updatedAt) {
		this.id = id;
		this.inboxUser = inboxUser;
		this.sender = sender;
		this.subjectLine = subjectLine;
		this.content = content;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public InboxDto() {}
	public ArrayList<Integer> getId() {
		return id;
	}
	public void setId(ArrayList<Integer> id) {
		this.id = id;
	}
	public ArrayList<Integer> getInboxUser() {
		return inboxUser;
	}
	public void setInboxUser(ArrayList<Integer> inboxUser) {
		this.inboxUser = inboxUser;
	}
	public ArrayList<Integer> getSender() {
		return sender;
	}
	public void setSender(ArrayList<Integer> sender) {
		this.sender = sender;
	}
	public ArrayList<String> getSubjectLine() {
		return subjectLine;
	}
	public void setSubjectLine(ArrayList<String> subjectLine) {
		this.subjectLine = subjectLine;
	}
	public ArrayList<String> getContent() {
		return content;
	}
	public void setContent(ArrayList<String> content) {
		this.content = content;
	}
	public ArrayList<Integer> getStatus() {
		return status;
	}
	public void setStatus(ArrayList<Integer> status) {
		this.status = status;
	}
	public ArrayList<Date> getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(ArrayList<Date> createdAt) {
		this.createdAt = createdAt;
	}
	public ArrayList<Date> getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(ArrayList<Date> updatedAt) {
		this.updatedAt = updatedAt;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((inboxUser == null) ? 0 : inboxUser.hashCode());
		result = prime * result + ((sender == null) ? 0 : sender.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((subjectLine == null) ? 0 : subjectLine.hashCode());
		result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InboxDto other = (InboxDto) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (createdAt == null) {
			if (other.createdAt != null)
				return false;
		} else if (!createdAt.equals(other.createdAt))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inboxUser == null) {
			if (other.inboxUser != null)
				return false;
		} else if (!inboxUser.equals(other.inboxUser))
			return false;
		if (sender == null) {
			if (other.sender != null)
				return false;
		} else if (!sender.equals(other.sender))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (subjectLine == null) {
			if (other.subjectLine != null)
				return false;
		} else if (!subjectLine.equals(other.subjectLine))
			return false;
		if (updatedAt == null) {
			if (other.updatedAt != null)
				return false;
		} else if (!updatedAt.equals(other.updatedAt))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "InboxDto [id=" + id + ", inboxUser=" + inboxUser + ", sender=" + sender + ", subjectLine=" + subjectLine
				+ ", content=" + content + ", status=" + status + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + "]";
	}
	
	
	
}
