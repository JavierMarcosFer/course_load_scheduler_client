package org.dselent.course_load_scheduler.client.view.impl;

import java.util.List;

import org.dselent.course_load_scheduler.client.presenter.ReportProblemPresenter;
import org.dselent.course_load_scheduler.client.view.ReportProblemView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Widget;

public class ReportProblemViewImpl extends BaseViewImpl<ReportProblemPresenter> implements ReportProblemView {

	private static ReportProblemViewImplUiBinder uiBinder = GWT.create(ReportProblemViewImplUiBinder.class);
	@UiField HTMLPanel rootPanel;
	@UiField Label titleLabel;
	@UiField LayoutPanel layoutPanel;
	@UiField ListBox typeList;
	@UiField TextArea descriptionArea;
	@UiField Button submitButton;

	interface ReportProblemViewImplUiBinder extends UiBinder<Widget, ReportProblemViewImpl> {
	}

	public ReportProblemViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		String [] list = {"Select the type of problem","Some of the views are missing","I don't know?","Abusive Chat", "Griefing",
				"Course Problems", "Request a Suggestion"};
		for(String i:list){typeList.addItem(i);}
		
	}

	public ListBox getTypeList() {
		return typeList;
	}

	public void setTypeList(ListBox typeList) {
		this.typeList = typeList;
	}

	public TextArea getDescriptionArea() {
		return descriptionArea;
	}

	public void setDescriptionArea(TextArea descriptionArea) {
		this.descriptionArea = descriptionArea;
	}

	public Button getSubmitButton() {
		return submitButton;
	}

	@Override
	public void setPresenter(ReportProblemPresenter presenter) {
		this.presenter = presenter;
		
	}

	@Override
	public Widget getWidgetContainer() {
		return this;
	}

	@Override
	public HasWidgets getViewRootPanel() {
		return rootPanel;
	}
	
	@UiHandler("submitButton")
	void onSubmitButtonClicked(ClickEvent evt) {
		presenter.submitReport();
	}
}
