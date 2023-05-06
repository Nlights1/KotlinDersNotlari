package `5 Function`

import javax.swing.SpinnerNumberModel
import kotlin.math.pow


/**
 *
 *  fun keyword'u ile fonksyionlar baslar
 *  fonksiyon ismi verilir
 *  : operatoru ve geri donus degeri yazilir
 *  fonksiyon body'si acilir ve kapatilir
 *  geri donus degeri verilmeyen fonksiyonlar Unit tipini geri dondurur
 *
 */






/**
 *
 * Method ile fonksyion arasındaki fark nedir?
 *
 *  Java da method kotlinde fonksiyon olarak adlandırılır
 *
 *  first class citizen nedir = ana elemanlar
 *  yazılışlarındaki temel şartları - bir değişkene değer olarak alabilme , bir değişkeni değer olarak alabilme ,
 *  tek başına dosyanın üzerinde yazılabilme gibi
 *
 *  Fonksiyonlarda first class citizen tek başına kullanılabilir - Java da ise class'a ihtiyac duyar
 *
 */


fun main() {

//   Fonksiyon cagrilirken ismi ve paramtereleri kullanilir
//   Eger bir geri donusu varsa bir degiskene atanabilir.

    val takeSquare = take(2)
    val takeSquare2 = take(3)

    println(takeSquare)

    //    val squarevalue = 2 * 2 * 2
    //    val squarevalue3 = 3 * 3 * 3


    val takeCar = take(3)
    println(takeCar)

    //-------------------------------------------------------------------------------------------------------------------------------------//

    /*
    * Defualt degeri olan parametrelere sahip bir fonksiyon cagirilirken , default degeri olan parametrelere deger atamal sart degildir.
    * Default deferi olan bu parametrelere opsiyonel parametreler denir
    * Default deferi olan bu parametrelere deger atamadan fonksiyon cagirilicaksa bu durumda parametre sirasi degildir.
    * Ide'ye  hangi parametreye deger atadiginizi soylemek icin Named Argumants'leri kullanmamiz gerekir.
    *
    *
    * */

    reformatMessage("Message", true, 7, "tr")
    reformatMessage("Message", size = 7, lang = "tr")

    //-------------------------------------------------------------------------------------------------------------------------------------//

    //    Bir class'in fonksiyonunu cagirirken ise nokta isareti kullaniriz
    2.0.pow(3.0)
    //-------------------------------------------------------------------------------------------------------------------------------------//

    getUserInfo("Gökhan", "Öztürk", "Istanbul", "Turkiye", " ", key = 3)

    // vararg parametresi olarak arrayof kullanilmak istenirse * operatoru eklenmelidir (spread operator)
    // bu operator diger dillerdeki pointer kullanimi anlamina gelmez . Kotlinde pointer yoktur.
    getUserInfo(*arrayOf("Göhkan", "Öztürk", "Istanbul", "Turkey"), key = 4)

}
/* Parametre */ /* Geri donus degeri - yoksa unit veya : koymadan yazmayabilirsiniz */

fun take(number: Int): Int {
    return number * number
}

//-------------------------------------------------------------------------------------------------------------------------------------//

fun takeCubes(number: Int): Int {
    fun takeSquares(number: Int): Int {
        return number * number
    }

    return takeSquares(number) * number

}




//-------------------------------------------------------------------------------------------------------------------------------------//


/**
 *
 * = ile fonksiyonlara default deger verilebilir. (Defualt Argumant)
 * Default deger atamasi yapmak function overload islemini yapmamiza saglar.
 * Tekrar tekrar ayni fonksiyonun farkli varyasyonlarini yazmak durumunda kalmayiz.
 */

fun reformatMessage(message: String, isUpperCase: Boolean = false, size: Int, lang: String = "tr") {
    println("Message : " + message + "isUpperCase" + isUpperCase + "size" + size + "lang" + lang)
}

//-------------------------------------------------------------------------------------------------------------------------------------//
//TODO En fazla 7 tane vararg parametre sayisini gecmemeli.
fun getUserInfo(vararg userInfo: String, key: Int) {

    userInfo[0] // name

    userInfo.get(0) // name

    userInfo[1] // surname

    userInfo[2] // city

    userInfo[3] // country
}

fun getUserInfo2(vararg userInfo: String) {}

fun getUserInfo2(key: Int, vararg userInfo: String) {}

fun getUserInfo3(vararg userInfo: Any) {}

//-------------------------------------------------------------------------------------------------------------------------------------//

/**
 *
 * Default degeri olan parametrele sahip bir fonksiyon Java siniflarindan cagrilicaksa eger ,
 * Bu fonksyiona @JvmOverLoads annotation'i verilmelidir. Boylece yazilan kod Jvm'e hazir hale gelir.
 * ilgili fonksiyonun tum varyasyonlari yazilir (overload edilir)
 *
 */

@JvmOverloads
fun printss(message: String = " Mesaj") {
    println(message)
}

fun boo() {
    printss()
    printss("sdffdssd")
}


//-------------------------------------------------------------------------------------------------------------------------------------//

/**
 *
 * Bir fonksiyonu = koyularak da return edecegı deger yazilabilir. (Single-Expression kullanimi)
 *
 */

val userList = arrayOfNulls<String>(5)

fun getListCount(): Int = userList.size

fun getListCount2(): Int {
    return userList.size
}