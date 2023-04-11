package com.example.androidapp

import android.util.Log

class Collections(){

    fun logs () {
    var cars = mutableListOf( "BMW", "Mercedes", "Audi")
        cars.add ("Opel")
    for(s in cars)
    Log.d ("TEST ANDROID", s)

    val animals = listOf( "Dog", "Cat", "Lion")
        for(el in animals)
            Log.d ("TEST ANDROID", el)

    var positiveNumbers = mutableSetOf( 2, 4, 6, 10)
    positiveNumbers.add (1)
    for(i in positiveNumbers)
        Log.d ("TEST ANDROID", i.toString())

    val negativeNumbers = setOf( -2, -5, -10, -8)
    for(a in negativeNumbers)
        Log.d ("TEST ANDROID", a.toString())

    var workers = mutableMapOf("Director" to 1, "Accountant" to 2, "Manager" to 3)
        workers["Recruiter"] = 4
        for(d in workers)
        Log.d ("TEST ANDROID", d.toString())

    val workers2 = mapOf("Director" to 1, "Accountant" to 2, "Manager" to 3)
    for(b in workers2)
    Log.d ("TEST ANDROID", b.toString())
}}