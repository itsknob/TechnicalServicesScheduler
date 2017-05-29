/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technicalservicesscheduler;

/**
 *
 * @author Knob
 */
public class Employee {
    
    private int employeeEmployeeID;
    private int employeeStudentID;
    private String employeeFirstName;
    private String employeeLastName;
    enum employeeJobType { GENERAL, MIT, MANAGER };
    private String employePhoneNumber;
    private String employeeEmail;
    //String employeDateOfHire;
    //String employeDateOfGraduation;
    //String employeeShirtSize;
    //String employeeNotes;

    public void setEmployeeEmployeeID(int employeeEmployeeID) {
        this.employeeEmployeeID = employeeEmployeeID;
    }
    
    public int getEmployeeEmployeeID() {
        return employeeEmployeeID;
    }

    public void setEmployeeStudentID(int employeeStudentID) {
        this.employeeStudentID = employeeStudentID;
    }
    
    public int getEmployeeStudentID() {
        return employeeStudentID;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployePhoneNumber(String employePhoneNumber) {
        this.employePhoneNumber = employePhoneNumber;
    }

    public String getEmployePhoneNumber() {
        return employePhoneNumber;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }
        
    
}
