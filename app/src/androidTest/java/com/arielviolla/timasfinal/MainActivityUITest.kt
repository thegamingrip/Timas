package com.arielviolla.timasfinal

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityUITest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testCompareButton() {
        val str1 = "hola"
        val str2 = "Ariel"

        // Introducir texto en los campos de edición
        onView(withId(R.id.editText1)).perform(typeText(str1))
        onView(withId(R.id.editText2)).perform(typeText(str2))

        // Hacer clic en el botón de comparación
        onView(withId(R.id.compareButton)).perform(click())

        // Verificar el resultado en el TextView
        onView(withId(R.id.resultTextView)).check(matches(withText("Las cadenas son diferentes")))

    }
}