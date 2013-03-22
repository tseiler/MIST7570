


package helpers;


/**
 * @author tseiler
 * String Reverser Class
 *
 */


public class StringReverser {

	/*
	 * Return the reverse of originalString
	 * @parameter originalString
	 */
	public static String reverseIt(String originalString){
		
		StringBuilder reversed = new StringBuilder(originalString);
		reversed.reverse();
		return reversed.toString();
	}
}
