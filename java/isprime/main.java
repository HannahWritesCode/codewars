package isprime;

/**
 *
 * @author HannahWritesCode
 */
public class main {
    public static void main(String[] args) {
        
        System.out.println("0  is not prime, expect false: " + Prime.isPrime(0));
        System.out.println("1  is not prime, expect false: " + Prime.isPrime(1));
        System.out.println("2  is prime, expect true: " + Prime.isPrime(2));
        System.out.println("73 is prime, expect true: " + Prime.isPrime(73));
        System.out.println("75 is not prime, expect false: " + Prime.isPrime(75));
        System.out.println("-1 is not prime, expect false: " + Prime.isPrime(-1));
        System.out.println();
        
        System.out.println("3 is prime, expect true: " + Prime.isPrime(3));
        System.out.println("5 is prime, expect true: " + Prime.isPrime(5));
        System.out.println("7 is prime, expect true: " + Prime.isPrime(7));
        System.out.println("41 is prime, expect true: " + Prime.isPrime(41));
        System.out.println("5099 is prime, expect true: " + Prime.isPrime(5099));
        System.out.println();
        
        System.out.println("4 is not prime, expect false: " + Prime.isPrime(4));
        System.out.println("6 is not prime, expect false: " + Prime.isPrime(6));
        System.out.println("8 is not prime, expect false: " + Prime.isPrime(8));
        System.out.println("9 is not prime, expect false: " + Prime.isPrime(9));
        System.out.println("45 is not prime, expect false: " + Prime.isPrime(45));
        System.out.println("-5 is not prime, expect false: " + Prime.isPrime(-5));
        System.out.println("-8 is not prime, expect false: " + Prime.isPrime(-8));
        System.out.println("-41 is not prime, expect false: " + Prime.isPrime(-41));
        System.out.println();
        
        //Runtime when k = 20: 3.681 s
        System.out.println("Is 1819589577 prime? : " + Prime.isPrime(1819589577));
        System.out.println();

        //Runtime when k = 20: 01:54 min
        System.out.println("How about 1634300119? : " + Prime.isPrime(1634300119)); 
        System.out.println(); 
    }
}
