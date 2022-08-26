package org.dselent.course_load_scheduler.client.presenter;

public interface DetailedCourseInformationPresenter extends BasePresenter
{
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	//maybe make a method to do something cool - Josue thinking...
	void submitToCart();
	void returnToSearch();
}
