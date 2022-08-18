package com.hostelworld.qacodechallenge

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
internal class CreateAccountActivityTest{
    @get:Rule var activityScenarioRule = activityScenarioRule<CreateAccountActivity>()

    @Test
    fun checkActivityVisibility(){
        onView(withId(R.id.layout_activity_create_account))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkFirstNameEditTextVisibility(){
        onView(withId(R.id.firstNameEt))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkLastNameEditTextVisibility(){
        onView(withId(R.id.lastNameEt))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkEmailEditTextVisibility(){
        onView(withId(R.id.emailEt))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkPasswordEditTextVisibility(){
        onView(withId(R.id.passwordEt))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkCreateAccountButtonVisibility(){
        onView(withId(R.id.btnCreateAccount))
            .check(matches(isDisplayed()))
    }

}