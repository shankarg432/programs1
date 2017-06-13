import java.io.*;
import java.util.*;
class Vowel {
	public static void main (String[] args) {
		char c;
		Scanner s=new Scanner(System.in);
		c=s.next().charAt(0);
		if(c=='a' || c=='A' || c=='e'|| c=='E' || c=='i'|| c=='I'|| c=='o'|| c=='O' || c=='u' || c=='U')
		{
		    System.out.println("Vowel");
		}
		else{
		    System.out.println("consonant");
		}
	}
}
