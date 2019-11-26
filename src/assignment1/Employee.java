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
import java.util.Scanner;

public class Employee {
    protected String name;
    protected int id;
    protected double basicSalary;
    protected Task[] jobs;
    protected  int amountPerJob;

    
    public Employee(String name, int id, double basicSalary, int amountPerJob) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.amountPerJob = amountPerJob;
    }
    
    public int getAmountPerJob() {
        return amountPerJob;
    }
    
    public void setBasicSalary(double basicSalary) 
    {
        this.basicSalary = basicSalary;
    }

    public void getTasks()
    {
        Scanner input =new Scanner(System.in);
        jobs = new Task[7];
        
        for(int i=0;i<7;i++)
        {
            jobs[i]=new Task();
            System.out.println();
            System.out.println("Enter Task id:");
            jobs[i].setTaskid(input.nextInt());
            System.out.println("Enter Task Name:");
            input.nextLine();
            jobs[i].setTaskname(input.nextLine());
            System.out.println("Enter Task Status:");
            jobs[i].setTaskStatus(Status.valueOf(input.nextLine().toUpperCase()));
            
        }
    }
    
    public int getJobsCount(Status s)
    {
        int count=0;
        
        for(int j=0;j<7;j++)
        {
            Status s1=jobs[j].getTaskStatus();
            if(s1.equals(s))
            {
                count++;
            }
        }
           return count; 
    }
    
    /**
     *
     * @return
     */
    public double computeTotalSalary()
    {
        return 0;
    } 
    
    @Override
  public String toString()
  {
      return String.format("Name: %s \nEmployee ID: %d \nAmount per Job: %d ",name,id,amountPerJob);
  }
  
}
