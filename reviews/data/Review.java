package reviews.data;

public class Review {
    private User user;
    private String comment;
    private float rating;

    public Review(User user, String comment, float rating)
    {
        this.user = user;
        this.comment = comment;
        this.rating = rating;
    }


    @Override
    public String toString() {
        return user + "\n" + comment + "\n" + rating; 
    }


    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public float getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
