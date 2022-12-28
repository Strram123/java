package mypackage;

import java.util.Scanner;

public class ControlStatementsDemo {

	public static void main(String[] args){
		
		int total=0;
		int[]mark=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 marks:");
		for(int i=0;i<mark.length;i++)
		{
			mark[i]=sc.nextInt();
			total=total+mark[i];
		}
		System.out.println("your total is:"+total);
		
		if(total!=0)
		{
		int percentage=total/mark.length;
		System.out.println("your percentage:"+percentage);
		
		 
		 Scanner s=new Scanner(System.in);
		 System.out.println("your percentage 90 to 100 ...press 1");
		 System.out.println("your percentage 80 to 90 ...press 2");
		 System.out.println("your percentage 70 to 80 ...press 3");
		 int num=sc.nextInt();
		
		 switch(num)
		 {
		 case 1:
			
			System.out.println("A grade");
			break;
			
		case 2:
			
			System.out.println("B grade");
			break;
				
		case 3:
			System.out.println("c grade");
			break;
			
		default:
			System.out.println("press valid key");
		
		
		}
		}
		
		
		
	}

}
