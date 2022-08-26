package org.dselent.course_load_scheduler.client.model;

import java.sql.Timestamp;

public class CourseSectionsHistory extends Model {
	// attributes
	
	private Integer id;
	private Integer instanceId;
	private Integer sectionNum;
	private Integer expectedPop;
	private Timestamp updatedAt;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(Integer instanceId) {
		this.instanceId = instanceId;
	}

	public Integer getSectionNum() {
		return sectionNum;
	}

	public void setSectionNum(Integer sectionNum) {
		this.sectionNum = sectionNum;
	}

	public Integer getExpectedPop() {
		return expectedPop;
	}

	public void setExpectedPop(Integer expectedPop) {
		this.expectedPop = expectedPop;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expectedPop == null) ? 0 : expectedPop.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((instanceId == null) ? 0 : instanceId.hashCode());
		result = prime * result + ((sectionNum == null) ? 0 : sectionNum.hashCode());
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
		CourseSectionsHistory other = (CourseSectionsHistory) obj;
		if (expectedPop == null) {
			if (other.expectedPop != null)
				return false;
		} else if (!expectedPop.equals(other.expectedPop))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (instanceId == null) {
			if (other.instanceId != null)
				return false;
		} else if (!instanceId.equals(other.instanceId))
			return false;
		if (sectionNum == null) {
			if (other.sectionNum != null)
				return false;
		} else if (!sectionNum.equals(other.sectionNum))
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
		return "CourseSectionsHistory [id=" + id + ", instanceId=" + instanceId + ", sectionNum=" + sectionNum
				+ ", expectedPop=" + expectedPop + ", updatedAt=" + updatedAt + "]";
	}
}
