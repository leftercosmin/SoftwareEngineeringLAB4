import java.time.LocalDateTime;

public class Event {
    private String title;
    private LocalDateTime dateTime;
    private String location;
    private String description;
    private boolean wishlistFeatureEnabled;
    private boolean sharedMediaGalleryFeatureEnabled;

    public Event(String title, LocalDateTime dateTime, String location, String description, boolean wishlistFeatureEnabled, boolean sharedMediaGalleryFeatureEnabled) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Event title is required.");
        }
        if (dateTime == null) {
            throw new IllegalArgumentException("Event date and time are required.");
        }
        if (location == null || location.isEmpty()) {
            throw new IllegalArgumentException("Event location is required.");
        }

        this.title = title;
        this.dateTime = dateTime;
        this.location = location;
        this.description = description;
        this.wishlistFeatureEnabled = wishlistFeatureEnabled;
        this.sharedMediaGalleryFeatureEnabled = sharedMediaGalleryFeatureEnabled;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Event title is required.");
        }
        this.title = title;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        if (dateTime == null) {
            throw new IllegalArgumentException("Event date and time are required.");
        }
        this.dateTime = dateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (location == null || location.isEmpty()) {
            throw new IllegalArgumentException("Event location is required.");
        }
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isWishlistFeatureEnabled() {
        return wishlistFeatureEnabled;
    }

    public void setWishlistFeatureEnabled(boolean wishlistFeatureEnabled) {
        this.wishlistFeatureEnabled = wishlistFeatureEnabled;
    }

    public boolean isSharedMediaGalleryFeatureEnabled() {
        return sharedMediaGalleryFeatureEnabled;
    }

    public void setSharedMediaGalleryFeatureEnabled(boolean sharedMediaGalleryFeatureEnabled) {
        this.sharedMediaGalleryFeatureEnabled = sharedMediaGalleryFeatureEnabled;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", dateTime=" + dateTime +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", wishlistFeatureEnabled=" + wishlistFeatureEnabled +
                ", sharedMediaGalleryFeatureEnabled=" + sharedMediaGalleryFeatureEnabled +
                '}';
    }
}