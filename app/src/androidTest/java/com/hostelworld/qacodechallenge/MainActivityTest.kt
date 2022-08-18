package com.hostelworld.qacodechallenge

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
internal class MainActivityTest{

    @get:Rule var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun checkActivityVisibility(){
        onView(withId(R.id.layout_activity_main))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkLoginButtonVisibility(){
        onView(withId(R.id.btnLogin))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkCreateAccountButtonVisibility(){
        onView(withId(R.id.btnCreateAccount))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkNavigateLoginButton(){
        onView(withId(R.id.btnLogin))
            .perform(click())
        onView(withId(R.id.layout_activity_login))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkNavigateCreateAccountButton(){
        onView(withId(R.id.btnCreateAccount))
            .perform(click())
        onView(withId(R.id.layout_activity_create_account))
            .check(matches(isDisplayed()))
    }
}