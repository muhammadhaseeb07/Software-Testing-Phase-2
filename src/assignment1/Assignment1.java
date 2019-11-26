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
public class Assignment1 {
    
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter 1 to Calculate Salary of SPS Employees");
        System.out.println("Enter 2 to Calculate Salary of BPS Employees");
        System.out.println("Enter 3 to Calculate Salary of Visiting Employees");
        System.out.println("Enter -1 to exit");
        System.out.println();
        
        System.out.printf("Enter : ");
        int n=input.nextInt();
        while(n != -1)
        {
        switch(n)
        {
            case 1:
            {
                System.out.println();
                System.out.printf("Enter Name: ");
                input.nextLine();
                String name=input.nextLine();
                System.out.printf("\nEnter ID: ");
                int id=input.nextInt();
                System.out.printf("\nEnter Basic Salary: ");
                float bs=input.nextFloat();
                System.out.printf("\nEnter Amount per Job: ");
                int apj=input.nextInt();
                System.out.printf("\nEnter Amount Per Year: ");
                int apy=input.nextInt();
                System.out.printf("\nEnter Joining Date: \n");
                System.out.printf("Enter Day: ");
                int day=input.nextInt();
                System.out.printf("Enter Mon: ");
                int mon=input.nextInt();
                System.out.printf("Enter Year: ");
                int year=input.nextInt();
               
                RegularEmployee e1=new  RegularEmployee(true, new MyDate(day,mon,year), apy, name, id, bs, apj);
         
                e1.getTasks();
                e1.setBasicSalary(bs);
                e1.computeTax();
                e1.getExperienceYear();
                e1.computeTotalSalary();
                System.out.println("SPS Employees Salary");
                System.out.println(e1);
                
                break;
            }
            
            case 2:
            {
                System.out.println();
                System.out.printf("Enter Name: ");
                input.nextLine();
                String name=input.nextLine();
                System.out.printf("\nEnter ID: ");
                int id=input.nextInt();
                System.out.printf("\nEnter Grade: ");
                char ch=input.next().charAt(0);
                System.out.printf("\nEnter Amount per Job: ");
                int apj=input.nextInt();
                System.out.printf("\nEnter Amount Per Year: ");
                int apy=input.nextInt();
                System.out.printf("\nEnter Joining Date: \n");
                System.out.printf("Enter Day: ");
                int day=input.nextInt();
                System.out.printf("Enter Mon: ");
                int mon=input.nextInt();
                System.out.printf("Enter Year: ");
                int year=input.nextInt();
               
                RegularEmployee e2=new  RegularEmployee(false, ch, new MyDate(day,mon,year), apy, name, id, 0, apj);
               
                e2.getTasks();
                e2.setBasicSalary(0);
                e2.computeTax();
                e2.getExperienceYear();
                e2.computeTotalSalary();
                System.out.println("BPS Employees Salary");
                System.out.println(e2);
                
                System.out.println("\nApply for Leave");
                System.out.println("\nEnter 1 for Apply");
                System.out.println("Enter 0 for not Apply");
                
                int a;
                System.out.printf("Enter : ");
                a=input.nextInt();
                
                if(a==1)
                {
                System.out.printf("\nEnter Start Date: \n");
                System.out.printf("Enter Day: ");
                int day1=input.nextInt();
                System.out.printf("Enter Mon: ");
                int mon1=input.nextInt();
                System.out.printf("Enter Year: ");
                int year1=input.nextInt();
                System.out.printf("\nEnter  End Date: \n");
                System.out.printf("Enter Day: ");
                int day2=input.nextInt();
                System.out.printf("Enter Mon: ");
                int mon2=input.nextInt();
                System.out.printf("Enter Year: ");
                int year2=input.nextInt();
                    
                LeaveApplication la1= new LeaveApplication(new MyDate(day1,mon1,year1), new MyDate(day2, mon2, year2));
                int d=la1.getTotalDays();
                boolean b1;
                b1=e2.applyForLeave(la1);
                 {
                    if(b1==true)
                   {
                      System.out.println("\nLeave Approved!");
                      System.out.printf("\nDays: %d",d);
                   }
                   else
                   {
                      System.out.println("\nLeave Not Approved!");
                   }
                
                 }
                }
                break;
            }
            
            case 3:
            {
                System.out.println();
                System.out.printf("Enter Name: ");
                input.nextLine();
                String name=input.nextLine();
                System.out.printf("\nEnter ID: ");
                int id=input.nextInt();
                System.out.printf("\nEnter Amount per Job: ");
                int apj=input.nextInt();
                System.out.printf("\nEnter Number Hours: ");
                int nh=input.nextInt();
                System.out.printf("\nEnter Per Hour Rate: ");
                float phr=input.nextFloat();
                System.out.printf("\nEnter Bonus Rate: ");
                int br=input.nextInt();
                
                VisitingEmployee v1=new VisitingEmployee( nh, phr, br, name, id, 0, apj);
                
                v1.getTasks();
                v1.setBasicSalary(0);
                v1.computeTotalSalary();
                System.out.println("Visiting Employees Salary");
                System.out.println(v1);
                break;
            }
        }
            System.out.println();
            System.out.println("Enter 1 to Calculate Salary of SPS Employees");
            System.out.println("Enter 2 to Calculate Salary of BPS Employees");
            System.out.println("Enter 3 to Calculate Salary of Visiting Employees");
            System.out.println("Enter -1 to exit");
            System.out.println();
            
             System.out.printf("Enter : ");
             n=input.nextInt();
           
        } 
     }
}
