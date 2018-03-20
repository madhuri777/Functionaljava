package com.bridgeit.utility;

import java.util.Scanner;
import java.lang.Math;

/**
 * @author bridgeit
 *
 */
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
	public static String stringReplce(String username) {
		String s1="Hello username,how are you?";
		String string1=s1.replace("username", username);
		return string1;
	}
		
	
	
	/**
	 * @return
	 */
	public static int flipCoin(int c) {
		    int headcount=0;
		    int tailcount=0;
		    double perofhead=0;
		    double peroftail=0;
		
			for(int i=0;i<c;i++) {
			double flip=Math.random();
			if(flip<0.5) {
				headcount++;
			}
			else {
				tailcount++;
			}
			
		}
			perofhead=(double)(headcount*100)/c;
			peroftail=(double)(tailcount*100)/c;
			System.out.println("percentage of head:"+perofhead);
			System.out.println("percentage of tail:"+peroftail);
			
		return 0;
	}
	
	/*public static int leapYearMethod(int yr) {
		int digit=0;
		while(yr>0) {
			int r=yr%10;
			digit++;
			yr=yr/10;
		}
		if(digit==4) {
			
			
		}else {
			System.out.println("please nter the 4 digit year");
		}
		
		return 0;
	}*/
	public static void poweOfTwo(int N) {
		if(N>=0&&N<31) {
		for(int i=0;i<N;i++) {
			int j=(int)Math.pow(2,i);
			System.out.println("2^"+i+"="+j);
		    
		}
			
		}else {
			System.out.println("OverFlow");
	}
}
	public static float harmonicseries(int N) {
		float sum=0;
		for(int i=1;i<=N;i++) {
			sum=sum+(float)1/i;
			System.out.print("1/"+i+"+");
			
		}
		return sum;
	}
	public static void primeFactProgm(int N) {
		for(int i=2;i<N;i++) {
			while(N%i==0) {
				System.out.println(i);
				N=N/i;
			}
		}
		if(N>1) {
			System.out.println(N);
		}
		
	}
	public static void gamblerGame(int stake,int goal, int trail){
	    int cash=stake;
	    double win=0,loss=0;
	     for(int i=1;i<trail;i++) {
	    	{   while(cash>=0&&cash<=goal) {
	    		int result=(int)Math.random();
	    		if(result>0.5) {
	    			win++;
	    			cash++;
	    		}else {
	    			cash--;
	    		}
	    	}
	    	loss=trail-win;
	    }
	    if(cash==goal) {
	    	System.out.println("Win");
	    }else {
	    	System.out.println("Loss");
	    }
		double perloss=(double)(loss*100)/trail;
	    double perwin=(double)(win*100)/trail;
	    System.out.println("percentages"+perloss+" "+perwin);
	}
		
	}
}	
