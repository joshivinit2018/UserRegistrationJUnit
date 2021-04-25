package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    @Test
    void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = UserValidator.validateFirstName("Vinit");
        Assertions.assertEquals(true, result);
    }
    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = UserValidator.validateFirstName("Vi");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = UserValidator.validateLastName("Joshi");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = UserValidator.validateLastName("jo");
        Assertions.assertEquals(false,result);
    }
}
