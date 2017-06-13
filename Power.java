import java.io.*;
import java.util.*;
public class Power  {
	public static void main (String[] args) 
	{
	  int num,p;
	  Scanner s=new Scanner(System.in);
	  num=s.nextInt();
	  p=s.nextInt();
	  System.out.println(Math.pow(num,p));
	}
}
