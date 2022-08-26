package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class TestPanels extends Composite {

	private static TestPanelsUiBinder uiBinder = GWT.create(TestPanelsUiBinder.class);

	interface TestPanelsUiBinder extends UiBinder<Widget, TestPanels> {
	}

	public TestPanels() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
