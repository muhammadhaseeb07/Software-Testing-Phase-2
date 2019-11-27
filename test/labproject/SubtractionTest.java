/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labproject;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author MUHAMMAD WAQAS AFZAL
 */
@RunWith(value = Parameterized.class)
public class SubtractionTest {
    
     private double num1;
    private double num2;
    private Integer expResult;
    private Subtraction instance;
    
   @Before
   public void initialize() {
      instance = new Subtraction();
   }
   
   
    public SubtractionTest(double num1,double num2, Integer expectedResult) {
      this.num2 = num2;
      this.num1 = num1;
      this.expResult = expectedResult;
   }
   
  @Parameterized.Parameters
   public static Collection numbers() {
      return Arrays.asList(new Object[][] {
         { 1,1,0 },
         { 3,2,1 },
         { 1,2,-1 },
         {0,0,0}
      });
   }
    @Test
    public void testSub() {
        assertEquals(expResult, instance.sub(num1,num2), 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
