package com.hotstar.user;

public class HotStarUser {
	public static int totalViewers = 0;
	
	
	private String userId;
	private String type;
	
	public HotStarUser(String userId,String type)
	{
		this.userId = userId;
		this.type = type;
	}
	
	public HotStarUser(String userId)
	{
		this(userId,"Free");
	}
	public String getType() {
	    return type;
	}
	{
		totalViewers = totalViewers+1;
	}
	void printSomething(){
		System.out.println("HostStarUser.printSomething().......");
	}
}
