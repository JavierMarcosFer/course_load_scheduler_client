package org.dselent.course_load_scheduler.client.model;

import java.util.ArrayList;

public class CourseInstanceDto extends Model {
	
	private ArrayList<Integer> id;
	private ArrayList<Integer> courseId;
	private ArrayList<String> term;
	private ArrayList<Integer> numSections;
	
	public CourseInstanceDto (ArrayList<Integer> id, ArrayList<Integer> courseId, ArrayList<String> term, ArrayList<Integer> numSections) {
		this.id = id;
		this.courseId = courseId;
		this.term = term;
		this.numSections = numSections;
	}
	
	@Override
	public String toString() {
		return "CourseInstanceDto [id=" + id + ", courseId=" + courseId + ", term=" + term + ", numSections="
				+ numSections + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseId == null) ? 0 : courseId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numSections == null) ? 0 : numSections.hashCode());
		result = prime * result + ((term == null) ? 0 : term.hashCode());
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
		CourseInstanceDto other = (CourseInstanceDto) obj;
		if (courseId == null) {
			if (other.courseId != null)
				return false;
		} else if (!courseId.equals(other.courseId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numSections == null) {
			if (other.numSections != null)
				return false;
		} else if (!numSections.equals(other.numSections))
			return false;
		if (term == null) {
			if (other.term != null)
				return false;
		} else if (!term.equals(other.term))
			return false;
		return true;
	}
	public ArrayList<Integer> getId() {
		return id;
	}
	public void setId(ArrayList<Integer> id) {
		this.id = id;
	}
	public ArrayList<Integer> getCourseId() {
		return courseId;
	}
	public void setCourseId(ArrayList<Integer> courseId) {
		this.courseId = courseId;
	}
	public ArrayList<String> getTerm() {
		return term;
	}
	public void setTerm(ArrayList<String> term) {
		this.term = term;
	}
	public ArrayList<Integer> getNumSections() {
		return numSections;
	}
	public void setNumSections(ArrayList<Integer> numSections) {
		this.numSections = numSections;
	}
	
	
	
	
}
