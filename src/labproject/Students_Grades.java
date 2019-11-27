/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labproject;

import java.util.Scanner;

/**
 *
 * @author MUHAMMAD WAQAS AFZAL
 */
public class Students_Grades {

    public Students_Grades() {
    }
    
    public String grades(float marks,float marks2, float marks3)
    {
      float avg= (marks+marks2+marks3)/3;
      marks=avg;
        if(marks<0 || marks>100)
        {
            return ("False input");
        }
        else if(marks>=80)
        {
            return ("A");
        }
        else if(marks>=60 && marks<80)
        {
            return ("B");
        } 
        else if(marks>=40 && marks<60)
        {
            return ("C");
        }
        else
        {
            return ("D");
        }
     
    }
    
}
