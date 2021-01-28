import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter Array elements:");
		
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Array elements are:");
		for(int i=0;i<num;i++) {
			System.out.println(arr[i]+" ");
		}
		
		for(int j=0;j<num;j++) {
			
			sum=sum+arr[j];
			
		}
		System.out.println("Sum of array elements are:"+sum);

	}

}
