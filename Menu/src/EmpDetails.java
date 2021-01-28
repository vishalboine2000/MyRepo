import java.util.Scanner;

public class EmpDetails {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num;
		
		System.out.print("Enter no of employees: ");
		num=sc.nextInt();
		Emp[] emp=new Emp[num];
		for(int i=0;i<num;i++) {
			emp[i]=new Emp();
			System.out.print("Enter Employee Number :");
			emp[i].setEmpNo(sc.nextInt());
			System.out.print("Enter Employee Name:");
			emp[i].setEmpName(sc.next());
			System.out.print("How many technologies do employees work on :");
			int ntech=sc.nextInt();
			String[] empTechnologies = new String[ntech];
			System.out.print("Enter names of the technologies :");
			for(int j=0;j<ntech;j++) {
				empTechnologies[j]=sc.next();
			}
			emp[i].setEmpTechnologies(empTechnologies);
		}
		
		System.out.print("Employee details are: ");
		for(int i=0;i<num;i++) {
			System.out.print("Employee Number :"+emp[i].getEmpNo());
			System.out.print("Employee Name :"+emp[i].getEmpName());
			 System.out.print("Employee Technologies: ");
	            for(String tech:emp[i].getEmpTechnologies())   //foreach loop or enhanced for loop
	            {
	                System.out.print(tech+" ");
	            }
		}

	}

}
