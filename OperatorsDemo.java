package mypackage;

public class OperatorsDemo {

	public static void main(String[] args) {
		int a=5;
		int b=4;
		int c;
		c=a&b;
		System.out.println(" and Result="+c);
		System.out.println("and & binary value "+Integer.toBinaryString(a&b));
		c=a|b;
		System.out.println("or result="+c);
		System.out.println("or | binaryvalue "+Integer.toBinaryString(a|b));
		c=a^b;
		System.out.println("xor result="+c);
		System.out.println("xor ^ binaryvalue "+Integer.toBinaryString(a^b));
		
	}

}
