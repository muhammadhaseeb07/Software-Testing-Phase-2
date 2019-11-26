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
public class CarTest {
    
    private String maker ;
    private int year ;
    private String name;
    private int cc,  x,  y,  z ;
    private Car instance;
    private int expResult ;

    @Before
    public void initialize(){
        instance = new Car(this.maker, this.year, this.name, this.cc, this.x, this.y, this.z) ;
    }

    @After
    public void tearDown() throws Exception {
    }
    public CarTest(String maker, int year, String name, int cc, int x, int y, int z,int expResult) {
        this.maker = maker ;
        this.cc = cc ;
        this.expResult =expResult ;
        this.name = name ;
        this.year = year ;
        this.x =x ;
        this.y =y ;
        this.z=z ;
    }
    
   @Parameterized.Parameters
   public static Collection numbers() {
      return Arrays.asList(new Object[][] {
         { "Honda" , 2012, "City" , 1500, 1000,1500,2000,1500},
         { "Mercedes" , 2016 ,  "Kompressor", 22000 , 1000,1500,2000,2000 },
         { "Suzuki" , 2016 , "Wagon_r", 800, 1000,1500,2000,1000}
      });
   }

    /**
     * Test of computeTax method, of class Car.
     */
    @Test
    public void testComputeTax() {
        assertEquals(expResult, instance.computeTax());
    }

    
    
}
