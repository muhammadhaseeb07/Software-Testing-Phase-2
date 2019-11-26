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
public class Task {
    private int taskid;
    private String taskname;
    private Status taskStatus;
    
    public String getDate()
    {
        return "12-09-2018";
    }

    /**
     *
     * @param taskStatus
     */
    public void setTaskStatus(Status taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Status getTaskStatus() {
        return taskStatus;
    }

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

   
}
