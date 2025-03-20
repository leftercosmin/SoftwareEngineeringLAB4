import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<Event> events;

    public EventManager() {
        this.events = new ArrayList<>();
    }

    public void createEvent(String title, LocalDateTime dateTime, String location, String description, boolean wishlistFeatureEnabled, boolean sharedMediaGalleryFeatureEnabled) {
        try {
            Event event = new Event(title, dateTime, location, description, wishlistFeatureEnabled, sharedMediaGalleryFeatureEnabled);
            events.add(event);
            System.out.println("Event created successfully: " + event);
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating event: " + e.getMessage());
        }
    }

    public List<Event> getEvents() {
        return events;
    }

    public Event getEventByTitle(String title) {
        for (Event event : events) {
            if (event.getTitle().equals(title)) {
                return event;
            }
        }
        return null;
    }

    public void deleteEvent(String title) {
        Event event = getEventByTitle(title);
        if (event != null) {
            events.remove(event);
            System.out.println("Event deleted successfully: " + title);
        } else {
            System.err.println("Event not found: " + title);
        }
    }

    public void updateEvent(String oldTitle, String newTitle, LocalDateTime newDateTime, String newLocation, String newDescription, boolean newWishlistFeatureEnabled, boolean newSharedMediaGalleryFeatureEnabled) {
        Event event = getEventByTitle(oldTitle);
        if (event != null) {
            event.setTitle(newTitle);
            event.setDateTime(newDateTime);
            event.setLocation(newLocation);
            event.setDescription(newDescription);
            event.setWishlistFeatureEnabled(newWishlistFeatureEnabled);
            event.setSharedMediaGalleryFeatureEnabled(newSharedMediaGalleryFeatureEnabled);
            System.out.println("Event updated successfully: " + event);
        } else {
            System.err.println("Event not found: " + oldTitle);
        }
    }
}