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
import java.util.Calendar;
public class RegularEmployee extends Employee {  
    private final boolean isDeputed;
    private char grade;
    private double netSalary;
    private MyDate joiningDate;
    private final int amountPerYear;

    public RegularEmployee(boolean isDeputed, MyDate joiningDate, int amountPerYear, String name, int id, double basicSalary, int amountPerJob) {
        super(name, id, basicSalary, amountPerJob);
        this.isDeputed = isDeputed;
        this.joiningDate = joiningDate;
        this.amountPerYear = amountPerYear;
    }

    
    public RegularEmployee(boolean isDeputed, char grade, MyDate joiningDate, int amountPerYear, String name, int id, double basicSalary, int amountPerJob) {
        super(name, id, basicSalary, amountPerJob);
        this.isDeputed = isDeputed;
        this.grade = grade;
        this.joiningDate = joiningDate;
        this.amountPerYear = amountPerYear;
    }

   


    /**
     *
     * @param basicSalary
     */
   @Override
    public void setBasicSalary(double basicSalary) 
    {   
       if(isDeputed!=true)
       {
        switch (grade) {
            case 'W':
                this.basicSalary=20000;
                break;
            case 'X':
                this.basicSalary=50000;
                break;
            case 'Y':
                this.basicSalary=70000;
                break;
            case 'Z':
                this.basicSalary=120000;
                break;
            default:
                break;
        }
       }
       else
       {
           if(basicSalary>=70000 && basicSalary<=150000)
           {
               this.basicSalary=basicSalary;
           }
       }

    }
    public double computeTax()
    {
       if(isDeputed!=true)
       {
           switch (grade) {
               case 'W':
                   return 0;
               case 'X':
                   return (((getBasicSalary()+(super.getAmountPerJob()*super.getJobsCount(Status.COMPLETED))+(getExperienceYear()*amountPerYear))*2.5)/100);
               case 'Y':
                   return (((getBasicSalary()+(super.getAmountPerJob()*super.getJobsCount(Status.COMPLETED))+(getExperienceYear()*amountPerYear))*5)/100);
               case 'Z':
                   return (((getBasicSalary()+(super.getAmountPerJob()*super.getJobsCount(Status.COMPLETED))+(getExperienceYear()*amountPerYear))*8)/100);
               default:
                   return 0;
           }
        }
       else
       {
           return ((basicSalary*10)/100);
       }
    }
    
    public boolean applyForLeave(LeaveApplication LA1)
    {
      if((isDeputed != true) && getExperienceYear()>=3 && getJobsCount(Status.ASSIGNED)==0 && getJobsCount(Status.CONTINUED)==0)      
      {
          return true;
      }
      else
          return false;
    }
    
    public double getBasicSalary() {
        return basicSalary;
    }

    public void setJoiningDate(MyDate joiningDate) {
        this.joiningDate = joiningDate;
    }
    
    public MyDate getJoiningDate()
    {
        return joiningDate;
    }
    
  public int getExperienceYear()
  {
      Calendar c1 = Calendar.getInstance();
      int year;
      year = c1.get(Calendar.YEAR);
      return (year-joiningDate.getYear()); 
  }

    @Override
  public double computeTotalSalary()
  {
       if(isDeputed!=true)
       {
          return (getBasicSalary()+(super.getAmountPerJob()*super.getJobsCount(Status.COMPLETED))+(getExperienceYear()*amountPerYear)-computeTax());    
       }
       else
       {
           return getBasicSalary()+(super.getAmountPerJob()*super.getJobsCount(Status.COMPLETED))-computeTax();
       }
  }
  
  @Override
  public String toString()
  {
      return String.format("%s \nTax Amount: %.2f \nTotal Salary: %.2f",super.toString(),computeTax(),computeTotalSalary());
  }
          
}
