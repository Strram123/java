package mypackage;

import java.util.Scanner;

public  class Stringdemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		boolean space=true;
		for(int i=0;i<ch.length;i++)
		{
			if(space)
			{
				ch[i]=Character.toUpperCase(ch[i]);
				space=false;
			}
			else
				space=true;
		}
		s=String.valueOf(ch);
		System.out.println(s);
		
		
		
		
	} 
	}


