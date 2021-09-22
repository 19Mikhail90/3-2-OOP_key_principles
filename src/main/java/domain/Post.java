package domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int nameGroup;
    private int createdBy;
    private int date;
    private String text;

    private int replyOwnerId;
    private int friendsOnly;
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;

    private String postType;

    private PostSource postSource;
    private Geo geo;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;

    private boolean isFavorite() {
        return false;
    }

    private Donut donut;
    private int postponedId;
}


