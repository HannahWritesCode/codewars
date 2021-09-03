package stringendswith;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * Complete the solution so that it returns true if the 
 * first argument(string) passed in ends with the 2nd argument (also a string).
 *
 * Examples:
 * solution('abc', 'bc') // returns true
 * solution('abc', 'd') // returns false
 * 
 * @author HannahWritesCode
 * 
 *  I learned a lot about Java regex today. 
 * 
 *  I also learned there is a method called str.endsWith()
 *  **slams head into table, repeatedly**
 */
public class Kata {
  /**
   * What I did
   * @param str
   * @param ending
   * @return boolean
   */
  public static boolean solution(String str, String ending) {
    // add extra backslash to escape newline characters 
    str = str.replaceAll("\n", "\\n");
    // quote flag eliminates any regex characters within str itself
    // "ending$" - looks for match at the end of the str
    Pattern r = Pattern.compile(Pattern.quote(ending) + "$");
    Matcher m = r.matcher(str);
    
    return m.find(); 
  }
  /**
   * What I should've done
   * @param str
   * @param ending
   * @return boolean
   */
  public static boolean betterSolution(String str, String ending){
      return str.endsWith(ending);
  }
}
