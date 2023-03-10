package mypackage;

public class OperatorsDemo {

	public static void main(String[] args) {
		int number1=5;
		int  number2=4;
		int number3;
		 number3= number1& number2;
		System.out.println(" and Result="+ number3);
		System.out.println("and & binary value "+Integer.toBinaryString( number1& number2));
		 number3= number1| number2;
		System.out.println("or result="+ number3);
		System.out.println("or | binaryvalue "+Integer.toBinaryString( number1| number2));
		 number3= number1^ number2;
		System.out.println("xor result="+ number3);
		System.out.println("xor ^ binaryvalue "+Integer.toBinaryString( number1^ number2));
		
	}

}
