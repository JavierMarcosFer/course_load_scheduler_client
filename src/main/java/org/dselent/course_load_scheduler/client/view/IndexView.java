package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;

import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public interface IndexView extends BaseView<IndexPresenter>
{
	public VerticalPanel getRootPanelvtee();
	public void setRootPanelvtee(VerticalPanel rootPanelvtee);
	public HTMLPanel getRootPanel();
	public void setRootPanel(HTMLPanel rootPanel);
	public AbsolutePanel getAbsolutePanel();
	public void setAbsolutePanel(AbsolutePanel absolutePanel);
	public LayoutPanel getInnerlayoutPanel();
	public void setInnerlayoutPanel(LayoutPanel innerlayoutPanel);
	public Label getIdentification();
	public void setIdentification(Label identification);
	public void setLogoutButton(Button logout);
	public void setHomeButton(Button home);
	public void setViewCurrentClassesButton(Button viewCurrentClasses);
	public LayoutPanel getTopPanel();
	public void setTopPanel(LayoutPanel topPanel);
	public LayoutPanel getMiddlePanel();
	public void setMiddlePanel(LayoutPanel middlePanel);
	public LayoutPanel getBottomPanel();
	public void setBottomPanel(LayoutPanel bottomPanel);
	public void setReportAProblemButton(Button reportAProblem);
	
	
	public Button getHomeButton();
	public Button getLogoutButton();
	public Button getReportAProblemButton();
	public Button getViewCurrentClassesButton();
	
	
	//for the loading image
	public PopupPanel getGlassLoadingPanel();
	public Image getLoadingImage();
	
}
