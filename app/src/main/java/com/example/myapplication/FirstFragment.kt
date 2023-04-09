package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentFirstBinding


open class Numbers () {
open var x = 10

open fun positive () {
    if (x >= 0) {
        println(++x);}
    else {
        println ("This number is not positive")}
    }
fun negative () {
    if (x < 0) {
        println(x-2);}
    else {
        println ("This number is not negative")}
    }
fun zero () {
    if (x == 0) {
        println("10");}
    else {
        println ("This number is not zero")}
}
}
class Numbers2 () : Numbers() {
    override var x = 10

    override fun positive () {
        if (x >= 0) {
            println(x-5);}
        else {
            println ("This number is not positive")}
    }}

class Cat () {
    val cats = 2

    fun count () {
        if (cats ==1) {
            println("This is a cat")
        }
        else {
            println("There are two cats")
        }
    }
}




