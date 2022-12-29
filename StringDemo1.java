package mypackage;

import java.util.Scanner;

public class Stringdemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String s=sc.nextLine();
		String s1=s.replaceAll("\\s{2,}", " ").trim();
		String str=" ";
		String[] arr=s1.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			char c=arr[i].charAt(0);
			String c1=String.valueOf(c).toUpperCase();
			String sub=arr[i].substring(1);
			str=str+c1+sub+" ";
		}
		System.out.println(str.trim());
	}

}
