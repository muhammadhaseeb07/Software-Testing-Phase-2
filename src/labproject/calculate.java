/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labproject;

/**
 *
 * @author MUHAMMAD WAQAS AFZAL
 */

public class calculate
{
    private Stack  s1;
    private Stack s2;
    private Stack s3;
    private Addition add;
    private Subtraction sub;
    private Division div;
    private Multiply mul;
    private Power power;
    
    
     public static double factorial(double n) {
        //1
        double fact = 1;
        //2
        for (int i = 1; i <= n; i++) {
            //3
            fact = fact * i;
        }
        //4
        return fact;
    }
    
    
    calculate()
    {
        s1=new Stack();
        s2=new Stack();
        s3=new Stack();
        add=new Addition();
        sub=new Subtraction();
        div=new Division();
        mul=new Multiply();
        power=new Power();
    }
    public double calc(String expression)
    {
        double answer=0;
       expression=expression.replaceAll("÷","/");
      // String[] separator=new String[]{"+","-","/","*"};
 
          //result=myString.split(separator);
        //String[] splitstr = expression.split("\\s+");
        String[] splitstr = expression.split("(?<=[-+*/()^])|(?=[-+*/()^])");
        int j;
        
        int length=splitstr.length;
        int l=length;
        int i=0;
        //if(splitstr.length<2)
        //{
          //  double a;
            //return a=Double.parseDouble(splitstr[0]);
       //}
        String check;
        String check4;
     //post fix expression;
        for (int k=0;k<l;k++)
        {
                check=splitstr[i];
                i++;
                
                if(check.equals("("))
                {
                    s1.push(check);
                }
                    
                else if(check.equals(")"))
                {
                    check=s1.pop();
                    while(!check.equals("("))
                    {
                        s2.push(check);
                        check=s1.pop();
                    }
                }
                 else if(check.equals("^") )
                {
                    s1.push(check);
                }
                  else if(check.equals("*") || check.equals("/") )
                {
                    Boolean f;
                    Boolean f1=true;
                    f=s1.IsEmpty();
                    if(f==f1)
                    {
                        s1.push(check);
                    }
                    else{
                        String check1=s1.pop();
                        if(check1.equals("^") )
                        {
                            s2.push(check1);
                            check4=s1.top();
                            while(check4.equals("^"))
                            {
                                check4=s1.pop();
                                s2.push(check4);
                                check4=s1.top();
                            }
                            check4=s1.top();
                             while(check4.equals("/"))
                             {
                                 check4=s1.pop();
                                s2.push(check4);
                                check4=s1.top();
                             }
                            s1.push(check);
                        }
                        else 
                        {
                            s1.push(check1);
                            s1.push(check);
                        }
                       //String check1=s1.pop();
                       // if(check1.equals("^") )
                        //{
                          //  s2.push(check1);
                            //check4=s1.top();
                            //while(check4.equals("^"))
                           // {
                             //   check4=s1.pop();
                               // s2.push(check4);
                               // check4=s1.top();
                           // }
                            //s1.push(check);
                        //}
                        //else 
                        //{
                         //   s1.push(check1);
                           // s1.push(check);
                        //}
                        
                    }
                }
                else if(check.equals("+") || check.equals("-") )
                {
                    Boolean f=true;
                    Boolean flag;
                  flag=s1.IsEmpty();
                  if(flag==f)
                  {
                      s1.push(check);
                  }
                  else
                  {
                      flag=s1.IsEmpty();
                  String check1=s1.top();
                   check1=s1.pop();
                   int count=0;
                    while (!check1.equals("(") )
                    {
                          f=false;
                            if((check1.equals("*") || check1.equals("/") || check1.equals("^") ||check1.equals("+")||check1.equals("-"))&&(flag==f))
                            {   
                                    s2.push(check1);
                                    count++;
                            } 
                            else
                            {
                                //s1.push(check1);
                                //s1.push(check);
                                break;
                            }
                            flag=s1.IsEmpty();
                          
                            if(flag==f)
                            {
                                
                                check1=s1.pop();
                            }
                    }  
                    if(check1.equals("("))
                    {
                        s1.push(check1);
                    }
                    s1.push(check);
                  }
                }   
                
                else if(check.equals("e"))
                {
                    s1.push(Double.toString(2.718281828));
                }
                else if(check.indexOf('C')>=0)
                {
                    String [] str=check.split(" ");
                    double n=Double.parseDouble(str[0]);
                    double r=Double.parseDouble(str[2]);
                    
                    String s=Double.toString((factorial(n) / (factorial(n - r) * factorial(r))));
                    s2.push(s);
                    
                }
                
                else if(check.indexOf('P')>=0)
                {
                    String [] str=check.split(" ");
                    double n=Double.parseDouble(str[0]);
                    double r=Double.parseDouble(str[2]);
                    
                    String s=Double.toString((factorial(n) / (factorial(n - r))));
                    s2.push(s);
                }
                
                else if(check.indexOf("!")>=0)
                {
                     String [] str=check.split(" ");
                    double n=Double.parseDouble(str[0]);
                   
                    
                    String s=Double.toString(factorial(n));
                    s2.push(s);
                }
                
                     else if(check.startsWith("hexa"))
                {
                    String [] str=check.split(" ");
                    int a=Integer.parseInt(str[1]);
                    String s=Integer.toHexString(a);
                    s2.push(s);
                    //s2.push(check);
                }
                     
                      else if(check.startsWith("bin"))
                {
                    String [] str=check.split(" ");
                    int a=Integer.parseInt(str[1]);
                    String s=Integer.toBinaryString(a);
                    s2.push(s);
                    //s2.push(check);
                }
                      
                       else if(check.startsWith("octa"))
                {
                    String [] str=check.split(" ");
                    int a=Integer.parseInt(str[1]);
                    String s=Integer.toOctalString(a);
                    s2.push(s);
                    //s2.push(check);
                }
                
                
                      else if(check.startsWith("Log"))
                {
                    String [] str=check.split(" ");
                    double a=Double.parseDouble(str[1]);
                    String s=Double.toString(Math.log10(a));
                    s2.push(s);
                    //s2.push(check);
                }
                     else if(check.startsWith("ln"))
                {
                    //check=splitstr[i];
                    String [] str=check.split(" ");
                    double a=Double.parseDouble(str[1]);
                    String s=Double.toString(Math.log(a));
                    s2.push(s);
                    
                    //s2.push(check);
                }
                
                  else if(check.startsWith("√"))
                {
                   // check=splitstr[i];
                    String [] str=check.split(" ");
                    double a=Double.parseDouble(str[1]);
                    String s=Double.toString(Math.sqrt(a));
                    s2.push(s);
                    
                    //s2.push(check);
                }
               
                else if(check.startsWith("cos"))
                {
                    //check=splitstr[i];
                    String [] str=check.split(" ");
                    double a=Double.parseDouble(str[1]);
                    a=Math.toRadians(a);
                    String s=Double.toString(Math.cos(a));
                    s2.push(s);
                    
                    //s2.push(check);
                }
                else if(check.startsWith("sin"))
                {
                    //check=splitstr[i];
                    String [] str=check.split(" ");
                    double a=Double.parseDouble(str[1]);
                    a=Math.toRadians(a);
                    String s=Double.toString(Math.sin(a));
                    s2.push(s);
                   
                    //s2.push(check);
                }
                else if(check.startsWith("tan"))
                {
                     //check=splitstr[i];
                    String [] str=check.split(" ");
                    double a=Double.parseDouble(str[1]);
                    a=Math.toRadians(a);
                    String s=Double.toString(Math.tan(a));
                    s2.push(s);
                  
                    //s2.push(check);
                }
                 else if(check.startsWith("tanh"))
                {
                     //check=splitstr[i];
                    String [] str=check.split(" ");
                    double a=Double.parseDouble(str[1]);
                    a=Math.toRadians(a);
                    String s=Double.toString(Math.tanh(a));
                    s2.push(s);
                    
                    //s2.push(check);
                } else if(check.startsWith("sinh"))
                {
                     //check=splitstr[i];
                    String [] str=check.split(" ");
                    double a=Double.parseDouble(str[1]);
                    a=Math.toRadians(a);
                    String s=Double.toString(Math.sinh(a));
                    s2.push(s);
                    
                    //s2.push(check);
                } else if(check.startsWith("cosh"))
                {
                     //check=splitstr[i];
                    String [] str=check.split(" ");
                    double a=Double.parseDouble(str[1]);
                    a=Math.toRadians(a);
                    String s=Double.toString(Math.cosh(a));
                    s2.push(s);
                    
                    //s2.push(check);
                }
                else
                {
                    s2.push(check);
                }
        }
        
          Boolean f=false;
          Boolean f1=false;
          f=s1.IsEmpty();
          while(f==f1)
          {
              check=s1.pop();
              s2.push(check);
                 f=s1.IsEmpty();
          }
          s3=new Stack();
           f=false;
           f1=false;
          while(f==f1)
          {   
              check=s2.pop();
              s3.push(check);
                 f=s2.IsEmpty();               
          }
      
          //calcultaing result;
          check=s3.pop();
          s2.push(check);
          if(s3.IsEmpty())
          {
              return answer=Double.parseDouble(s2.pop());
          }
          check=s3.pop();
          s2.push(check);
           f=false;
           f1=false;
        
          String check1;
          String check2;
          double a,b,c;
          while(f==f1)
          { 
              check=s3.pop();
               if(check.equals("+")||check.equals("-")||check.equals("*")||check.equals("/") ||check.equals("^"))
               {
                   check1=s2.pop();
                   check2=s2.pop();
                   if(check.equals("+"))
                   {
                       a=Double.parseDouble(check1);
                       b=Double.parseDouble(check2);
     
                       c=add.add(a,b);
                      check=Double.toString(c);
                       s2.push(check);
                   }
                   else if(check.equals("-"))
                   {
                       a=Double.parseDouble(check1);
                       b=Double.parseDouble(check2);
                       c=sub.sub(b,a);
                       check=Double.toString(c);
                       s2.push(check);
                   }
                   else if(check.equals("*"))
                   {
                       a=Double.parseDouble(check1);
                       b=Double.parseDouble(check2);
                       c=mul.mul(a,b);
                       check=Double.toString(c);
                       s2.push(check);
                   }
                   else if(check.equals("/"))
                   {
                       a=Double.parseDouble(check1);
                       b=Double.parseDouble(check2);
                       c=div.div(b,a);
                       check=Double.toString(c);
                       s2.push(check);
                   }
                    else
                   {
                       a=Double.parseDouble(check1);
                       b=Double.parseDouble(check2);
                       c=power.power(b,a);
                       check=Double.toString(c);
                       s2.push(check);
                   }
               }
               else
               {
                   s2.push(check);
               }
               f=s3.IsEmpty();
          }
          answer=Double.parseDouble(s2.pop());
        return answer;
    }
}
