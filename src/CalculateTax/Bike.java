/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculateTax;

/**
 *
 * @author l164182
 */
public class Bike extends LTV
{
    String maker ;
    int year ;
    int cc ;

    public Bike(String maker, int year, int cc, int x, int y, int z) {
        super(x, y, z);
        this.maker = maker;
        this.year = year;
        this.cc = cc;
    }

    
    
    @Override
    int computeTax() 
    {
        if(this.cc <= 75)
        {
            System.out.println("Tax : " + super.x) ;
            return super.x ;
        }
        else if(this.cc >75 && this.cc <= 100 )
        {
            System.out.println("Tax : " + super.y) ;
            return super.y ;
        }
        else //if(this.cc > 250)
        {
            System.out.println("Tax : " + super.z) ;
            return super.z ;
        }
    }
    void printVehicle() 
    {
        System.out.println("Maker :" + this.maker)  ;
        System.out.println("Year  :" + this.year) ;
        System.out.println("CC    :" + this.cc)  ;
    }
}
