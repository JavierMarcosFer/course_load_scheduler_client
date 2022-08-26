package org.dselent.course_load_scheduler.client.action;

public class SendLoginAction extends Action
{
	private String username;
	private String password;
	
	public SendLoginAction(String username, String password)
	{
		this.username = username;
		this.password = password;
	}

	public String getUserName()
	{
		return username;
	}

	public String getPassword()
	{
		return password;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("SendLoginAction [username=");
		builder.append(username);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}
}
