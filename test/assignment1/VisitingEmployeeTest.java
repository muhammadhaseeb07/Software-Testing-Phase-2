/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

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
public class VisitingEmployeeTest {
    
    private Employee instance_0;
    private Employee instance_1;
    private Employee instance_2;
    private Employee instance_3;
    private final VisitingEmployee test ;
    private final int expectedResult;
    
    @Before
    public void initialize()
    {
        //For Branch 1
        this.instance_0 = new VisitingEmployee(31,1000,1,"Ali",1,10000,20000) ;
        this.instance_0.jobs = new Task[4];
        for(int i=0;i<=3;i++)
        {
            this.instance_0.jobs[i] = new Task();
            this.instance_0.jobs[i].setTaskStatus(Status.COMPLETED);
        }
        
        //For Branch 2
        this.instance_1 = new VisitingEmployee(31,1000,1,"Ali",1,10000,20000) ;
        this.instance_1.jobs = new Task[3];
        for(int i=0;i<=2;i++)
        {
            this.instance_1.jobs[i] = new Task();
            this.instance_1.jobs[i].setTaskStatus(Status.COMPLETED);
        }
        
        //For Branch 3
        this.instance_3 = new VisitingEmployee(30,1000,1,"Ali",1,10000,20000) ;
        this.instance_3.jobs = new Task[4];
        for(int i=0;i<=3;i++)
        {
            this.instance_3.jobs[i] = new Task();
            this.instance_3.jobs[i].setTaskStatus(Status.COMPLETED);
        }
        
        //For Branch 4
        this.instance_3 = new VisitingEmployee(29,1000,1,"Ali",1,10000,20000) ;
        this.instance_3.jobs = new Task[2];
        for(int i=0;i<=1;i++)
        {
            this.instance_3.jobs[i] = new Task();
            this.instance_3.jobs[i].setTaskStatus(Status.COMPLETED);
        }
    }
    public VisitingEmployeeTest(VisitingEmployee e,int expectedResult) 
    {
        this.test = e ;
        this.expectedResult = expectedResult ;
    }

    @Parameterized.Parameters
    public Collection checkBonus()
    {
        return Arrays.asList(new Object[][] {
            {this.instance_0,5200},
            {this.instance_1,5000},
            {this.instance_2,200},
            {this.instance_3,0}
      });
    
    }
    
    /**
     * Test of computeBonus method, of class VisitingEmployee.
     */
    @Test
    public void testComputeBonus() {
        assertEquals(expectedResult, test.computeBonus(),0);
    }
}
