package com.company.classes

//2-ой способ конструктора
class Car2Kotlin(
        var model: String,
        var age: Int,
        var power: Int
) {

    constructor(model: String) : this(model, 0, 0)
    constructor(model: String, age: Int) : this(model, age, 0)
}