package domain;

public class Main {

    public static void main(String[] args) {

        CommentInfo commentInfo = new CommentInfo();
        commentInfo.setId(111);
        commentInfo.setTitle("Заголовок");
        commentInfo.setDescription("Описание");
        commentInfo.setOwner_id(555);
        commentInfo.setFrom_id(115);
        commentInfo.setDate(1601632220);
        commentInfo.setText("пост от 1 октября");
        commentInfo.setFriends_only(1);

        Post post = new Post();
        post.setId(1);
        post.setCommentsInfo(commentInfo);

    }
}
