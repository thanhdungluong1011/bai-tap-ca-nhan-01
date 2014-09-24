package oop.asg02;

public class BigIntegerDemo {
	public static void main( String[] args ) {
		BigInteger bigA = new BigInteger(8);
		System.out.println("So can in ra A: " + bigA.number);   
		
		BigInteger bigB = new BigInteger("123");
		System.out.println("So can in ra B: " + bigB.number);   
		
		System.out.println("So can in ra B: " + bigB.toString());   
		
		BigInteger bigC = new BigInteger("0000");
		System.out.println("So can in ra C: " + bigC.number);   




    }
}
