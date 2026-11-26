package com.hotstar.user;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HotStarUser Viewer1 = new HotStarUser("jbjfewbfewbfjkewbfkjew");
		HotStarUser Viewer2 = new HotStarUser("sdjdwjkfejfkejkfwef","Paid");
		HotStarUser Viewer3 = new HotStarUser("jsfjfdsjjwjwfjwf","Paid");
		
		System.out.println(HotStarUser.totalViewers);
		System.out.println(Viewer1.getType());
		System.out.println(Viewer2.getType());

		

	}
}
