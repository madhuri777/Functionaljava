package com.bridgeit.utility;

import java.util.Scanner;

public class Utility {

	Scanner scanner;
    public Utility()
    {
        scanner=new Scanner(System.in);
    }

    // INPUT STRING
    /**
     * @return
     */
    public String inputString() {
        try {
            return scanner.next();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "";
}
    // INPUT Integer
        /**
         * @return
         */
        public int inputInteger() {
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println(e);
            }
            return 0;
    }

	/**
	 * @return
	 */
	public String stringReplce() {
		System.out.println("Enter the user name");
		String username=inputString();
	    return username;
	
	}
}