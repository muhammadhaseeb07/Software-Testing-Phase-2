/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculateTax;

/**
 *
 * @author l164182
 */
public class Car extends LTV
{
    String maker ;
    int year ;
    String name ;
    int cc ;

    public Car(String maker, int year, String name, int cc, int x, int y, int z) {
        super(x, y, z);
        this.maker = maker;
        this.year = year;
        this.name = name;
        this.cc = cc;
    }
    
    int computeTax() 
    {
        if(this.cc <= 1000)
        {
            System.out.println("Tax : " + super.x) ;
            return super.x ;
        }
        else if(this.cc >1000 && this.cc <= 2000 )
        {
            System.out.println("Tax : " + super.y) ;
            return super.y ;
        }
        else //if(this.cc > 2000)
        {
            System.out.println("Tax : " + super.z) ;
            return super.z ;
        }
        
    }
    void printVehicle() 
    {
        System.out.println("Maker :" + this.maker)  ;
        System.out.println("Year  :" + this.year) ;
        System.out.println("Name  :" + this.name) ;
        System.out.println("CC    :" + this.cc)  ;
    }
}
