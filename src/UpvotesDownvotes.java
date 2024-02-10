public class UpvotesDownvotes {
    public static int getVoteCount(int upvotes, int downvotes) {
        int getVoteCount = upvotes - downvotes;
        return getVoteCount;
    }
    public static void main(String[] args) {
        System.out.println(getVoteCount(13,0));
    }
}
