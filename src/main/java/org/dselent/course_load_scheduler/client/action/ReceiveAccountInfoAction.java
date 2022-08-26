package org.dselent.course_load_scheduler.client.action;

import org.dselent.course_load_scheduler.client.model.ViewAccountInformation;

public class ReceiveAccountInfoAction extends Action{

	private ViewAccountInformation model;

	public ReceiveAccountInfoAction(ViewAccountInformation Model) {
		this.model = Model;
	}

	/**
	 * @return the model
	 */
	public ViewAccountInformation getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "ReceiveAccountInfoAction [model=" + model + "]";
	}
}