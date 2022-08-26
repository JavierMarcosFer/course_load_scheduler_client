package org.dselent.course_load_scheduler.client.presenter;

public interface InstructorHomepagePresenter extends BasePresenter {
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	public void currentClasses();
	public void classSearch();
	public void accountInfo();
	public void courseCart();
	public void facultyCourseMap();
	//public void generateSchedule();
}
