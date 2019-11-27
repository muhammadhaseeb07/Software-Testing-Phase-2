/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testcases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mehbo
 */
public class mytestclass2Test {
    
    public mytestclass2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of binarysearch method, of class mytestclass2.
     */
    @Test
    public void testBinarysearch() {
        System.out.println("binarysearch");
        int first = 0;
        int last = 10;
        int search = 29;
        int[] array = {2,3,4,5,6,7,8,9,1,29};
        mytestclass2 instance = new mytestclass2();
        boolean expResult = true;
        boolean result = instance.binarysearch(first, last, search, array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testBinarysearch1() {
        System.out.println("binarysearch");
        int first = 0;
        int last = 10;
        int search = 19;
        int[] array = {2,3,4,5,6,7,8,9,1,29};
        mytestclass2 instance = new mytestclass2();
        boolean expResult = false;
        boolean result = instance.binarysearch(first, last, search, array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
