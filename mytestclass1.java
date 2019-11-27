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
public class mytestclass1 {
    public boolean  Palindrome(int number)
    {
        int num = number, reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;
        // reversed integer is stored in variable
        for( ;num != 0; num /= 10 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
        }
        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
        {
           return true;
        }
        return false;
    }
}
