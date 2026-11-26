package com.day19.p1;

public class User {
	public static int userCount = 0;
	private String userName;
	private String userId;
	private String mobile;
	private String email;
	
	static {
		System.out.println("User - static block");
	}
	{
		System.out.println("ISer IIB");
	}
	{
		userCount++;
	}
	public User(String _userId)
	{
		this("Guest User",_userId,"000000000","abc@xyz.com");
		System.out.println("User.User() - 1");
	}
	public User(String userName,String userId,String mobile,String email)
	{
		super();
		System.out.println("User,User() - 2");
		this.userName = userName;
		this.userId = userId;
		this.mobile = mobile;
		this.email = email;
	}
	public static void main(String[] args)
	{
		System.out.println("User main()");
		
		User ankit = new User("jfewjfkjefkewj-jbqwjdqjfdqhujkfqehj");
		User ram = new User("ahschcbjcb-bjbhj-cdhdfhjfhj"); 
		
		System.out.println(User.userCount);
	}
}
