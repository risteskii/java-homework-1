package Homework1;

public class Problem2 { //Primes

	public static void main(String[] args) {
		
		int nValues = 50;
		System.out.println("Prime numbers up to n="+ nValues +" are the following: ");
		
		OuterLoop: for (int i = 2; i <= nValues; i++) {
			
			for (int j=2; j <= Math.sqrt(i); j++) {
				
				if(i % j==0) {
					continue OuterLoop;
				}
			}
			System.out.println(i);
		}
	}

}