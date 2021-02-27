package phone

class Phone(
        var number: Int,
        var model: String,
        var weight: Int
): PhoneParent(), SomeInterface {
    constructor(number: Int, model: String) : this(number, model, 0)
    constructor() : this(0, "", 0)

    fun receiveCall(name: String): String {
        return "Звонит $name"
    }

    fun getNumber(number: Int): Int {
        return number
    }

    fun receiveCall(name: String, number: Int): String {
        return "Звонит $name ($number)"
    }

    override fun parentMethod() {
        println("fasfas")
    }

    override fun someInterfaceMethod(): String {
        return "fas"
    }
}

fun main() {
    var p1 = Phone(7, "sdfsdf", 132)
    var p2 = Phone(8, "bbbbbb", 150)
    var p3 = Phone(10, "aaaaaa", 146)
//    var p4 = Phone(97
}