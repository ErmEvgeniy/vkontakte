package domain;

public class Post {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CommentInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    private CommentInfo commentsInfo;
}
