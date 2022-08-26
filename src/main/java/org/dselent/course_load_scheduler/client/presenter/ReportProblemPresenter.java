package org.dselent.course_load_scheduler.client.presenter;

public interface ReportProblemPresenter extends BasePresenter {
	public IndexPresenter getParentPresenter();
	public void setParentPresenter(IndexPresenter parentPresenter);
	public void submitReport();
}
