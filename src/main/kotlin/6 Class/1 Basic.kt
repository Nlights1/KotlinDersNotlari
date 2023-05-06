package `6 Class`

//TODO Hata verir
//val name = "Gökhan"
//fun getName():String = "Gökhan"

//fun getName():String = "Gökhan"

/**
 * Class nedir
 * Class basitce aşağıdaki örnekteki gibi
 *
 * class Car (wheelCount: Int, color: String = "Red") {
 *     Ismi  | Dışarıdan alması gereken parametreler , almak zorunda değil aynı şekilde fonksiyonlarda da almak zorunda değiliz
 *     Geri donus tipi yok
 *     Bir classı  çağırmak için obje oluşturmak zorundayız
 *     Class lar büyük harfle başlar
 *     Fonksiyonlar küçük harflerle başlar
 *
 *     boş olan constructor a default constructor denir.
 * }
 *
 *
 */

class Car(wheelCount: Int, color: String = "Red") {
    //TODO buradaki primary constructor = vermek  zoruna değiliz ama bulunur
    //TODO Visiblity modify , @JvmOverloads verirken sadece constructor vermek zorundayız


    private val mWhellCount: Int
    private val mColor = color


    init {
        mWhellCount = wheelCount
        "primary const.created".printLog()
        "WheelCount :$wheelCount, Color : $mColor".printLog()
        /**
         * Inıt bloğu her zaman çalışır.
         */
    }

    /**
     * If caselerde ayırmada çirkin kod
     */
 /*   constructor(wheelCount: Int,color: String = "Red", name: String? = null, madeOf: String? = null): this(wheelCount){

        if (name == null){
            return
        }

        if (madeOf == null){

        }

    }*/

    constructor(wheelCount: Int, color: String = "Red", name: String) : this(wheelCount) {
        "1.secondary const.created".printLog()
        //TODO buradaki Secondary constructor
        /**
         *Her bir constructor primary constructor ı işaretlemek zorunda bunun içinde "this" bloğu kullanılır ve
         * primary constructor çağrılır.
         *
         *Ilk init sonra constructor kullanılıyor
         */
    }


    constructor(wheelCount: Int, color: String = "Red", name: String, madeOf: String, isGas:Boolean) : this(wheelCount) {
        "2.secondary const.created".printLog()
    }    //TODO buradaki Secundary constructor

}

/**
 * Kendi üye fonksiyonumuz olabilir
 */
fun starting(){

}


fun main() {

//    val car0 = Car() boş olsa bile primary constructor gözükmüyor  default constructor yazmasak bile init default constructor yani
//    (boş) çalışır.
    val car1 = Car(3, "Black")
    val car2 = Car(3, "Black", "Mini Copper")
    val car3 = Car(5,"Black","Cooper")
//  val car4 = Car(3, "Black", "Mini Copper", "Iron")
//  val car5 = Car(5,"Red","Mini Copper","Iron")
    val cars6 = Car(4,"Red","Mini Cooper","Gas",true)
}


fun String.printLog() { //TODO Printlogu , stringi extend eden fonksiyon
    println(this)
    println("------------------")
}