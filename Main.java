import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        
        eventManager.createEvent("John and Jane's Wedding", LocalDateTime.of(2025, 6, 15, 14, 0), "123 Wedding Lane", "A beautiful wedding ceremony.", true, true);
        eventManager.createEvent("Tech Conference 2025", LocalDateTime.of(2025, 9, 10, 9, 0), "Online", "Annual tech conference.", false, true);

        System.out.println("All Events:");
        for (Event event : eventManager.getEvents()) {
            System.out.println(event);
        }

        eventManager.updateEvent("Tech Conference 2025", "Tech Conference 2025", LocalDateTime.of(2025, 9, 10, 10, 0), "Online", "Updated description for the tech conference.", false, true);

        Event event = eventManager.getEventByTitle("Tech Conference 2025");
        if (event != null) {
            System.out.println("Retrieved Event: " + event);
        }


        eventManager.deleteEvent("John and Jane's Wedding");


        System.out.println("All Events after deletion:");
        for (Event e : eventManager.getEvents()) {
            System.out.println(e);
        }
    }
}