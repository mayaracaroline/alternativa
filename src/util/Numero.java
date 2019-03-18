package util;

public class Numero {

	public static boolean isNumeric (String number) {
	    try {
	        double d = Double.parseDouble(number);
	    } catch (NumberFormatException | NullPointerException nfe) {
	        return false;
	    }
	    return true;
	}

}
