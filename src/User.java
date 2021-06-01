public class User {
    private String username;
    public User(String username) {
        setUsername(username);
    }

    private void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
