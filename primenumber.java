/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testcases;

/**
 *
 * @author mehbo
 */
public class primenumber {
    public boolean primechecker(int num)
    {
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
        {
            return true;
        }
        return false;
         
    }
}
