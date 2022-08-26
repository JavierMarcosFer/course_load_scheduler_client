package org.dselent.course_load_scheduler.client.presenter;

public interface FacultyCourseMapPresenter extends BasePresenter {
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void getFaculty();	//Will probably get scrapped
}
