package org.dselent.course_load_scheduler.client.presenter;

import org.dselent.course_load_scheduler.client.event.ReceiveAccountInfoEvent;

public interface AccountInfoPresenter extends BasePresenter{
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void changeAccountInfo();
	void onReceiveAccountInfo(ReceiveAccountInfoEvent evt);
	void submitChanges();
}
