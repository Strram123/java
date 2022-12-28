package mypackage;

public  class KeywordDemo {

	public static void main(String[] args) {
		
		
		KeywordDemo.purchase();
	}

	private static void purchase() {
		
		int money=100;
		if(money<500)
			 throw new ArithmeticException("not enough money");
		else
			System.out.println("go and purchase");
		
	}

}
