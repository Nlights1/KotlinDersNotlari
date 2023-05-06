package `5 Function`

fun main() {

    /**
     *
     *  Uzerinde degisiklik yapmadigimiz (readOnly) siniflara ya da yapmak istemedigimiz siniflara , bu siniflarin
     *  icerisinde yazmadan fonksiyon tanimlamamizi saglar.Boylece o sinifa uye bir fonksiyon kazandirabilirsiniz.
     *  Bunu yaparken de unutmamaniz gereken ; yazdiginiz extension fonksiyon aslinda o sinifin bir gercek fonksiyonu olmaz.
     *
     *  Eger sadece class in icerisinde cagirdiysaniz sadece orada kullanabilirsiniz
     *
     * Sad but true story. Olsundu. Extension fonksiyonlar kalbinize girecekler.Bir sinifa ait olmalari gerekmez :)
     *
     * Reciver diye adlandiracagimiz bir sinifa ihtiyac duyar. Extension yazacagimiz sinifi idare eder.Reciver tanimi.
     *
     * Yapisal olarak;
     *
     * fun String.extPrint(handsomeValue : HandsomeOne) : Unit {
     * }
     *
     */

    val pi: Double = 3 + 0.14
    println(pi)

    val city: String = "Sehir"
    println(city)

    /**
     *  normal kullanim
     */

    log(pi)
    logs(city)

//--------------------------------------------------------------------------------------------------------------------------


    /**
     * Hem infix hemde extension kullanimi
     */

    (3 + 0.14).logn("Pi Number")
    1341.logn("")
    1341.toFloat()

    val result: Int = "3".extPlus("sfd", 7)
    val result2: Int = "3".extPlus("dafaw", 5)

    /**
     * class icine yazilan extension functions sadece class da kullanilir
     *
     * val school:Int = "3".setNumber
     */

    val shape = Shape()
    shape.setNumber(45)
    shape.main()
    shape.type = "sfdxca"
    println(shape.type)


}

/**
 * extensions fonksiyonlar sari renkte gozukurler
 */

fun String.extPlus(otherString: String, number: Int): Int = this.toInt() + otherString.toInt()

//--------------------------------------------------------------------------------------------------------------------------


/**
 * Hem infix hemde extension kullanimi
 */


infix fun Number.logn(emptyParam: String) {
    println(emptyParam + this)
}

infix fun String.logns(empty: String) {
    println(empty + this)

//--------------------------------------------------------------------------------------------------------------------------

}

/**
 *
 * normal kullanim
 */


fun log(number: Number) {
    println(number)
}

fun logs(string: String) {
    println(string)
}

fun extToString(string: String) {
    println(string)
}

//--------------------------------------------------------------------------------------------------------------------------

/**
 * class icine yazilan extension functions sadece class da kullanilir
 */

open class Shape {

    var intNumber: Int = 8

    fun setNumber(intNumber: Int) {
        this.intNumber = intNumber
    }

    fun main() {
        intNumber.logn("A")
    }

}


/**
 *
 * Bir sınıfta extension fonksiyon yazilabilidig gibi extension propert de yazilabilir.
 * Bunun sebebi aslinda property'lerin get() ve set() methodlarindan olusmasından dolayidir.
 * Bu extension property'lerin icerisinde field tanimlanmaz.
 * Dolayisiyla aslinda gercek anlamda bir degisken extension yapilamaz
 * Extensions variable yaparken değer ataması yapılmaz
 */

var Shape.type // Decompile edip karşılığına baktığımız zaman type ın extensions edilmiş şeklinde shape class ın içinde
    //görünmediği için hata veriyor olmadığı için direkt olarak atama yaptığımız için hata veriyor.
    get() = "Rectangle"
    set(value) {
    }


/**
 *
 * Open (Extend edilebilir) bir sinifa , sinif icinde bir open (overide edilebilir) extensions fonksiyon yazilirsa
 * bu sinifa miras(inherit) alan siniflar , ilgili extension fonksiyonu overide edebilir.
 *
 *
 */

class Rectangle : Shape() {}


/**
 *
 * NOTES:
 *
 * Nullable extension function da yazilabilir.
 * Compain objet'lere de extension yazilabilir.
 *
 */