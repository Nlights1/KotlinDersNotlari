package `5 Function`

/**
 *
 * Bir fonksiyon herhangi bir sinifin icerisinde degil de bir dosyanin icerisinde boslukta tanimlaniyorsa ,
 * buna top level function nedir. Yani fonksiyon denir.
 *
 *
 * Bir fonksiyon olustururken top level tanimlama yapilamiyoe , sadece bir sinifa ait fonksiyonlar yazilabiliyorsa
 * bunlara fonksyion degil , method denir.
 *
 */

fun main() {
    calculateAtom()

    project()
//    privateproject() fonksiyon icinde fonksiyon yazdıgımız icin gizli kalir
}

fun calculateAtom(message: String = " Atom ") {
    println(message)
}

//-------------------------------------------------------------------------------------------------------------------------------------//

/**
 *
 * Fonksiyon icerisinde fonksyion tanimi kotlin'de yapilabilir. Bu fonksiyonlara Local Functions denir.
 * Sebebi ise , yazdiginiz fonksiyonun kendi sinifinizda dahi cagrilmamasini istemeyebiliriz.
 * Bu fonksiyonun herhangi bir baska fonksiyon ya da sinif icin degistirilmesini istemeyebiliriz.
 * Reflaction ile fonksiyonlariniz erisilirken gizli kalmasini isteyebiliriz.
 * Bu gibi durumlarda bu cok onemli fonksiyonunuzu baska bir fonksyion icerisine yazabilirsiniz.
 *
 */

fun project() {

    val time = "Zaman"
    println(" TIME ")

    fun privateproject() {
        time.length
    }

    privateproject()
    println(" I dont see you :O ")
}

//-------------------------------------------------------------------------------------------------------------------------------------//

/**
 *
 * Bir sinifin icerisindeki fonksiyonlara uye fonksiyon denir.
 *
 */

class car {
    fun setColor(colorCodeId: Int = 12) {

    }

}
//--------------------------------------------------------------------------------------------------------------------------

/**
 *
 * Bir fonksiyon Generic tip aliyorsa , Generic Functionn olarak adlandilir.
 *
 */

fun <T> setColor(colorCodeId: T) { // Degisken tipini bilmedigimiz , veya iki farkli deger almasini istedigimiz zaman Interface arasında T yazılır

}
