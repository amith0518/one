package calci;

import java.util.Scanner;

public class calci {
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
				System.out.println("enter the first value");
		int a=s1.nextInt();
				System.out.println("enter the second value");
		int b=s1.nextInt();
		int res,i;
	for(i=0;i<2;i++)
	{
		
		
		System.out.println("enter 1.add 2.sub 3.multiply 4.divide");
		int c=s1.nextInt();
	
		
	if(c>4) {
		continue;
	}
		while(c<=4)
		{
			
		
		if(c==1)
		{
			res=a+b;
			System.out.println("answer"+ " "+res);
		break;
		}
		
		if(c==2)
		{
			res=a-b;
			System.out.println("answer" +" "+res);
		break;
		}
		
		if(c==3)
		{
			res=a*b;
			System.out.println("answer" +" "+res);
		break;
		}
		
		if(c==4)
		{
			res=a/b;
			System.out.println("answer" +" "+res);
		break;
		}
		}
		
		
		
		
	}			
	}
}
