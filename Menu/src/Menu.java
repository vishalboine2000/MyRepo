import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,sum,sub,mul;
		float div;
		int choice;
		System.out.print("Enter your choice:");
		System.out.print("Enter two numbers:");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
	 
		sum=a+b;
		sub=a-b;
		mul=a*b;
		div=(float)a/b;
		System.out.println("Addition is:"+sum);
		System.out.println("Subtraction is:"+sub);
		System.out.println("Multiplication is:"+mul);
		System.out.println("Divison is:"+div);
		

		
	}

}
