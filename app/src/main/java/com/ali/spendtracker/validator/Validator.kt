package com.ali.spendtracker.validator

object Validator {
    fun validateAmount(amount:Double,desc: String) : Boolean {
        return (amount>0 && desc.isNotEmpty())
    }
}