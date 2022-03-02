package ru.netology

fun main() {
    val likes = 11

    val peopleString = if (likes % 10 == 1 && likes != 11) "человеку" else "людям"

    println ("Понравилось $likes $peopleString")
}