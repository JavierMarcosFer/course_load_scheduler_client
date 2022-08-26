package org.dselent.course_load_scheduler.client.presenter;

public interface AdminAddEditUserPresenter extends BasePresenter{
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void addUser();
	void editUser();
}
