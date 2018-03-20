package com.bridgeit.programs;


import com.bridgeit.utility.Utility;

public class ReplaceStringTemplate {

	public static void main(String[] args) {
		Utility un=new Utility();
		String username1=un.stringReplce();
		int l=username1.length();
		if(l>3) {
			
			 System.out.println("Hello "+username1+" ,How are you?");
		}else {
			System.out.println("userName containe at least 3 character");
		}
	 
	
	}

}
