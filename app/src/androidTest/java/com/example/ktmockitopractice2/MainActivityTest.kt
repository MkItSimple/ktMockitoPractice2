package com.example.ktmockitopractice2

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.junit.Assert.*
import org.junit.Test

class MainActivityTest {

    @Test
    fun testMain(){
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.hello))
            .check(matches(isDisplayed()))
    }
}