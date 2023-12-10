package org.example.userTest;

import org.example.user.PasswordGenerator;

public class WrongFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "ab";
    }
}
