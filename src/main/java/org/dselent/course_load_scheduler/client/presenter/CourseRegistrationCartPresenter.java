package org.dselent.course_load_scheduler.client.presenter;

public interface CourseRegistrationCartPresenter extends BasePresenter{
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void submitCart();
	void removeCourse();
}
