package dk.via.session4.exercise4_1.model;

import dk.via.session4.exercise4_1.model.validation.PasswordValidator;
import dk.via.session4.exercise4_1.model.validation.UsernameValidator;

import java.util.ArrayList;
import java.util.List;

public class UserModelManager implements UserModel {
    private final List<User> users;

    public UserModelManager() {
        this.users = new ArrayList<>();
    }

    public void addUser(String username, String password, String emailString) {
        UsernameValidator.validateUsername(username);
        PasswordValidator.validatePassword(password);
        Email email = EmailFactory.createEmail(emailString);
        if (getUser(username) != null) {
            throw new IllegalStateException("User already exists.");
        }
        User user = new User(username, password, email);
        users.add(user);
    }

    public User getUser(String username) {
        for (User user : users) {
            if (username.equals(user.getUsername())) {
                return user;
            }
        }
        return null;
    }

    public User getLastUser() {
        if (users.isEmpty())
            return null;
        else
            return users.get(users.size() - 1);
    }

    public int getUserCount() {
        return users.size();
    }
}
