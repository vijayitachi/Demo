package example;
import java.util.Scanner;

public class Reversenumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int a=sc.nextInt();
		int sum=0;
		while(a!=0) {
			int digit=a%10;
			sum=sum*10+digit;
			a=a/10;
			
			
		}
		System.out.println("the reverse number is: "+sum);
	}

}
