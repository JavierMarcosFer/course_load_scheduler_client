


//****PANHA: BACKUP?????????? Contact panha for explanation*****


//package org.dselent.course_load_scheduler.client.view.impl;
//
//import org.dselent.course_load_scheduler.client.presenter.AccountInfoPresenter;
//import org.dselent.course_load_scheduler.client.view.AccountInfoView;
//
//import com.google.gwt.core.client.GWT;
//import com.google.gwt.uibinder.client.UiBinder;
//import com.google.gwt.uibinder.client.UiField;
//import com.google.gwt.user.client.ui.Button;
//import com.google.gwt.user.client.ui.FlexTable;
//import com.google.gwt.user.client.ui.HTMLPanel;
//import com.google.gwt.user.client.ui.HasWidgets;
//import com.google.gwt.user.client.ui.IntegerBox;
//import com.google.gwt.user.client.ui.LayoutPanel;
//import com.google.gwt.user.client.ui.PasswordTextBox;
//import com.google.gwt.user.client.ui.RootPanel;
//import com.google.gwt.user.client.ui.TextBox;
//import com.google.gwt.user.client.ui.Widget;
//
//public class AccountInfoViewImpl2 extends BaseViewImpl<AccountInfoPresenter> implements AccountInfoView{
//
//	private static AccountInfoUiBinder uiBinder = GWT.create(AccountInfoUiBinder.class);
//	
//	@UiField HTMLPanel rootPanel;
//	@UiField TextBox AccountInfoPgTitle;
//	@UiField LayoutPanel AccountInfoBaseLayoutPanel;
//	@UiField Button submitChangesButton;
//	@UiField FlexTable AccountInfoFlexTable = new FlexTable();
//	@UiField HTMLPanel FlexPanel;
//	
//	public FlexTable getAccountInfoFlexTable() {
//		return AccountInfoFlexTable;
//	}
//
//	public void setAccountInfoFlexTable(FlexTable accountInfoFlexTable) {
//		AccountInfoFlexTable = accountInfoFlexTable;
//	}
//
//	public HTMLPanel getFlexPanel() {
//		return FlexPanel;
//	}
//
//	public void setFlexPanel(HTMLPanel flexPanel) {
//		FlexPanel = flexPanel;
//	}
//
//	private PasswordTextBox currPassword;
//	private PasswordTextBox newPassword;
//	private PasswordTextBox repeatNewPassword;
//	private TextBox preferedEmail;
//	private IntegerBox phoneNumber;
//	private String userName;
//	private String email;
//	private Integer requirement;
//	
//	
//
//	public Button getSubmitChangesButton() {
//		return submitChangesButton;
//	}
//	
//	public PasswordTextBox getCurrPassword() {
//		return currPassword;
//	}
//	
//	public PasswordTextBox getNewPassword() {
//		return newPassword;
//	}
//	
//	public PasswordTextBox getRepeatNewPassword() {
//		return repeatNewPassword;
//	}
//	
//	public TextBox getPreferedEmail() {
//		return preferedEmail;
//	}
//	
//	public IntegerBox getPhoneNumber() {
//		return phoneNumber;
//	}
//	
//	interface AccountInfoUiBinder extends UiBinder<Widget, AccountInfoViewImpl> {
//	}
//	
//	public AccountInfoViewImpl2() {
//		initWidget(uiBinder.createAndBindUi(this));
//	
//	    currPassword = new PasswordTextBox();
//	    newPassword = new PasswordTextBox();
//	    repeatNewPassword = new PasswordTextBox();
//	    preferedEmail = new TextBox();
//	    phoneNumber = new IntegerBox();
//
//	    // Create the text fields (This table is a 10x10)
//	    AccountInfoFlexTable.setText(0, 0, "Your username is:");
//	    AccountInfoFlexTable.setText(0, 1, userName);
//	    AccountInfoFlexTable.setText(1, 0, "Your WPI email is:");
//	    AccountInfoFlexTable.setText(1, 1, email);
//	    AccountInfoFlexTable.setText(2, 0, "Your minimum teaching requirement (course hours) is:");
//	    AccountInfoFlexTable.setText(6, 0, "Change password:");
//	    AccountInfoFlexTable.setText(8, 0, "Prefered email (optional):");
//	    AccountInfoFlexTable.setText(10, 0, "Phone number (optional):");
//	    
//	    // Create the widgets
//	    AccountInfoFlexTable.setWidget(6, 2, currPassword);
//	    AccountInfoFlexTable.setWidget(6, 3, newPassword);
//	    AccountInfoFlexTable.setWidget(6, 4, repeatNewPassword);
//	    
//	    AccountInfoFlexTable.setWidget(8, 2, preferedEmail);
//	    AccountInfoFlexTable.setWidget(10, 2, phoneNumber);
//
//	    //RootPanel.get().add(AccountInfoFlexTable);
//	    //AccountInfoBaseLayoutPanel.add(AccountInfoFlexTable);
//	}
//
//	@Override
//	public Widget getWidgetContainer()
//	{
//		return this;
//	}
//	
//	@Override
//	public HasWidgets getViewRootPanel()
//	{
//		return rootPanel;
//	}
//	
//	@Override
//	public void setPresenter(AccountInfoPresenter presenter)
//	{
//		this.presenter = presenter;
//	}
//
//	@Override
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//	@Override
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	@Override
//	public void setRequirement(Integer requirement) {
//		this.requirement = requirement;
//	}
//
//	//
//	public static AccountInfoUiBinder getUiBinder() {
//		return uiBinder;
//	}
//
//	public static void setUiBinder(AccountInfoUiBinder uiBinder) {
//		AccountInfoViewImpl.uiBinder = uiBinder;
//	}
//
//	public HTMLPanel getRootPanel() {
//		return rootPanel;
//	}
//
//	public void setRootPanel(HTMLPanel rootPanel) {
//		this.rootPanel = rootPanel;
//	}
//
//	public TextBox getAccountInfoPgTitle() {
//		return AccountInfoPgTitle;
//	}
//
//	public void setAccountInfoPgTitle(TextBox accountInfoPgTitle) {
//		AccountInfoPgTitle = accountInfoPgTitle;
//	}
//
//	public LayoutPanel getAccountInfoBaseLayoutPanel() {
//		return AccountInfoBaseLayoutPanel;
//	}
//
//	public void setAccountInfoBaseLayoutPanel(LayoutPanel accountInfoBaseLayoutPanel) {
//		AccountInfoBaseLayoutPanel = accountInfoBaseLayoutPanel;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public Integer getRequirement() {
//		return requirement;
//	}
//
//	public void setSubmitChangesButton(Button submitChangesButton) {
//		this.submitChangesButton = submitChangesButton;
//	}
//
//	public void setCurrPassword(PasswordTextBox currPassword) {
//		this.currPassword = currPassword;
//	}
//
//	public void setNewPassword(PasswordTextBox newPassword) {
//		this.newPassword = newPassword;
//	}
//
//	public void setRepeatNewPassword(PasswordTextBox repeatNewPassword) {
//		this.repeatNewPassword = repeatNewPassword;
//	}
//
//	public void setPreferedEmail(TextBox preferedEmail) {
//		this.preferedEmail = preferedEmail;
//	}
//
//	public void setPhoneNumber(IntegerBox phoneNumber) {
//		this.phoneNumber = phoneNumber;
//	}	
//}
