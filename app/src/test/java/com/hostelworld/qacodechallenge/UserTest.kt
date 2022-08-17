package com.hostelworld.qacodechallenge

import org.junit.Assert
import org.junit.Test


internal class UserTest {

    private val VALID_LAST_NAME = "Freitas"
    private val VALID_FIRST_NAME = "Kennedy"
    private val VALID_PASSWORD = "123"
    private val VALID_EMAIL = "kennedy@freitas.com.uk"

    private fun validUser(
        firstName: String? = VALID_FIRST_NAME, lastName: String? = VALID_LAST_NAME,
        email: String? = VALID_EMAIL, password: String? = VALID_PASSWORD,
    ): UserRegistrationResult {
        return RegisteredUsers.registerUser(firstName,lastName,email,password)
    }
    //Testing Create User
    @Test
    fun testCreateUserAllInformationsCorrectlyThenUserCreated() {
        val result = validUser(email = "email@internet2.com")
        Assert.assertEquals(UserRegistrationResult.Success, result)
    }
    @Test
    fun testCreateUserWithFirstNameIsBlankThenUserNotCreatedErrorUserInvalid() {
        val resultCreateUserCreateUser = validUser(firstName = " ")
        Assert.assertEquals(UserRegistrationResult.InvalidFirstName, resultCreateUserCreateUser)
    }
    @Test
    fun testCreateUserWithFirstNameIsNullThenUserNotCreatedErrorUserInvalid() {
        val resultCreateUser = validUser(firstName = null)
        Assert.assertEquals(UserRegistrationResult.InvalidFirstName, resultCreateUser)
    }
    @Test
    fun testCreateUserWithFirstNameIsSpaceThenUserNotCreatedErrorUserInvalid() {
        val resultCreateUser = validUser(firstName = " ")
        Assert.assertEquals(UserRegistrationResult.InvalidFirstName, resultCreateUser)
    }
    @Test
    fun testCreateUserWithFirstNameIsNumberThenUserNotCreatedErrorUserInvalid() {
        val resultCreateUser = validUser(firstName = "5")
        Assert.assertEquals(UserRegistrationResult.InvalidFirstName, resultCreateUser)
    }
    @Test
    fun testCreateUserWithFirstNameContaisNumberThenUserNotCreatedErrorUserInvalid() {
        val resultCreateUser = validUser(firstName = "Kevin 5 Kennedy")
        Assert.assertEquals(UserRegistrationResult.InvalidFirstName, resultCreateUser)
    }
    //Testing LastName in Create User
    @Test
    fun testCreateUserWithLastNameIsBlankThenUserNotCreatedErrorUserInvalid() {
        val resultCreateUserCreateUser = validUser(lastName = " ")
        Assert.assertEquals(UserRegistrationResult.InvalidLastName, resultCreateUserCreateUser)
    }
    @Test
    fun testCreateUserWithLastNameIsNullThenUserNotCreatedErrorUserInvalid() {
        val resultCreateUser = validUser(lastName = null)
        Assert.assertEquals(UserRegistrationResult.InvalidLastName, resultCreateUser)
    }
    @Test
    fun testCreateUserWithLastNameIsSpaceThenUserNotCreatedErrorUserInvalid() {
        val resultCreateUser = validUser(lastName = " ")
        Assert.assertEquals(UserRegistrationResult.InvalidLastName, resultCreateUser)
    }
    @Test
    fun testCreateUserWithLastNameIsNumberThenUserNotCreatedErrorUserInvalid() {
        val resultCreateUser = validUser(lastName = "5")
        Assert.assertEquals(UserRegistrationResult.InvalidLastName, resultCreateUser)
    }
    @Test
    fun testCreateUserWithLastNameContaisNumberThenUserNotCreatedErrorUserInvalid() {
        val resultCreateUser = validUser(lastName = "Kevin 5 Kennedy")
        Assert.assertEquals(UserRegistrationResult.InvalidLastName, resultCreateUser)
    }
    //Testing E-mail in Create User
    @Test
    fun testCreateUserWithEmailIsNullThenUserNotCreatedErrorUserInvalid() {
        val resultCreateUser = validUser(email = null)
        Assert.assertEquals(UserRegistrationResult.InvalidEmail, resultCreateUser)
    }
    @Test
    fun testCreateUserWithEmailIsBlankThenUserNotCreatedErrorUserInvalid() {
        val resultCreateUser = validUser(email = "")
        Assert.assertEquals(UserRegistrationResult.InvalidEmail, resultCreateUser)
    }
    @Test
    fun testCreateUserWithEmailIsSpaceThenUserNotCreatedErrorUserInvalid() {
        val resultCreateUser = validUser(email = " ")
        Assert.assertEquals(UserRegistrationResult.InvalidEmail, resultCreateUser)
    }
    @Test
    fun testCreateUserWithEmailInvalidType1ThenUserNotCreatedErrorInvalidEmail() {
        val resultCreateUser = validUser(email = "test")
        Assert.assertEquals(UserRegistrationResult.InvalidEmail, resultCreateUser)
    }
    @Test
    fun testCreateUserWithEmailInvalidType2ThenUserNotCreatedErrorInvalidEmail() {
        val resultCreateUser = validUser(email = "@.com")
        Assert.assertEquals(UserRegistrationResult.InvalidEmail, resultCreateUser)
    }
    @Test
    fun testCreateUserWithEmailInvalidType3ThenUserNotCreatedErrorInvalidEmail() {
        val resultCreateUser = validUser(email = "e")
        Assert.assertEquals(UserRegistrationResult.InvalidEmail, resultCreateUser)
    }
    @Test
    fun testCreateUserWithEmailInvalidType4ThenUserNotCreatedErrorInvalidEmail() {
        val resultCreateUser = validUser(email = "4")
        Assert.assertEquals(UserRegistrationResult.InvalidEmail, resultCreateUser)
    }
    @Test
    fun testCreateUserWithEmailInvalidType5ThenUserNotCreatedErrorInvalidEmail() {
        val resultCreateUser = validUser(email = "4letter@com")
        Assert.assertEquals(UserRegistrationResult.InvalidEmail, resultCreateUser)
    }
    //Testing Password in Create User
    @Test
    fun testCreateUserWithPasswordIsNullThenUserNotCreatedErrorPasswordInvalid() {
        val resultCreateUser = validUser(password = null)
        Assert.assertEquals(UserRegistrationResult.InvalidPassword, resultCreateUser)
    }
    @Test
    fun testCreateUserWithPasswordIsBlankThenUserNotCreatedErrorPasswordInvalid() {
        val resultCreateUser = validUser(password = "")
        Assert.assertEquals(UserRegistrationResult.InvalidPassword, resultCreateUser)
    }
    @Test
    fun testCreateUserWithPasswordIsSpaceThenUserNotCreatedErrorPasswordInvalid() {
        val resultCreateUser = validUser(password = " ")
        Assert.assertEquals(UserRegistrationResult.InvalidPassword, resultCreateUser)
    }
    //Testing User Login
    //With Email
    @Test
    fun testLoginUserWithFirstNameIsBlankThenUserNotLoginErrorUserInvalid() {
        val resultLoginUserLoginUser = RegisteredUsers.login(" $", VALID_PASSWORD)
        Assert.assertEquals(LoginResult.InvalidEmail, resultLoginUserLoginUser)
    }
    @Test
    fun testLoginUserWithEmailIsNullThenUserNotLoginErrorUserInvalid() {
        val resultLoginUserLoginUser = RegisteredUsers.login(null, VALID_PASSWORD)
        Assert.assertEquals(LoginResult.InvalidEmail, resultLoginUserLoginUser)
    }
    @Test
    fun testLoginUserWithEmailIsBlankThenUserNotLoginErrorUserInvalid() {
        val resultLoginUserLoginUser = RegisteredUsers.login("", VALID_PASSWORD)
        Assert.assertEquals(LoginResult.InvalidEmail, resultLoginUserLoginUser)
    }
    @Test
    fun testLoginUserWithEmailIsSpaceThenUserNotLoginErrorUserInvalid() {
        val resultLoginUserLoginUser = RegisteredUsers.login(" ", VALID_PASSWORD)
        Assert.assertEquals(LoginResult.InvalidEmail, resultLoginUserLoginUser)
    }
    @Test
    fun testLoginUserWithEmailInvalidType1ThenUserNotLogindErrorInvalidEmail() {
        val resultLoginUserLoginUser = RegisteredUsers.login("test", VALID_PASSWORD)
        Assert.assertEquals(LoginResult.InvalidEmail, resultLoginUserLoginUser)
    }
    @Test
    fun testLoginUserWithEmailInvalidType2ThenUserNotLogindErrorInvalidEmail() {
        val resultLoginUserLoginUser = RegisteredUsers.login("@.com", VALID_PASSWORD)
        Assert.assertEquals(LoginResult.InvalidEmail, resultLoginUserLoginUser)
    }
    @Test
    fun testLoginUserWithEmailInvalidType3ThenUserNotLogindErrorInvalidEmail() {
        val resultLoginUserLoginUser = RegisteredUsers.login("e", VALID_PASSWORD)
        Assert.assertEquals(LoginResult.InvalidEmail, resultLoginUserLoginUser)
    }
    @Test
    fun testLoginUserWithEmailInvalidType4ThenUserNotLogindErrorInvalidEmail() {
        val resultLoginUserLoginUser = RegisteredUsers.login("4", VALID_PASSWORD)
        Assert.assertEquals(LoginResult.InvalidEmail, resultLoginUserLoginUser)
    }
    @Test
    fun testLoginUserWithEmailInvalidType5ThenUserNotLogindErrorInvalidEmail() {
        val resultLoginUserLoginUser = RegisteredUsers.login("4letter@com", VALID_PASSWORD)
        Assert.assertEquals(LoginResult.InvalidEmail, resultLoginUserLoginUser)
    }
    //With Password
    @Test
    fun testLoginUserWithPasswordIsNullThenUserNotLogindErrorPasswordInvalid() {
        val resultLoginUserLoginUser = RegisteredUsers.login(VALID_EMAIL, null)
        Assert.assertEquals(LoginResult.InvalidPassword, resultLoginUserLoginUser)
    }
    @Test
    fun testLoginUserWithPasswordIsBlankThenUserNotLogindErrorPasswordInvalid() {
        val resultLoginUserLoginUser = RegisteredUsers.login(VALID_EMAIL, "")
        Assert.assertEquals(LoginResult.InvalidPassword, resultLoginUserLoginUser)
    }
    @Test
    fun testLoginUserWithPasswordIsSpaceThenUserNotLogindErrorPasswordInvalid() {
        val resultLoginUserLoginUser = RegisteredUsers.login(VALID_EMAIL, " ")
        Assert.assertEquals(LoginResult.InvalidPassword, resultLoginUserLoginUser)
    }
}