/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testcases;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
/**
 *
 * @author mehbo
 */
@RunWith(Parameterized.class)
public class parametrizedclass {
   private primenumber prime_number;
   private int inputnumber;
   private boolean result;
   
   
   @Before
   public void initilize()
   {
     prime_number=new primenumber();
   }
   public parametrizedclass(int inputvalue,boolean result)
   {
      this.inputnumber=inputvalue;
      this.result=result;
   }
   
   @Parameterized.Parameters
   public static Collection primeNumber()
   {
     return Arrays.asList(new Object[][] {{2,true},{3,true},{12,false},{5,true},{19,true}});
   }
   
   @Test
   public void testprimenumber()
   {
     System.out.println("number to check="+inputnumber);
     assertEquals(result,prime_number.primechecker(inputnumber));
   }
}
