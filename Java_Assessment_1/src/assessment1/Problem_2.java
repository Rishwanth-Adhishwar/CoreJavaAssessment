package assessment1;

import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number One: ");
		int n1=sc.nextInt();
		System.out.println("Enter the Number Two: ");
		int n2=sc.nextInt();
		System.out.println("Enter the Number Three: ");
		int n3=sc.nextInt();
		
		int c1=n1,c2=n2,c3=n3;
		
		int max=0;
		if(n1>=100 && n1<=999 && n2>=100 && n2<=999 && n3>=100 && n3<=999 )
		{
			while(n1!=0)
			{
				if(n1%10>max)
				{
					max=n1%10;
				}
				n1/=10;
			}
			while(n2!=0)
			{
				if(n2%10>max)
				{
					max=n2%10;
				}
				n2/=10;
			}
			while(n3!=0)
			{
				if(n3%10>max)
				{
					max=n3%10;
				}
				n3/=10;
			}
		}

		int u1=c1%10;
		int u2=c2%10;
		int u3=c3%10;
		int unit=Math.min(u1, Math.min(u2, u3));
		
		 c1/=10;
		 c2/=10;
		 c3/=10;
		 
		int t1=c1%10;
		int t2=c2%10;
		int t3=c3%10;
		
		int tens=Math.min(t1, Math.min(t2, t3));
		 c1/=10;
		 c2/=10;
		 c3/=10;
		 
		int h1=c1%10;
		int h2=c2%10;
		int h3=c3%10;
		
		int hundreds=Math.min(h1, Math.min(h2, h3));
		
		System.out.println(unit);
		System.out.println(tens);
		System.out.println(hundreds);
		
		int pin =((1000*max)+(100*hundreds)+(10*tens)+unit);
		
		System.out.println("PIN: "+pin);

			
		
		
	}

}
