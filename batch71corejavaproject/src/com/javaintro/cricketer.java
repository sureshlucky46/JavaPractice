package com.javaintro;

public class cricketer {
	String cricketername;
	int jerseynumber;
	static int countryid;
	static String  countryname;

	public static void main(String[] args) {
		countryid=91;
		countryname="india";
		
		System.out.println("circketer 1 info");
		cricketer a1 = new cricketer();
		a1.cricketername="ms dhoni";
		a1.jerseynumber=7;
		System.out.println("cricketername:"+a1.cricketername);
		System.out.println("jerseynumber:"+a1.jerseynumber);
		System.out.println("countryid:"+countryid);
		System.out.println("countryname:"+countryname);
		
		System.out.println("circketer 2 info");
		cricketer a2 = new cricketer();
		a2.cricketername="virat kohli";
		a2.jerseynumber=18;
		System.out.println("cricketername:"+a2.cricketername);
		System.out.println("jerseynumber:"+a2.jerseynumber);
		System.out.println("countryid:"+countryid);
		System.out.println("countryname:"+countryname);
		

	}

}
