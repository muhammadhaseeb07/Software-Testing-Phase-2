package junit_testing;

import main.calculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Lucky Pratama
 */
public class calculatorTest {
    
    calculator c;
    
    @Before
    public void init(){
        c = new calculator();
    }
    
    @Test
    public void mulTest(){
        assertEquals(6,c.mul(2, 3));
    }
    
    @Test
    public void subTest(){
        assertEquals(5, c.sub(10, 5));
    }
    
    @Test
    public void addTest(){
        assertEquals(15, c.add(10, 5));
    }
    
    @Test
    public void divTest(){
        assertEquals(2, c.div(4,2));
    }
}
