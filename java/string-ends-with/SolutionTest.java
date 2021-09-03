package stringendswith;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HannahWritesCode
 */
public class SolutionTest {
    @Test
    public void testTrue() {
        boolean result = Kata.solution("abc", "bc");
        assertEquals(true, result);
    }
    
    @Test
    public void testFalse() {
        boolean result = Kata.solution("abc", "d");
        assertEquals(false, result);
    }
    
    @Test
    public void testFrown(){
        boolean result = Kata.solution(":-)", ":-(");
        assertEquals(false, result);
    }
    
    @Test 
    public void testSmile(){
        boolean result = Kata.solution("!@#$%^&*() :-)", ":-)");
        assertEquals(true, result);
    }
    
    @Test
    public void testSame(){
        boolean result = Kata.solution("abc", "abc");
        assertEquals(true, result);
    }
    
    @Test
    public void testNewline(){
        boolean result = Kata.solution("abc\n", "abc");
        assertEquals(false, result);
    }
    
}
