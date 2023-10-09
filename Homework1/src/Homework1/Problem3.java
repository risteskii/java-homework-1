package Homework1;

public class Problem3 { //StringCharacters
	
	public static void main (String[] args) {
		String text = "To be or not to be, that is the question;"
				+"Whether `tis nobler in the mind to suffer"
				+" the slings and arrows of outrageous fortune,"
				+" or to take arms against a sea of troubles,"
				+" and by opposing end them?";
		int spaces = 0, vowels = 0, letters = 0;
		
		text = text.toLowerCase();
		
		for(int i=0; i< text.length(); i++) {
			if(Character.isLetter(text.charAt(i))) {
				letters++;
			}
			
			if(text.charAt(i) =='a' || text.charAt(i) =='e'
					|| text.charAt(i) =='i' 
					|| text.charAt(i) =='o'
					|| text.charAt(i) =='u') {
				vowels++;
				}
			else if (text.charAt(i) ==' ') {
				spaces++;
			}
				
		}
		
		System.out.println("The text contained vowels: " + vowels + "\n" + 
				"consonants " + (letters - vowels) + "\n"+ "spaces: " + spaces);
	}

}
