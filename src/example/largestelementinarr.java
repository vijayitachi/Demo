package example;
import java.util.Scanner;
public class largestelementinarr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[5];
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("the largest element in array is "+max);
	}

}
