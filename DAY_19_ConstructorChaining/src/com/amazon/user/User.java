package com.amazon.user;

public class User {
	private String userName;
	private String userId;
	private String mobile;
	private String email;
	{
		System.out.println(userName);
	}
	static {
		System.out.println("User - static block");
	}
	{
		System.out.println("User IIB");
	}
	public User(String _userId)
	{
		this("Guest User", _userId,"00000000","abx@xyz.com");
		System.out.println("User.User() - 1");
	}
	public User(String userName, String userId,String mobile, String email) {
		super();
		System.out.println("User.User() - 2");
		
		this.userName = userName;
		this.mobile = mobile;
		this.userId = userId;
		this.email = email;
//		System.out.println(userName);
//		System.out.println(userId);
//		System.out.println(mobile);
//		System.out.println(email);
	}
	public static void main(String[] args)
	{
		System.out.println("User main()");
		
		User ankit =
                new User("eqrtet-wertret-tretqert-tertqert");

        User ram =
                new User("eqrtet-wertret-tretqert-ttwert");
	}
}
