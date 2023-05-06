package `5 Function`

import java.awt.Color

fun main() {

    /**
     *
     * Daha okunakli kodlar yazmak icin kullanilir.
     * . (nokta) kullanimini kaldirir
     * true or false daha okunakli
     * true.or(false)
     *
     * Bir fonksiyonu infix hale getirebilmek icin 5 sart vardir.
     *
     * 1- infix keywordu ile baslar
     * 2- fonksiyon bir uye fonksiyon olmalidir. yani ( bir sınıfa ait olmalidir)
     * 3- Ya da bir extension fonksiyon olabilir
     * 4- sadece bir parametre almalidir Maalesef bu parametre (vararg olmaz)
     * 5- infix method'un parametresi default deger olamaz.
     *
     *
     * Yapisal olarak ;
     *
     * infix fun indixMethod(gustOneParam : Awesome Param) : Wheatever{
     *
     * }
     *
     */

    val isStudent = false
    val isMale = true

    if (!isStudent and isMale) {
        kotlin.io.print("Öğrenci Olmayan Erkek")
    }

    //infix kullanimi

    isMale and isStudent
    isMale.and(isStudent)

    //--------------------------------------------------------------------------------------------------------------------------

    class ColorCLass {
        infix fun colors(color: String) {

        }

        infix fun colorsm(color: Int): Int {
            return 4
        }

        /*infix fun colorp(color: String = " Hazel") {     // calismaz

        }*/

        infix fun <T> colors(color: T) {

        }

        //--------------------------------------------------------------------------------------------------------------------------

        /* Bir sinifin icindeyken this kullanimi sizee bulundugu sinifi isaret eder.
        asagidaki kullanimda ColorClass().colors(color) kullanimi olusur aslinda (implicit)
        */


    }


}