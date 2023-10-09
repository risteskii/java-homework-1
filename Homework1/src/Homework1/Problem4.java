package Homework1;

public class Problem4 {

	public static void main(String[] args) {
		
		String text = "To be or not to be, that is the question;"
				+"Whether `tis nobler in the mind to suffer"
				+" the slings and arrows of outrageous fortune,"
				+" or to take arms against a sea of troubles,"
				+" and by opposing end them;";
	 
	 
	    // Determine how many words there are.
	    // A word is a sequence of letters that may include a single quote character.
	    // Anything else is punctuation or spaces.
	    int count = 0;
	    boolean isWord = false; // Indicates start of a word found
	    for (int i = 0 ; i < text.length() ; ++i) {
	      if(isWord) { // If we have found a word, pass over the letters/quotes
	        if(Character.isLetter(text.charAt(i)) || text.charAt(i) == '\'')
	          continue;
	        else // If it's not a letter/quote, then we are at the end of the word
	          isWord = false;
	      }
	      else if(Character.isLetter(text.charAt(i))) { //we get the first letter of a new word, increase the count and record have found a word
	    	  
	          count++;
	          isWord = true;
	      }
	    }
	 
	    // Create the array of strings to contain all the words:
	    String[] words = new String[count];
	 
	    // Now extract the words from the text
	    int start = 0;
	    int wordIndex = 0;
	    isWord = false;// Indicates when a word start is found
	    for (int i = 0 ; i < text.length() ; ++i) {
	      if(!isWord) { // If we are not inside a word, look for the first letter and record the start index
	        if(Character.isLetter(text.charAt(i))) {
	          start = i;
	          isWord = true; // We have a word
	        }
	      }
	      else { // We are in a word
	        if(Character.isLetter(text.charAt(i)) || text.charAt(i) == '\'')
	          continue;
	        else {
	          isWord = false;
	          words[wordIndex++] = text.substring(start,i);
	        }
	      }
	    }
	    // If the text ends with a letter, it won't store the last word, so this fixes that
	    if(wordIndex < words.length)
	      words[wordIndex] = text.substring(start);
	 
	    // Sort the array of words
	    String temp = null;
	    boolean exchange = true;
	    while(exchange) {
	      exchange = false;
	      for(int i = 1 ; i < words.length ; ++i) {
	        if(words[i-1].compareTo(words[i]) > 0) {
	          temp = words[i]; 
	          words[i] = words[i-1];
	          words[i-1] = temp;
	          exchange = true;
	        }
	      }
	    }
	 
	    // Display the sorted array of words:
	    for(String word : words) {  //string - type of data; word - identifier (stores values of array as it loops through it; words - array
	      System.out.print(word +"\n");
	    }

	}

}
