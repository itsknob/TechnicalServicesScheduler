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
public class PastEvent extends Event{
    
    /**
     * Constructor
     * @param name
     * @param location
     * @param date
     * @param sTime
     * @param eTime
     * @param numEmp
     * @param reqManager
     */
    public PastEvent(String name, String location, String date, String sTime, String eTime, int numEmp, boolean reqManager){
        this.eventName = name;
        this.eventLocation = location;
        this.eventDate = date;
        this.eventStartTime = sTime;
        this.eventEndTime = eTime;
        this.eventNumberEmployees = numEmp;
        this.eventRequiresManager = reqManager;
    }
    
}