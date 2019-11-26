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
public class LeaveApplication {
    private MyDate startDate;
    private MyDate endDate;
    private String reason;
    private LeaveType leave;
    private int totalDays;

    public LeaveApplication(MyDate startDate, MyDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public LeaveApplication(MyDate startDate,int totalDays) {
        this.startDate = startDate;
        this.totalDays = totalDays;
    }

    public int getTotalDays() {
        return (endDate.getDay()-startDate.getDay());
    }
    
}
