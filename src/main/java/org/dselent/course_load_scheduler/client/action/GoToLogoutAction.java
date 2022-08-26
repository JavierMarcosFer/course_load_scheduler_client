package org.dselent.course_load_scheduler.client.action;

import com.google.gwt.user.client.Window;

public class GoToLogoutAction extends Action{

	public GoToLogoutAction() {
		Window.Location.replace("https://media.giphy.com/media/o0vwzuFwCGAFO/giphy.gif");

	}

	@Override
	public String toString() {
		return "GoToLogoutAction []";
	}
	
}
