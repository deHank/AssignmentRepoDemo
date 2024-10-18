import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class Schedule {
    private List<Event> events;
    public Schedule() {
        this.events = new ArrayList<>();
    }
    public void addEvent(Event newevent) {
        this.events.add(newevent);
    }
    public void removeEvent(Event newevent) {
        this.events.remove(newevent);
    }
    public List<Event> getEvents() {
        return this.events;
    }

    public boolean getAllEvents() {
        List<Event> result = new ArrayList<>();
        for (Event event : this.events) {
            event.printEvent();
        }
        //find a better way to handle this
        return true;
    }

    public List<Event> getEventbyDate(LocalDateTime date) {
        List<Event> result = new ArrayList<>();
        for (Event event : this.events) {
            if(event.getEventTime().toLocalDate().equals(date)) {
                result.add(event);
            }
        }
        return result;
    }
}
