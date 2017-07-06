import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int k=s.nextInt();
      int fact=1;
      for(int i=1;i<=k;i++)
      {
    	  fact=fact*i;
      }
      System.out.print(fact);
	}

}
