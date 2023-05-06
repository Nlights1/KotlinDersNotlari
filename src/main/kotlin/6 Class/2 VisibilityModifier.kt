package `6 Class`
// (Görünürlük düzenleyiciler)
/* private - protected - internal - public  */

//Todo Top Level nedir?
/* Herhangi bir class içerisinde yer almadan değişken , fonksiyon tanımlayabiliyoruz */

private val surnamea = "A"
public val surnameb = "B"
internal val surnamec = "C"

/**
protected val surnamed = "D"
*/


/*Protected kullanimi kotlinde top level da kullanılmıyor*/



open class Foo() {

    /**
     * Eğer VisibilityModifier (default) olarak yani belirlemezsek , public verir
     *
     * Java da ise VisibilityModifier de default olarak , private verir , java da internal fonksiyon yoktur.
     */

//--------------------------------------------------------------------------------------------------//

    private val name = "Gökhan" // Sadece bağlı bulunduğu class icerisinde kullanilir


    public var car = "Bmw" // Her yerden erişilebiliyor


    protected val email = "GeceToprak@gmail.com"
    //Miras alma olayı gibidir , kendisinde ve chil class larda public gibi davranır
    /*, ama class ın ve char class ın dışında private gibi davranır*/


    internal var age = 24 //Modül bazında , modül içinde public , modül dışında private

    //--------------------------------------------------------------------------------------------------//
    //todo Encapsulation nedir?

            /* Bir class'ın üye değişkenlerini private da tutup bu değişkene erişilecek olan fonksiyonları public de tutmaya denir  */
            /* Fonksiyonda gerek duymadıklarımızı private da tutup dışarı açmamızı istediğimiz olaylara public de tutmamıza denir */

    //--------------------------------------------------------------------------------------------------//

    fun printName() {
        println("Merhaba : $name")
        println("Araba : $car")
        println("Email : $email")
        println("Yaş : $age")
    }

    //--------------------------------------------------------------------------------------------------//

    fun getName():String{ // private değişkeni okuyabilmek icin
        return name
    }

}

class Boo private constructor(): Foo(){
    init {
//        name erişelemez çünkü private
        car
        email
        age
    }
}

//--------------------------------------------------------------------------------------------------//

fun main() {

    val foo = Foo()

    /*foo.name = "" */ // Private dışarıdan erişilmiyor
    foo.car = "Mercedes-Benz" //Public dışarıdan erişilebiliyor
    /* foo.email = "ArasToprak@gmail.com"*/ // Protected class ve char class dışında erişilemez
    foo.age = 12

    foo.getName()
}
