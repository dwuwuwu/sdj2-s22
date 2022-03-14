package dk.via.mvvm.model;

import java.beans.PropertyChangeListener;

public interface UserModel {
    void addUser(String username, String password, String email) throws IllegalArgumentException, IllegalStateException;

    User getUser(String username);

    User getLastUser();

    int getUserCount();

    void addPropertyChangeListener(String eventName, PropertyChangeListener listener);

    void removePropertyChangeListener(String eventName, PropertyChangeListener listener);
}
