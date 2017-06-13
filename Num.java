import java.io.*;
import java.util.*;
class Num {
	public static void main (String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		if(num>0)
		{
		    System.out.print("positive");
		}
		else if(num<0)
		{
		    System.out.print("negative");
		}
		else{
		    System.out.print("zero");
		}
	}
}
