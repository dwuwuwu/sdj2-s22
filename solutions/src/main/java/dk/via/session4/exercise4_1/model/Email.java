package dk.via.session4.exercise4_1.model;

public class Email {
    private final String username;
    private final String domain;

    public Email(String username, String domain) {
        this.username = username;
        this.domain = domain;
    }

    public String getUsername() {
        return username;
    }

    public String getDomain() {
        return domain;
    }

    @Override
    public String toString() {
        return username + '@' + domain;
    }
}
