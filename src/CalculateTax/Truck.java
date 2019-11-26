/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculateTax;

/**
 *
 * @author l164182
 */
public class Truck extends HTV 
{

     int capacity ;
    public Truck(int capacity, int FixTax) {
        super(FixTax);
        this.capacity = capacity;
    }
   
    
    int computeTax() 
    {
        if(this.capacity >1000)
        {
            int s = this.capacity - 1000 ;
            s = s*200 ;
            s = super.FixTax + s ;
            System.out.println("Tax :" + s) ;
            return s ; 
        }
        return 0 ;
    }
    void printVehicle() 
    {
        System.out.println("Capacity: " +this.capacity) ;
        
    }
}
