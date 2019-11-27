/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertThat;

/**
 *
 * @author MUHAMMAD WAQAS AFZAL
 */
@RunWith(value = Parameterized.class)
public class Students_GradesTest {
   
    private float marks;
    private float marks2;
    private float marks3;
    private String expResult;
    private Students_Grades instance;
    
   @Before
   public void initialize() {
      instance = new Students_Grades();
   }
   
   
    public Students_GradesTest(float marks,float marks2,float marks3, String expectedResult) {
      this.marks = marks;
      this.marks2 = marks2;
      this.marks3 = marks3;
      this.expResult = expectedResult;
   }
   
  @Parameterized.Parameters
   public static Collection grading() {
      return Arrays.asList(new Object[][] {
         { 100,100,100, "A" },{ 99,99,99, "A" },{ 80,80,80, "A" },
         { 79,79,79, "B" },{ 60,60,60, "B" },
         { 59,59,59, "C" },{ 40,40,40, "C" },
         { 34,34,34, "D" },{ 0,0,0, "D" },
         { -1,-1,-1, "False input" },{ 101,101,101, "False input" }
      });
   }
    
    /**
     * Test of grades method, of class Students_Grades.
     */
    @Test
    public void testGrades() {        
        assertEquals(expResult, instance.grades(marks,marks2,marks3));
    }
    
}
