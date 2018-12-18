

import java.util.*;
import java.lang.*;
import java.io.*;

 class LeapYear {
 
	public static void main(String[] args) {
		
	
		int year;
		Scanner s=new Scanner(System.in);
		year=s.nextInt();
		
		
		
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
