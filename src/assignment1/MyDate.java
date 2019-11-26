/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author asd
 */
public final class MyDate {
    private int day;
    private int mon;
    private int year;

    public MyDate(int day, int mon, int year) 
    {
       this.setDay(day);
       this.setMon(mon);
       this.setYear(year);
    }
    
    public int getDay() {
        return day;
    }

    public int getMon() {
        return mon;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) 
    {
        if(day>=1 && day<=31)
        {
           this.day = day;
        }
    }
     
    
    public void setMon(int mon) 
    {
        if(mon>=1 && mon<=12)
        {
           this.mon = mon;
        }
    }
     
    public void setYear(int year) 
    {
        if(year>=2001 && year<=2030)
        {
           this.year = year;
        }
    }
    
    @Override
    public String toString()
    {
        return String.format("Date %d-%d-%d",day,mon,year);
    }
    
}
