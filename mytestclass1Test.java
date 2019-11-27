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
public class mytestclass1Test {
    
    public mytestclass1Test() {
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
     * Test of Palindrome method, of class mytestclass1.
     */
    @Test
    public void testPalindrome() {
        System.out.println("Palindrome");
        int number = 121;
        mytestclass1 instance = new mytestclass1();
        boolean expResult = true;
        boolean result = instance.Palindrome(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testPalindrome1() {
        System.out.println("Palindrome");
        int number = 1221;
        mytestclass1 instance = new mytestclass1();
        boolean expResult = true;
        boolean result = instance.Palindrome(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testPalindrome3() {
        System.out.println("Palindrome");
        int number = 12241;
        mytestclass1 instance = new mytestclass1();
        boolean expResult = false;
        boolean result = instance.Palindrome(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testPalindrome4() {
        System.out.println("Palindrome");
        int number = 12241;
        mytestclass1 instance = new mytestclass1();
        boolean expResult = false;
        boolean result = instance.Palindrome(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
