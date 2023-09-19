public class Posting {
    private String name;
    private String content;

    public Posting(User user, String content) {
        this.name = user.getDisplayName() + "<" + user.getEmail() + ">";
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }
}
