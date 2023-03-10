package mypackage;

import java.util.Scanner;

public class Stringdemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String word=sc.nextLine();
		String str=" ";
		String[] arr=word.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			char charecter=arr[i].charAt(0);
			String word2=String.valueOf(chreacter).toUpperCase();
			String sub=arr[i].substring(1);
			str=str+c1+sub+" ";
		}
		System.out.println(str.trim());
	}

}
