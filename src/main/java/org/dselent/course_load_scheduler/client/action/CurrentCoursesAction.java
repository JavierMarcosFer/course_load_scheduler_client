package org.dselent.course_load_scheduler.client.action;

public class CurrentCoursesAction extends Action{
	private Integer id;
	
	public CurrentCoursesAction(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CurrentCoursesAction [id=" + id + "]";
	}
	
	
}
