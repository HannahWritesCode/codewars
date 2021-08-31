package isprime;

/**
* Define a function that takes one integer argument and returns logical value true or false depending on if the integer is a prime.
* 
* Per Wikipedia, a prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself.
* 
* Requirements
*  You can assume you will be given an integer input.
*  You can not assume that the integer will be only positive. You may be given negative numbers as well (or 0).
*  NOTE on performance: There are no fancy optimizations required, but still the most trivial solutions might time out. 
*  Numbers go up to 2^31 (or similar, depends on language version). Looping all the way up to n, or n/2, will be too slow.
*
* Example
* is_prime(1)  // false 
* is_prime(2)  // true  
* is_prime(-1) // false 
* 
* @author HannahWritesCode
* 
*  This implementation takes heavy inspiration from the wikipedia page on the Miller-Rabin primality test
*  https://en.wikipedia.org/wiki/Miller%E2%80%93Rabin_primality_test
*  and lenidh's implementation on GitHub gist. 
*  https://gist.github.com/lenidh/7812988
* 
*/
public class Prime {
  public static boolean isPrime(int num) {

    if (num == 2) return true; // definitely prime! 
    if (num % 2 == 0) return false; // eliminate even numbers other than 2 
    if (num < 2) return false; // eliminate negative numbers and 1 
    
    long d, s;
    
    // until d is odd
    for (d = 0, s = 1; (d & 1) == 0; s++){
        d = (num - 1) / longPower(2, s); 
    }
    
    witnessLoop: for (long i = 0; i < 20; i++) { //k = 20
        // random base in the range [2, n-1]
        long base = (long) ((Math.random() * (num - 3)) + 2);

        long x = longPowerWIthModulo(base, d, num);

        if (x == 1 || x == (num - 1)){
            continue witnessLoop;           
        }
        
        for (long j = 0; j < (s - 1); j++) {
            x = longPowerWIthModulo(x, 2, num);
            if (x == 1)
                return false;
            if (x == (num - 1))
                continue witnessLoop;
        }

        return false; //definitely composite
    }
    
    return true; //probably prime
  }
  /**
   * Custom exponent method for long numbers (instead of Math.pow(double, double)
   * 
   * @param base
   * @param power
   * @return result
   */
  public static long longPower(long base, long power) {
    long result = 1;
    while (power > 0) {
        result = result * base;
        power--;
    }
    return result;
  }
  /**
   * x ← x2 mod n
   * @param base
   * @param power
   * @param modulo
   * @return result
   */
  public static long longPowerWIthModulo(long base, long power, long modulo) {
    long result = 1;
    while (power > 0) {
        result = result * base % modulo;
        power--;
    }
    return result;
  }
  
  
}
