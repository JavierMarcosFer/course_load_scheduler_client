

package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.SearchClassesPresenter;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.ScrollPanel;

public interface SearchClassesView extends BaseView<SearchClassesPresenter>{
	
	public HTMLPanel getRootPanel();
	public void setRootPanel(HTMLPanel rootPanel);
	public LayoutPanel getTopPanel();
	public void setTopPanel(LayoutPanel topPanel);
	public ListBox getTerm();
	public void setTerm(ListBox term);
	public ListBox getSubject();
	public void setSubject(ListBox subject);
	public Button getSearchButton();
	public void setSearchButton(Button searchButton);
	public ListBox getLevel();
	public void setLevel(ListBox level);
	public Grid getGridCourses();
	public void setGridCourses(Grid gridCourses);
	public ScrollPanel getScrollPanel();
	public void setScrollPanel(ScrollPanel scrollPanel);
	public LayoutPanel getBottomPanel();
	public void setBottomPanel(LayoutPanel bottomPanel);
}
