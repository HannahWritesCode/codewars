package validatepin;
/**
 *
 * ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * Examples
 * "1234"   -->  true
 * "12345"  -->  false
 * "a234"   -->  false
 * 
 * @author HannahWritesCode
 */
public class Solution 
{
  public static boolean validatePin(String pin) 
  {
    if (pin.length() < 4 || pin.length() > 6 || pin.length() == 5) return false;
    for (int i = 0; i < pin.length(); i++){
        char digit = pin.charAt(i);
        if (!Character.isDigit(digit)) return false;
    }
    return true;
  }
}

