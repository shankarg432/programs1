import java.io.*;
import java.util.*;

public class Large  {
	public static void main (String[] args) {
	    int large=0;
	    Scanner s=new Scanner(System.in);
	    int num1=s.nextInt();
	    int num2=s.nextInt();
	    int num3=s.nextInt();
	    if(num1>num2)
	    {
	        large=num1;
	    }
	    else if(num2>num3)
	    {
	        large=num2;
	    }
	    else{
	        large=num3;
	    }
	    System.out.println(large);
	    
		
	}
}
