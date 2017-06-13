import java.io.*;
import java.util.*;
public class Digit  {
	public static void main (String[] args) 
	{
	  int count=0;
	  Scanner s=new Scanner(System.in);
	  int num=s.nextInt();
	  while (num!=0)
	  {
	      int n=num%10;
	      num=num/10;
	      count++;
	  }
	  System.out.println(count);
	}
}
