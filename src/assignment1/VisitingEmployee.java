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
public class VisitingEmployee extends Employee {
    protected int numHours;
    private float perHourRate;
    private int bonusRate;

    public VisitingEmployee(int numHours, float perHourRate, int bonusRate, String name, int id, double basicSalary, int amountPerJob) {
        super(name, id, basicSalary, amountPerJob);
        this.numHours = numHours;
        this.perHourRate = perHourRate;
        this.bonusRate = bonusRate;
    }
    
    public int computeBonus()
    {
        if(super.getJobsCount(Status.COMPLETED)>3 && numHours>30)
        {
            int b;
            b=(super.getAmountPerJob()*bonusRate)/100;
            return ((super.getJobsCount(Status.COMPLETED)-3)*b)+5000;
        }
        else if(super.getJobsCount(Status.COMPLETED)<= 3 && numHours>30)
        {
            return 5000;
        }
        else if(super.getJobsCount(Status.COMPLETED) > 3 && numHours <= 30)
        {
            int b;
            b=(super.getAmountPerJob()*bonusRate)/100;
            return ((super.getJobsCount(Status.COMPLETED)-3)*b);
        }
        else
        return 0;
    }
    
    @Override
     public void setBasicSalary(double basicSalary) 
    {
        this.basicSalary = 0;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
     
    
    @Override
    public double computeTotalSalary()
    {
       return getBasicSalary()+(super.getJobsCount(Status.COMPLETED)*super.getAmountPerJob())+(numHours*perHourRate)+computeBonus();
        
    }
    
  @Override
  public String toString()
  {
      return String.format("%s \nBonus Amount: %d \nTotal Salary: %.2f",super.toString(),computeBonus(), computeTotalSalary());
  }
    
}
