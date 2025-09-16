package example;
import java.util.Scanner;


public class Mxsumsubarryofsizek {
	public static int fun(int [] arr,int k) {
		if(arr==null|arr.length<k) {
			return -1;
		}
		int windowsum=0;
		for(int i=0;i<k;i++) {
			windowsum+=arr[i];
		}
		int maxsum=windowsum;
		for(int i=k;i<arr.length;i++) {
			windowsum=windowsum-arr[i-k]+arr[i];
			maxsum=Math.max(maxsum, windowsum);
		}
		
		return maxsum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the maximum size of the subarray");
		int k=sc.nextInt();
		int [] arr= {1,2,3,4,5};
		System.out.println("The maxmimum sum of the subarray k is "+fun(arr,k));
	}

}
