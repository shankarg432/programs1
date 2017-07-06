import java.util.Scanner;

public class RevDigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int reverse=0;
		while(num!=0)
		{
			reverse=reverse*10;
			reverse=reverse+(num%10);
			num=num/10;
		}
		System.out.print(reverse);
}

}
