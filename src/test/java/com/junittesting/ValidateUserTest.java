package com.junittesting;

import com.regex.*;
import org.junit.Assert;
import org.junit.Test;

public class ValidateUserTest {


    //    Testing for first name
    @Test
    public void givenFirstname_when1stLetterCap_ReturnsTrue(){
        boolean result = FirstName.validateFirstName("Mohini");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenFirstname_when1stLetterSmall_ReturnsFalse(){
        boolean result = FirstName.validateFirstName("mohinihamle4");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenFirstname_whenItContainsNumber_ReturnsFalse(){
        boolean result = FirstName.validateFirstName("Lakhan10");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenFirstname_whenItContainsSpecialSymbol_ReturnsFalse(){
        boolean result = FirstName.validateFirstName("Lakh@an^10");
        Assert.assertEquals(false, result);
    }

    //  Testing for last name
    @Test
    public void givenLastname_when1stLetterCap_ReturnsTrue(){
        boolean result = LastName.validateLastName("Ugile");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenLastname_when1stLetterSmall_ReturnsFalse(){
        boolean result = LastName.validateLastName("ugile");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastname_whenItContainsNumber_ReturnsFalse(){
        boolean result = LastName.validateLastName("Ug256");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastname_whenItContainsSpecialSymbol_ReturnsFalse(){
        boolean result = LastName.validateLastName("Ug257%&@8");
        Assert.assertEquals(false, result);
    }

    //    Testing for emails
    @Test
    public void givenEmail_WithMandatoryParts_ReturnsTrue(){
        boolean result = UserEmail.validateUserEmail("piyuugile@gmail.com");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_WithOptionalParts_ReturnsTrue(){
        boolean result = UserEmail.validateUserEmail("piyu.ugile@gmail.com.in");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_WithOutMandatoryParts_ReturnsFalse(){
        boolean result = UserEmail.validateUserEmail("piyu@.com");
        Assert.assertEquals(false,result);
    }

    //Testing for phone number
    @Test
    public void givenPhoneNumber_WithCountryCodeAndSpace_ReturnsTrue(){
        boolean result = PhoneNumber.validatePhoneNumber("91 9156509327");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPhoneNumber_WithoutCountryCodeAndSpace_ReturnsFalse(){
        boolean result = PhoneNumber.validatePhoneNumber("9156509327");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPhoneNumber_WithAlphabet_ReturnsFalse(){
        boolean result = PhoneNumber.validatePhoneNumber("91 91pu50R327");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPhoneNumber_WithSpace_ReturnsFalse(){
        boolean result = PhoneNumber.validatePhoneNumber("91 91pu5 R327");
        Assert.assertEquals(false,result);
    }

    //    Testing for password
    @Test
    public void giverPassword_WithMinimumLengthOf8_returnsTrue(){
        boolean result = FinalPassword.validatePassword("P@55iyu89a");
        Assert.assertEquals(true,result);
    }
    @Test
    public void giverPassword_WithoutMinimumLengthOf8_returnsFalse(){
        boolean result = FinalPassword.validatePassword("p@67uyik");
        Assert.assertEquals(false,result);
    }
    @Test
    public void giverPassword_WithSpecialCharacter_returnsFalse(){
        boolean result = FinalPassword.validatePassword("l@56piyur7");
        Assert.assertEquals(false,result);
    }
}