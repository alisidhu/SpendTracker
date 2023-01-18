package com.ali.spendtracker.validator

import com.google.common.truth.Truth.assertThat
import org.junit.Test

internal class ValidatorTest{
    @Test
    fun whenInputIsValid(){
        val amount = 100.0
        val desc = "Hello"
        val result = Validator.validateAmount(amount, desc)
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun whenInputIsInValid(){
        val amount = 0.0
        val desc = ""
        val result = Validator.validateAmount(amount, desc)
        assertThat(result).isEqualTo(false)
    }
}