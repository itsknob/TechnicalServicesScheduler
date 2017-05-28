/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technicalservicesscheduler;

import java.time.Duration;              //Used for getEventLength()
import java.time.LocalTime;             //Used for getEventLength()
import java.time.temporal.ChronoUnit;   //Used for getEventLength()
import java.time.temporal.Temporal;

/**
 *
 * @author Stephen Reilly
 */
public class Event {
    /* Variables */
    
    //Variables for displaying
    public String eventName;
    public String eventLocation;
    public String eventDate;
    public String eventStartTime;
    public String eventEndTime;
    public int eventNumberEmployees;
    public boolean eventRequiresManager;
    
    //Variables for Scheduling Events
    public String[] eventEmployeeList;
    public String eventManager;
    public int eventLength;
    
    
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
    /*
    public void getEventLength(){
        int start, end;
        LocalTime startTime, endTime;
        long hours, minutes;            //Used for interval of time.
        LocalTime maxHours = LocalTime.of(24, 00);
        
        //Convert to Integers
        start = Integer.parseInt(this.getEventStartTime());
        end = Integer.parseInt(this.getEventEndTime());
        
        //Split into hours and minutes (1834 turns into 18, 34)
        startTime = LocalTime.of(start/100, start % 100);
        endTime = LocalTime.of(end/100, end % 100);
        
        //If event takes no time
        if(start == end){
            this.eventLength = 0;
            return;
        }
        
        //If event ends next day
        if(end < start){    //IE start = 1634, end = 0230;
            Duration startLength = Duration.between(startTime, maxHours);
            Duration endLength = Duration.between(LocalTime.MIDNIGHT, endTime);
            
            Duration dur = startLength.addTo(endLength.getT);
            
            
        
            System.out.println(startLength);
            System.out.println(endLength);
            
            long diff = startLength.getSeconds() - endLength.getSeconds();
            System.out.println(diff);
            
            System.out.println(endLength.toHours() + startLength.toHours());
        
            this.eventLength = (maxHours - start) + end;
            return;
        }

        //Normal Event Hours (starts and ends same day)
        Duration length = Duration.between(startTime, endTime);
        System.out.println(length);
        
        hours = length.toHours();
        minutes = length.minusHours(hours).toMinutes();
        String convert = Long.toString(hours) + Long.toString(minutes);
        
        //Return value as integer. Fromatted: HHmm
        this.eventLength = Integer.parseInt(convert);
        
        
    }
    */
    
}
