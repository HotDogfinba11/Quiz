import java.util.Random
import kotlin.system.exitProcess

var point = 0
var quesamount = 20

fun ques0() {
    println("Name for base-2 number system:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "binary") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }


    if (ques != "binary") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques0()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques1() {
    println("Number system that uses the characters 0-F:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "hexidecimal") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "hexidecimal") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques1()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques2() {
    println("7-bit text encoding standard:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "ascii") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "ascii") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques2()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques3() {
    println("16-bit text encoding standard:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "unicode") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "unicode") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques3()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques4() {
    println("A number that is bigger than the maximum number that can be stored:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "overflow") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "overflow") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques4()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques5() {
    println("What is 8 bits:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "byte") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "byte") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques5()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques6() {
    println("What is 1024 bytes:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "kilobyte") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "kilobyte") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques6()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques7() {
    println("The smallest element of every image displayed on computer:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "pixel") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "pixel") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques7()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques8() {
    println("A continuously changing wave, such as natural sound:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "analogue") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "analogue") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques8()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques9() {
    println("The number of times per second that a wave is measured:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "sample rate") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "sample rate") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques9()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques10() {
    println("A binary representation of a program:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "machine code") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "machine code") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques10()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques11() {
    println("What does NIC stand for:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "network interface controller") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "network interface controller") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques11()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques12() {
    println("What cycle does a CPU follow:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "fetch-decode-execute") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "fetch-decode-execute") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques12()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques13() {
    println("What does ALU stand for:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "arithmetic and logic unit") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "arithmetic and logic unit") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques13()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques14() {
    println("What is an accumulator(ACC) an example of:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "cpu registert") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "cpu register") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques14()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques15() {
    println("How many volts is 1 in binary:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "5") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "5") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques15()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques16() {
    println("Which one of L1, L2 or L3 is the fastest:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "l1") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "l1") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques16()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques17() {
    println("What does RAM stand for:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "random access memory") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "random access memory") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques17()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques18() {
    println("Is secondary storage 'volatile' or 'non-volatile':")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "non-volatile") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "volatile") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques18()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques19() {
    println("What does WAN stand for:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "wide area network") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "wide area network") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques19()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques20() {
    println("What does LAN stand for:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "local area network") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "local area network") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques20()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques21() {
    println("Name for a PC in a network:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "node") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "node") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques21()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques22() {
    println("Typical size of a packet in bytes:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "1500") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "1500") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques22()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques23() {
    println("Malicious software hat modifies the host OS to prevent detection:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "rootkits") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "rootkits") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques23()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques24() {
    println("What is the name given to '%' in the context of programming:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "modulo") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "modulo") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques24()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques25() {
    println("Is either float, double or decimal 128-bit floating point data type:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "decimal") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "decimal") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques25()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques26() {
    println("What does DNS stand for:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "domain name server") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "domain name server") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques26()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques27() {
    println("Mid-point between the host OS and hardware:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "kernel") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "kernel") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques27()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques28() {
    println("Is HDMI analogue or digital:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "digital") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "kernel") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques28()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun ques29() {
    println("What does GUI stand for:")
    val ques = readLine()!!

    if (quesamount !=0) {
        if (ques == "graphical user interface") {
            point += 1
            quesamount -= 1
            println("Well done!")
            random()
        }
    }else{
        println("You got $point points")
    }

    if (ques != "graphical user interface") {
        println("Incorrect. Try again or (Q) for quit, (R) to try again and (N) for a new question")
        val ans = readLine()!!

        when (ans) {
            "q" -> exitProcess(1)
            "r" -> ques29()
            "n" -> random()
            else -> exitProcess(1)
        }
    }


}

fun main(args:Array<String>) {
    println("You will get 20 questions at random")
    Thread.sleep(250)
    println("Good luck answering the questions!")
    Thread.sleep(1_000)

    random()
}


fun random() {


    val randomNumber: Int = Random().nextInt(30)

    when (randomNumber) {
        0 -> ques0()
        1 -> ques1()
        2 -> ques2()
        3 -> ques3()
        4 -> ques4()
        5 -> ques5()
        6 -> ques6()
        7 -> ques7()
        8 -> ques8()
        9 -> ques9()
        10 -> ques10()
        11 -> ques11()
        12 -> ques12()
        13 -> ques13()
        14 -> ques14()
        15 -> ques15()
        16 -> ques16()
        17 -> ques17()
        18 -> ques18()
        19 -> ques19()
        20 -> ques20()
        21 -> ques21()
        22 -> ques22()
        23 -> ques23()
        24 -> ques24()
        25 -> ques25()
        26 -> ques26()
        27 -> ques27()
        28 -> ques28()
        29 -> ques29()

    }
}


