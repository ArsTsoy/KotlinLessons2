fun main() {
    val s = "fasf"
    println("fasf" + " " + s)
}

fun method(): Boolean {
//    int n = 10;
    val n: Int = 10
//    n = 10

    var n2 = n
    n2 = 14
    n2 = 10

    val a = "fsf"
//    val a2: Main1 = Main1()

    val s = "ASFAS"

    if (s == "ASFAS" && n2 == 14 || a == "fsf") {
        println("equal")
    } else if (true) {

    } else {
        println("not equal")
    }

    when (a) {
        "ASFAS" -> {
            println("afsf")
            println("fasf")
        }
        "R" -> println("fasf")
        "F" -> println("fasf")
        "A" -> println("fasf")
        "T" -> println("fasf")
        else -> println("fasf")
    }

    when {
        a == "fas" && a == "asd" -> println("dasd")
        else -> println("fasf")
    }
    println(n)
    println(n2)
    return true
}

fun method2(): Int {
    val a = 1
    return if (a == 1) {
        println("fsaf")
        2
    } else if (a == 2) {
        3
    } else {
        4
    }
}

fun method3(): Int {
    val a = 1
    return when (a) {
        1 -> {
            println("fsaf")
            2
        }
        2 -> 3
        else -> 4
    }
}