import java.io.*;
import java.util.*;

public class Leap  {
	public static void main (String[] args) {
	    int year=0;
	    Scanner s=new Scanner(System.in);
	    year=s.nextInt();
	    if((year%4==0) && (year%100==0) && (year%400==0))
	    {
	       System.out.println("Leap year");
	    }
	    else
	    {
	        System.out.println("Not an leap year");
	    }
		
	}
}
