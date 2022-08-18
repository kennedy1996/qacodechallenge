package com.hostelworld.qacodechallenge

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
internal class LoginActivityTest{

    @get:Rule var activityScenarioRule = activityScenarioRule<LoginActivity>()

    @Test
    fun checkActivityVisibility(){
        onView(withId(R.id.layout_activity_login))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkEmailTextViewVisibility(){
        onView(withId(R.id.usernameEt))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkPasswordTextViewVisibility(){
        onView(withId(R.id.passwordEt))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkLoginButtonVisibility(){
        onView(withId(R.id.btnLogin))
            .check(matches(isDisplayed()))
    }
}