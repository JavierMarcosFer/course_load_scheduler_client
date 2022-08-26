package org.dselent.course_load_scheduler.client.action;

public class CourseSearchAction extends Action {
	private String subject;
	private String term;
	private String level;
	
	public CourseSearchAction(String department, String term, String level) {
		this.subject = department;
		this.term = term;
		this.level = level;
	}

	public String getSubject() {
		return subject;
	}

	public String getTerm() {
		return term;
	}

	public String getLevel() {
		return level;
	}

	@Override
	public String toString() {
		return "CourseSearchAction [subject=" + subject + ", term=" + term + ", level=" + level + "]";
	}
}
