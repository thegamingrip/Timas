package com.arielviolla.timasfinal

import org.junit.Assert.assertEquals
import org.junit.Test

class MainActivityTest {

    @Test
    fun testCompareStrings_StringsEqual() {
        val viewModel = TicmasViewModel()
        val result = viewModel.compareStrings("hola", "hola")
        assertEquals(true, result)
    }

    @Test
    fun testCompareStrings_StringsNotEqual() {
        val viewModel = TicmasViewModel()
        val result = viewModel.compareStrings("ariel", "violla")
        assertEquals(false, result)
    }
}