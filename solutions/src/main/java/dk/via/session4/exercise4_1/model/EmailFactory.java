package dk.via.session4.exercise4_1.model;

import dk.via.session4.exercise4_1.model.validation.EmailValidator;

public class EmailFactory {
    public static Email createEmail(String email) {
        EmailValidator.validateEmail(email);
        String[] parts = email.split("@");
        return new Email(parts[0], parts[1]);
    }
}
