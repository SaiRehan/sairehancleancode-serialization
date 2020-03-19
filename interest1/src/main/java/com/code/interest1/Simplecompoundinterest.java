package com.code.interest1;

import java.util.Scanner;

public class Simplecompoundinterest {
	 public static void main (String argu[ ])
	 {
	     Scanner sc=new Scanner (System. in);
	     System.out.println("Enter the amount:");
	     double Amount=sc.nextDouble();
	     System. out. println("Enter the No.of years:");
	     double Noofyears=sc.nextDouble();
	     System. out. println("Enter the Rate of  interest");
	     double rate=sc.nextDouble();
	     System.out.println("Enter the type of interest \n1.simpleinterest \n2.compundinterest\n");
	     int choice=sc.nextInt();
	     switch(choice)
	     {
	     case 1:simpleinterest si= new simpleinterest(Amount,Noofyears,rate);
	          System.out.println("Simple interest :"+si.calculate());
	          break;
	     case 2:compoundinterest ci= new compoundinterest(Amount,Noofyears,rate);
         System.out.println("Compound interest :"+ci.calculate());     
         break;
         default:
        	 System.out.println("Enter valid interest type of range 1 or 2");
        	 break;
	          
	     }
	    }

}
