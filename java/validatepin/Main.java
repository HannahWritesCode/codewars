package validatepin;

/**
 *
 * @author HannahWritesCode
 */
public class Main {
 public static void main(String[] args) {
     
     System.out.println("4 valid digits, expect true: " + Solution.validatePin("9642")); 
     System.out.println("4 digits but invalid char, expect false: " + Solution.validatePin("78f6")); 
     System.out.println("6 valid digits, expect true: " + Solution.validatePin("971642")); 
     System.out.println("6 digits but invalid char, expect false: " + Solution.validatePin("29kk23")); 
     System.out.println("8 digits, expect false: " + Solution.validatePin("89552364")); 
     System.out.println("5 digits, expect false: " + Solution.validatePin("78942")); 
     System.out.println("10 digits and invalid chars, expect false: " + Solution.validatePin("92072a87k4")); 
 }
} 