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
public class mytestclass2 {
    public boolean binarysearch(int first,int last,int search ,int array[])
    {
    int middle=0;
    last=last-1;
    middle = (first + last)/2;
    while( first <= last )
    {
      if ( array[middle] < search )
      {
        first = middle + 1;   
      }
      else if ( array[middle] == search )
      {
        return true;
      }
      else
      {
          last = middle - 1;
      }
      middle = (first + last)/2;
   }
   return false;
   }
}