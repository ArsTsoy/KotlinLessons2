package com.company

fun main() {
//    while (true) {
//
//    }
//
//    do {
//
//    } while (true) {
//
//    }

    val list: List<String> = listOf(
            "Asf", "dasf", "dasf", "fasf", "fasf", "fasf", "fasf", "fasf"
    )

    for (i in 0..10) {
        println(i)
    }
    for(i in list.indices) {
        println(list.get(i))
    }
    for(i in 0 until list.size - 1) {
        println(list[i])
    }
    list.forEach {
        println(it)
    }
    for(str in list) {
        println(str)
    }


    // for(int i = 0; i < 100; i+=3) { }
    for(i in 0..99 step 3) {

    }

}