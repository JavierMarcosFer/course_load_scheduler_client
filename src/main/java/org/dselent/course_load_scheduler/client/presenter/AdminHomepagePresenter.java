package org.dselent.course_load_scheduler.client.presenter;

import org.dselent.course_load_scheduler.client.event.ReceiveInboxInfoEvent;

public interface AdminHomepagePresenter extends BasePresenter
{
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void goToAddCourse();
	void goToAddUser();
	void goToAcctInfo();
	void goToEditUser();
	void goToModifyCourse();
	void goToCurrentClasses();
	void goToSearchClasses();
	void goToCart();
	void onReceiveInboxInfo(ReceiveInboxInfoEvent evt);
}
