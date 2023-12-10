package org.example.user;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {
        //as-is
        //RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();

        //to-be
        String randomPassword = passwordGenerator.generatePassword();

        if(randomPassword.length() >= 8 && randomPassword.length() <= 12) {
            this.password = randomPassword;
        }

    }

    public String getPassword() {
        return password;
    }
}
