/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculateTax;

/**
 *
 * @author l164182
 */
public class Bus extends HTV
{
    int seats ;

    public Bus(int seats, int FixTax) {
        super(FixTax);
        this.seats = seats;
    }
    
    int computeTax() 
    {
        if(this.seats >20)
        {
            //int s = this.seats - 20 ;
            //s = s*20 ;
            int s ;
            s =seats*20 ;
            
            System.out.println("Tax :" + ((seats*20)+super.FixTax)) ;
            return ((seats*20)+super.FixTax) ;
        }
        return 0 ;
    }
    void printVehicle() 
    {
        System.out.println("Seats: "+this.seats) ;
    }
}
