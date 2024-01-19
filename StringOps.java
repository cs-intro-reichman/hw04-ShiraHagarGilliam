public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    }

    public static String capVowelsLowRest (String string) {
        String newSentence = "";
        String lastSentence = "";
        String vowels = "aeiou";
		for(int i = 0; i < string.length(); i++) {
			char currentChar = string.charAt(i);
			if(currentChar > 'A' && currentChar < 'Z') {
                currentChar = (char)(currentChar + 32);
            }
            newSentence = newSentence + currentChar;
        }
        for(int i = 0; i < newSentence.length(); i++) {
			char currentChar = newSentence.charAt(i);
		/* 
  		why didn't you create a helper isVowel()?
		could be a lot cleaner
  		*/
            if(vowels.indexOf(currentChar) != -1) {
                currentChar = (char)(currentChar - 32);
            }
			lastSentence = lastSentence + currentChar;
        }
        return lastSentence;
        }

    public static String camelCase(String string) {
        int indexSpace = 0;
        String fullSentence = "";
        char lastLetter = string.charAt(string.length() - 1);
            
        while (string.charAt(indexSpace) == ' ') {
            indexSpace++;
        }
    
        boolean notSpace = true;
        boolean newWord = false;
        for (int i = indexSpace; i < (string.length() - 1); i++) {
            char currentChar = string.charAt(i);
            char firstLetter = string.charAt(i + 1);
    
            if (currentChar == ' ') {
                notSpace = false;
            } else {
                notSpace = true;
            }
    
            if ((currentChar >= 'A' && currentChar <= 'Z') && notSpace) {
                    currentChar = (char)(currentChar + 32);
                }
    
            if (currentChar == ' ' && firstLetter != ' ') {
                newWord = true;
            }
    
            if (currentChar != ' ' && newWord) {
                newWord = false;
                if (currentChar <= 'z' && currentChar >= 'a' && notSpace) {
                    currentChar = (char)(currentChar - 32);
                }
            }
                
            if (currentChar != ' ') {
                fullSentence = fullSentence + currentChar;
            }
        }
    
        if (lastLetter >= 'a' && lastLetter <= 'z') {
            fullSentence = fullSentence + lastLetter;
        } else if (lastLetter >= 'A' && lastLetter <= 'Z') {
            lastLetter = (char)(lastLetter + 32);
            fullSentence = fullSentence + lastLetter;
        } else if (lastLetter >= 'A' && lastLetter <= 'Z' && string.charAt(string.length() - 2) == ' ') {
            fullSentence = fullSentence + lastLetter;
        }
    
        return fullSentence;
    }

    public static int[] allIndexOf (String string, char chr) {
        int size = 0;
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if(currentChar == chr) {
                size++;    
            }
        }

        int[] index = new int[size];
        int j = 0;
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if(currentChar == chr) {   
                index[j] = i;
                j++;
            }
        }

        return index;
    }
}
