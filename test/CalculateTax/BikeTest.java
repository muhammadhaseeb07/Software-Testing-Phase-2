/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculateTax;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;

/**
 *
 * @author HASEE
 */
public class BikeTest {
    
   private String maker ;
    private int year ;
    private int cc,  x,  y,  z ;
    private Bike instance;
    private int expResult ;

    @Before
    public void initialize(){
        instance = new Bike(this.maker, this.year, this.cc, this.x, this.y, this.z) ;
    }

    public BikeTest(String maker, int year, int cc, int x, int y, int z,int expResult) {
        this.maker = maker ;
        this.cc = cc ;
        this.expResult =expResult ;
        this.year = year ;
        this.x =x ;
        this.y =y ;
        this.z=z ;
    }
    
   @Parameterized.Parameters
   public static Collection numbers() {
      return Arrays.asList(new Object[][] {
         { "Honda" , 2012, 100,   50,200,300,200},
         { "Uniqe" , 2016 , 70,     50,200,300,50 },
         { "Suzuki" , 2016 , 125,  50,200,300,300}
      });
   }

    /**
     * Test of computeTax method, of class Bike.
     */
    @Test
    public void testComputeTax() {
        assertEquals(expResult, instance.computeTax());      
    }

}
