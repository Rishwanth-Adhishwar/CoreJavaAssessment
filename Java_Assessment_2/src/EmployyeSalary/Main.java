package EmployyeSalary;

import java.util.Scanner;

class Employee
{
	int employeeId;
	String name;
	String designation;
	double salary;
	
	
	
	public Employee(int employeeId, String name, String designation, double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}


	public String displayInfo() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", designation=" + designation + ", salary="
				+ salary + "]";
	}
	
	
	public void increaseSalary(double percentage)
	{
		salary+=(salary*percentage)/100;
	}
	
	public void increaseSalary(double percentage,double bonus)
	{
		salary+=((salary*percentage)/100)+bonus;
	}
	
	
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
		int id=sc.nextInt();sc.nextLine();
		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Employee Designation: ");
		String designation=sc.nextLine();
		System.out.print("Ente the Employee Salary: ");
		double salary=sc.nextDouble();
		
		System.out.println("----------------Salary Increase------------");
		System.out.println("1.Salary increase with percentage");
		System.out.println("2.salary increase with bonus and percentage");
		System.out.println("-------------------------------------------");
		System.out.print("Choose any Operation ");
		int option =sc.nextInt();
		
		Employee e=new Employee(id,name,designation,salary);
		System.out.println(e.displayInfo());
		
		if(option==1)
		{
			System.out.print("Enter the Hike Percentage: ");
			double percentage=sc.nextDouble();
			e.increaseSalary(percentage);
			System.out.println(e.displayInfo());
		}
		else if(option==2)
		{
			System.out.print("Enter the hike percentage: ");
			double percentage=sc.nextDouble();
			System.out.print("Enter the bonus amount: ");
			double bonus=sc.nextDouble();
			e.increaseSalary(percentage, bonus);
			System.out.println(e.displayInfo());
		}
		else
		{
			System.out.println("Invalid Choice!");
		}
		
		

	}

}
