import java.time.LocalDateTime;
public class Event {
    private String eventName;
    private String eventType;
    private String eventDescription;
    private LocalDateTime eventTime; // date and time of event

    public Event(String eventName, String eventType, String eventDescription, LocalDateTime eventTime) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.eventTime = eventTime;
        this.eventDescription = eventDescription;
    }
    public String getEventName() {return eventName;}
    public String getEventType() {return eventType;}
    public String getEventDescription() {return eventDescription;}
    public LocalDateTime getEventTime() {return eventTime;}

    public void setEventName(String eventName) {this.eventName = eventName;}
    public void setEventType(String eventType) {this.eventType = eventType;}
    public void setEventDescription(String eventDescription) {this.eventDescription = eventDescription;}
    public void setEventTime(LocalDateTime eventTime) {this.eventTime = eventTime;}

    public void printEvent() {
        System.out.println("Patient Event: " + getEventName() + "occuring at " + getEventTime());
        System.out.println("Type: " + getEventType());
        System.out.println("Description: " + getEventDescription());
    }
}
