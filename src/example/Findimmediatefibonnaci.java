package example;
import java.util.Scanner;


public class Findimmediatefibonnaci {
	public static void fib(int[]arr) {
		int sum=0;
		for(int num:arr) {
			sum=sum+num;
		}
		int index=0;
		long a=0;
		long b=1;
		while(b<sum) {
			long temp=a+b;
			a=b;
			b=temp;
			index++;
		}
		long add =b-sum;
		System.out.println("the immediate fibonacci number after sum:"+add);
		System.out.println("the index of the immediate fibonacci number:"+index);
		System.out.println("the fibonacci number"+b);
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size of the array");
	int size=sc.nextInt();
	int [] arr=new int[size];
	System.out.println("enter the elements of the array");
	for(int i=0;i<size;i++) {
		 arr[i]=sc.nextInt();
	}
	fib(arr);
	
	}

}
