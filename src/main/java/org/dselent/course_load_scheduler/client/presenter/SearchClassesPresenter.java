package org.dselent.course_load_scheduler.client.presenter;

public interface SearchClassesPresenter extends BasePresenter{
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	public void searchCourses();
}
