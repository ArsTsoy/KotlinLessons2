package classes

import java.lang.Exception

//1-ый вариант создания нескольких конструкторов
class Car1Kotlin(
        var model: String
) {
    var age: Int = 0
        private set

    var power: Int = 0

    constructor(model: String, age: Int, power: Int) : this(model) {
        this.age = age
        this.power = power
    }

    constructor(model: String, age: Int) : this(model) {
        this.age = age
    }


}