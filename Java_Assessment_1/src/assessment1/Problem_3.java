package assessment1;

import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Positive Integer: ");
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(n==sum)
		{
			System.out.println("The Give number is Perfect");
		}
		else
		{
			System.out.println("The given Number is Not Perfect");
		}

	}

}
