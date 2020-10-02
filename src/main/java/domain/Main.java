package domain;

public class Main {

    public static void main(String[] args) {

        CommentInfo commentInfo = new CommentInfo();
        commentInfo.setId(111);
        commentInfo.setTitle("Заголовок");
        commentInfo.setDescription("Описание");

        Post post = new Post();
        post.setId(1);
        post.setCommentsInfo(commentInfo);

    }
}
