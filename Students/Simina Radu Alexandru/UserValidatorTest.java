import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class UserValidatorTest {

    @Test
    public void testValidUsers() {
        UserValidator newValidator = new UserValidator();
        User user1 = new User("1981101223021");
        User user2 = new User("2981001223031");
        User user3 = new User("1990111223241");
        User user4 = new User("1880521223021");
        User user5 = new User("2980218125021");
        try {
            System.out.println("First");
            newValidator.validate(user1);
        } catch (UserValidationFailedException e) {
            System.out.println("User 1 wasn`t validated");
        }
        try {
            System.out.println("Second");
            newValidator.validate(user1);
        } catch (UserValidationFailedException e) {
            System.out.println("User 2 wasn`t validated");
        }
        try {
            System.out.println("Third");
            newValidator.validate(user1);
        } catch (UserValidationFailedException e) {
            System.out.println("User 3 wasn`t validated");
        }
        try {
            System.out.println("Four");
            newValidator.validate(user1);
        } catch (UserValidationFailedException e) {
            System.out.println("User 4 wasn`t validated");
        }
        try {
            System.out.println("Fifth");
            newValidator.validate(user1);
        } catch (UserValidationFailedException e) {
            System.out.println("User 5 wasn`t validated");
        }
        System.out.println();
    }

    @Test
    public void testInvalidUser() {
        User user1 = new User("1981301223021");
        User user2 = new User("3981001223031");
        User user3 = new User("1990133223241");
        User user4 = new User("1880521210021");
        User user5 = new User("2980211305021");
        UserValidator newValidator = new UserValidator();

        try {
            System.out.println("First");
            newValidator.validate(user1);
        } catch (UserValidationFailedException e) {
            System.out.println("User 1 wasn`t validated");
        }
        try {
            System.out.println("Second");
            newValidator.validate(user2);
        } catch (UserValidationFailedException e) {
            System.out.println("User 2 wasn`t validated");
        }
        try {
            System.out.println("Third");
            newValidator.validate(user3);
        } catch (UserValidationFailedException e) {
            System.out.println("User 3 wasn`t validated");
        }
        try {
            System.out.println("Four");
            newValidator.validate(user4);
        } catch (UserValidationFailedException e) {
            System.out.println("User 4 wasn`t validated");
        }
        try {
            System.out.println("Fifth");
            newValidator.validate(user5);
        } catch (UserValidationFailedException e) {
            System.out.println("User 5 wasn`t validated");
        }
        System.out.println();
    }

}