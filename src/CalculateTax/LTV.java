/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculateTax;

/**
 *
 * @author l164182
 */
public abstract class LTV extends Vehicle
{
    int x ;
    int y ;
    int z ;

    public LTV(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    
    
    
    
    abstract int computeTax();
    abstract void printVehicle() ;
}
