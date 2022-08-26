package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.IndexView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class IndexViewImpl extends BaseViewImpl<IndexPresenter> implements IndexView
{
	private static IndexViewImplUiBinder uiBinder = GWT.create(IndexViewImplUiBinder.class);
	
	@UiField VerticalPanel rootPanelvtee;
	@UiField HTMLPanel rootPanel;
	@UiField AbsolutePanel absolutePanel;
	@UiField LayoutPanel innerlayoutPanel;
	@UiField Label identification;
	@UiField Button logoutButton;
	@UiField Button homeButton;
	@UiField Button viewCurrentClassesButton;
	@UiField LayoutPanel middlePanel;
	@UiField LayoutPanel bottomPanel;
	@UiField Button reportAProblemButton;
	@UiField LayoutPanel topPanel;
	
	interface IndexViewImplUiBinder extends UiBinder<Widget, IndexViewImpl> {}

	public IndexViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));		
	}
	
	@Override
	public void setPresenter(IndexPresenter presenter) {
		this.presenter = presenter;
		
	}

	public VerticalPanel getRootPanelvtee() {
		return rootPanelvtee;
	}

	public void setRootPanelvtee(VerticalPanel rootPanelvtee) {
		this.rootPanelvtee = rootPanelvtee;
	}

	public HTMLPanel getRootPanel() {
		return rootPanel;
	}

	public void setRootPanel(HTMLPanel rootPanel) {
		this.rootPanel = rootPanel;
	}

	public AbsolutePanel getAbsolutePanel() {
		return absolutePanel;
	}

	public void setAbsolutePanel(AbsolutePanel absolutePanel) {
		this.absolutePanel = absolutePanel;
	}

	public LayoutPanel getInnerlayoutPanel() {
		return innerlayoutPanel;
	}

	public void setInnerlayoutPanel(LayoutPanel innerlayoutPanel) {
		this.innerlayoutPanel = innerlayoutPanel;
	}

	public Label getIdentification() {
		return identification;
	}

	public void setIdentification(Label identification) {
		this.identification = identification;
	}

	public Button getLogoutButton() {
		return logoutButton;
	}

	public void setLogoutButton(Button logout) {
		this.logoutButton = logout;
	}

	public Button getHomeButton() {
		return homeButton;
	}

	public void setHomeButton(Button home) {
		this.homeButton = home;
	}

	public Button getViewCurrentClassesButton() {
		return viewCurrentClassesButton;
	}

	public void setViewCurrentClassesButton(Button viewCurrentClasses) {
		this.viewCurrentClassesButton = viewCurrentClasses;
	}

	public LayoutPanel getTopPanel() {
		return topPanel;
	}

	public void setTopPanel(LayoutPanel topPanel) {
		this.topPanel = topPanel;
	}

	public LayoutPanel getMiddlePanel() {
		return middlePanel;
	}

	public void setMiddlePanel(LayoutPanel middlePanel) {
		this.middlePanel = middlePanel;
	}

	public LayoutPanel getBottomPanel() {
		return bottomPanel;
	}

	public void setBottomPanel(LayoutPanel bottomPanel) {
		this.bottomPanel = bottomPanel;
	}

	public Button getReportAProblemButton() {
		return reportAProblemButton;
	}

	public void setReportAProblemButton(Button reportAProblem) {
		this.reportAProblemButton = reportAProblem;
	}
	
	@UiHandler("homeButton")
	void onHomeButtonClicked(ClickEvent evt) {
		presenter.home();
	}
	
	@UiHandler("logoutButton")
	void onClassSearchButtonClicked(ClickEvent evt) {
		presenter.logout();
	}
	
	@UiHandler("reportAProblemButton")
	void onAccountInfoButtonClicked(ClickEvent evt) {
		presenter.reportAProblem();
	}
	
	@UiHandler("viewCurrentClassesButton")
	void onCourseCartButtonClicked(ClickEvent evt) {
		presenter.currentClasses();
	}
	
	
	// Part of the template code from Doug:
	// Not necessary for now, but keep it for reference


	@Override
	public PopupPanel getGlassLoadingPanel()
	{
		return null; //glassLoadingPanel;
	}
	
	@Override
	public Image getLoadingImage()
	{
		return null; //loadingImage;
	}
	
	@Override
	public Widget getWidgetContainer()
	{
		return this;
	}
	
	@Override
	public HasWidgets getViewRootPanel()
	{
		return middlePanel;
	}
}
