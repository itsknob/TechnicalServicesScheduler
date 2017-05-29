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
    private String eventName;
    private String eventLocation;
    private String eventDate;
    private String eventStartTime;
    private String eventEndTime;
    private int eventNumberEmployees;
    private boolean eventRequiresManager;
    
    //Variables for Scheduling Events
    private String[] eventEmployeeList;
    private String eventManager;
    private int eventLength;
    
    
    /* Methods */

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(String eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public String getEventEndTime() {
        return eventEndTime;
    }

    public void setEventEndTime(String eventEndTime) {
        this.eventEndTime = eventEndTime;
    }

    public int getEventNumberEmployees() {
        return eventNumberEmployees;
    }

    public void setEventNumberEmployees(int eventNumberEmployees) {
        this.eventNumberEmployees = eventNumberEmployees;
    }

    public boolean isEventRequiresManager() {
        return eventRequiresManager;
    }

    public void setEventRequiresManager(boolean eventRequiresManager) {
        this.eventRequiresManager = eventRequiresManager;
    }

    public String[] getEventEmployeeList() {
        return eventEmployeeList;
    }

    public void setEventEmployeeList(String[] eventEmployeeList) {
        this.eventEmployeeList = eventEmployeeList;
    }

    public String getEventManager() {
        return eventManager;
    }

    public void setEventManager(String eventManager) {
        this.eventManager = eventManager;
    }

    public int getEventLength() {
        return eventLength;
    }

    public void setEventLength(int eventLength) {
        this.eventLength = eventLength;
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
