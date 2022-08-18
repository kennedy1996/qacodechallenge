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
internal class UserDetailsActivityTest{
    @get:Rule var activityScenarioRule = activityScenarioRule<UserDetailsActivity>()

    @Test
    fun checkActivityVisibility(){
        onView(withId(R.id.layout_activity_user_details))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkGreetingTextViewVisibility(){
        onView(withId(R.id.greetingTv))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkFirstNameTextViewVisibility(){
        onView(withId(R.id.firstNameTv))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkLastNameTextViewVisibility(){
        onView(withId(R.id.lastNameTv))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkEmailTextViewVisibility(){
        onView(withId(R.id.emailTv))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkLogoutButtonVisibility(){
        onView(withId(R.id.logoutBtn))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkNavigateLogoutButton(){
        onView(withId(R.id.logoutBtn))
            .perform(click())
        onView(withId(R.id.layout_activity_main))
            .check(matches(isDisplayed()))
    }

}