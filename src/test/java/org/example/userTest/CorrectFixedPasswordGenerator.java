package org.example.userTest;

import org.example.user.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "abcdefgh";
    }
}
