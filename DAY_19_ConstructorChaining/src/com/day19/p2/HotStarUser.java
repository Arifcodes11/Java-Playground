package com.day19.p2;

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
	{
		totalViewers = totalViewers+1;
	}
}
