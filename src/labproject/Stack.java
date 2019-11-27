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
public class Stack {
    private int size;
    private String array[];
    private int index;
    Stack()
    {
        index=0;
        size=100;
        array=new String[size];   
    }
    public void push(String a)
    {array[index]=a;
            index++;  
    }
    public String pop()
    {
            index--;
            String a=array[index];
              return a;
    }
    public String top()
    {
        String arr=array[index-1];
        return arr;
    }
    public Boolean IsEmpty()
    {
        Boolean flag=false;
        if(index==0)
        {
            flag=true;
        }
        return flag;
    }
     public Boolean IsFull()
    {
        Boolean flag=false;
        if(index==99)
        {
            flag=true;
        }
        return flag;
    }
}
