package com.sheet;

public class Base62Encoding {


	    private static final String baseDigits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

		/**
		 * 
		 */
	    public static int fromBase62(String base62Number) {
	        return fromOtherBaseToDecimal(62, base62Number);
	    }

	    private static int fromOtherBaseToDecimal(int base, String number) {
			
			  int result = 0; for (int pos = number.length(), multiplier = 1; pos > 0;
			  pos--) { result += baseDigits.indexOf(number.substring(pos - 1, pos)) *
			  multiplier; multiplier *= base; } return result;
			 
	    
	}
	    
	    public static void main(String[] args) {
			int fromBase62 = fromBase62("1012");
			  Integer obj = new Integer(fromBase62);
		        String str4 = obj.toString();
		        System.out.println("String str4 = " + str4);
			
			
			
			
			
		}
}
