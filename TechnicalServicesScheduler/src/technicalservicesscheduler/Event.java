/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technicalservicesscheduler;

/**
 *
 * @author Stephen Reilly
 */
public class Event {
    /* Variables */
    
    //Variables for displaying
    String eventName;
    String eventLocation;
    String eventDate;
    String eventStartTime;
    String eventEndTime;
    int eventNumberEmployees;
    boolean eventRequiresManager;
    
    //Variables for Scheduling Events
    String[] eventEmployeeList;
    String eventManager;
    
    
    /* Methods */
    
    /* Getters and Setters */
    //Name
    public void setEventName(String newName){
        this.eventName = newName;
    }
    
    public String getEventName(){
        return this.eventName;
    }
    
    //Location
    public void setEventLocation(String newLocation){
        this.eventLocation = newLocation;
    }
    
    public String getEventLocation(){
        return this.eventLocation;
    }
    
    //Date
    public void setEventDate(String newDate){
        this.eventDate = newDate;
    }
    
    public String getEventDate(){
        return this.eventDate;
    }
    
    //Start Time
    public void setEventStartTime(String newStartTime){
        this.eventStartTime = newStartTime;
    }
    
    public String getEventStartTime(){
        return this.eventStartTime;
    }
    
    //End Time
    public void setEventEndTime(String newEndTime){
        this.eventEndTime = newEndTime;
    }
    
    public String getEventEndTime(){
        return this.eventEndTime;
    }
    
    //Number of Employees
    public void setEventNumberEmployees(int newNumberEmployees){
        this.eventNumberEmployees = newNumberEmployees;
    }
    
    public int getEventNumberEmployees(){
        return this.eventNumberEmployees;
    }
    
    //Requires Manager
    public void setEventRequiresManager(boolean newRequiresManager){
        this.eventRequiresManager = newRequiresManager;
    }
    
    public boolean getEventRequiresManager(){
        return this.eventRequiresManager;
    }
    
    
    /* Additional Methods */

    /**
     * Gets length of event based on eventStartTime and eventEndTime.
     * 
     * eventStartTime and eventEndTime are formatted as 4 character strings
     * on a 24 hour clock cycle.
     * IE 8:34pm would be formatted as "1634"
     * 
     */
    public void getEventLength(){
        String eventLength;
        int start, end, length;
        
        //Convert to Integers
        start = Integer.parseInt(this.getEventStartTime());
        end = Integer.parseInt(this.getEventEndTime());
        
        //Time Subtraction

        //Convert to string - eventLength and return;
    }
    
    
}
