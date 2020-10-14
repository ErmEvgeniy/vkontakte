package domain;

public class CommentInfo {
    private int id;
    private String title;
    private String description;
    private int ownerId;
    private int fromId;
    private int date;
    private String text;
    private boolean friendsOnly;

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int owner_id) {
        this.ownerId = owner_id;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String titles) {
        title = titles;
    }

    public String getTitle() {
        return title;
    }
}
