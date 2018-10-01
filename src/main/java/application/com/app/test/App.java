package application.com.app.test;

/**
 * 
 * @author Dannamaneni
 *
 */
public class App 
{
 
    public static String longestString(String input) {
    	String res = "";
    	int wordLength = 0;
    	String[] words = input.split(" ");
    	for(String word : words) {
    		if(word.length()>wordLength) {
    			res = word;
    			wordLength = word.length();
    		}
    	}
    	return wordLength+" "+res;
    }
}
