package `3 ControlFlow`

/**
 *
 * Overloading nedir?
 *
 * Operatorea aşırı yükleme;,
 * var olan göreve ekstra anlam katmak veya görevi değiştirmeye denir
 * aynı class içinde aynı isme sahip farklı argümanlara olana denir.
 *
 */


data class PairNumber(val numberOne: Int, val numberTwo: Int) {

    operator fun minus(pairNumber: PairNumber): PairNumber {

        val returnPairProject = PairNumber(
            numberOne - pairNumber.numberOne,
            numberTwo - pairNumber.numberTwo
        )

        println("Sonuc = (${returnPairProject.numberOne} , ${returnPairProject.numberTwo})")

        return returnPairProject

    }


}

fun main() {

    val a = 5
    val b = 8

    //operatorler arka planda karşılğı olan(corresponding) methodu cagirir.
    var result = a + b
    result = a.plus(b)

    val pairNumberOne = PairNumber(2, 4)
    val pairNumberTwo = PairNumber(-8, 11)

    //  val resultOne = pairNumberOne.numberOne - pairNumberTwo.numberOne
    //  val resultTwo = pairNumberOne.numberTwo - pairNumberTwo.numberTwo

    //  println("Sonuc = ($resultOne , $resultTwo)")

    val pairNumber = pairNumberOne - pairNumberTwo

    val pairNumber2 = pairNumberOne - pairNumberTwo

    val pairNumber3 = pairNumberOne - pairNumberTwo

    val pairNumber4 = pairNumberOne - pairNumberTwo

    val pairNumber5 = pairNumberOne - pairNumberTwo

    val pairNumber6 = pairNumberOne.minus(pairNumberTwo)


}