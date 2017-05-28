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
public class TechnicalServicesScheduler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UpcomingEvent testEvent1 = new UpcomingEvent("Test Event Name #1", "Test Event Location", "05192017", "1634", "1833", 4, true);
        UpcomingEvent testEvent2 = new UpcomingEvent("Test Event Name #2", "Test Event Location", "05192017", "1634", "1634", 4, true);
        UpcomingEvent testEvent3 = new UpcomingEvent("Test Event Name #3", "Test Event Location", "05192017", "1634", "1424", 4, true);
        testEvent1.getEventLength();
        //testEvent2.getEventLength();
        //testEvent3.getEventLength();
        System.out.println("Event1: " + testEvent1.eventLength);
        //System.out.println("Event2: " + testEvent2.eventLength);
        //System.out.println("Event3: " + testEvent3.eventLength);
    }
    
}
