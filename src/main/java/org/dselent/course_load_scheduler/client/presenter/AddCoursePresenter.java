package org.dselent.course_load_scheduler.client.presenter;

public interface AddCoursePresenter extends BasePresenter{
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void saveChanges();
	void deleteCourse();
	void createInstance();
	void editInstance();
}
