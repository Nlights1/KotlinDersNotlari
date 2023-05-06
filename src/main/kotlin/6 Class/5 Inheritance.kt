package `6 Class`

//Miras Alma (Erişim düzenleyiciler)
/**
 * Miras Alma amaçları
 *
 * Bir class'ı  , başka bir class'a miras alıcak şekilde vermemizin amacı bu.
 * Onun özellikleriyle beraber kendi özelliklerim olsun , ben üst class'ımdan daha fazla bir şey yapabilim.
 * Üst class'a yaptığımız beceri setini her zaman eklemeyebiliriz.
 * Her char class üst class'dan daha fazla bir şey yapabiliyor.
 *
 * Java da her class dan miras alınabilir.Ve alınmaması için final keyword'u gereklidir.
 * Java da miras alırken " public class ChildJavaDeneme extends JavaDeneme " extends yazılır
 *
 * Kotlinde miras alabilmek için class'ın open alması gerekiyor.Ve kotlin'de tüm class'lar final durumdadır.Yani miras alınamaz.
 * Kotlinde miras alırken class Rectangle(name: String) : Shape(name) : yazılır
 *
 *
 * Birden fazla class miras alınamaz.(Java ve Kotlin için geçerli)
 *
 */

/**
 * open class Keyword'ü nedir?
 *Kotlinde miras alabilmek için class'ın open alması gerekiyor.
 *
 */

/**
 * final class Keyword'ü nedir?
 * Ve kotlin'de tüm class'lar final durumdadır.Yani miras alınamaz.
 *
 */

/**
 * ovveride ya da poliforfizm keyword'ü nedir?
 * Üst class da yapılan fonksiyonun ya da bir değişkenin anlamını ve yaptığı işi değiştirmeye ovveride ya da poliforfizm denir.
 */

/**
 * Super nedir?
 * En üst class daki durumu şuanki class a verme durumu
 */

/**Code Smells nedir?
 *
 * Kodun kötü kokmasına yani kötü durumda işlenmesine denir.
 *
 */

/**
 * Derlenmez nedir?
 *
 * Build sırasına hata almaya denir.
 */

//Class a open vermezsek final olur

open class Shape(val name: String) {
    var mColor: String = ""
    open var mEdgeCount: Int = 0

    constructor(name: String, color: String) : this(name) {
        mColor = color
    }


    constructor(name: String, color: String, edgeCount: Int) : this(name) {
        mColor = color
        mEdgeCount = edgeCount
    }

    open fun drawShape() {
        println("name:$name")
        println("color:$mColor")
        println ("edgeCount:$mEdgeCount")
        println(                        )
    }

    fun calculateArea(): Int = if (mEdgeCount != 0) {
        mEdgeCount * mEdgeCount
    } else {
        0
    }


}

open class Rectangle(name: String) : Shape(name) { //Miras alınmş

    fun main() {
        mColor
        mEdgeCount
        drawShape()
        calculateArea()
    }


     override var mEdgeCount: Int
        get() = super.mEdgeCount
        set(value) {}  //ovveride a farklı değer atamak


    override fun drawShape() {

        this.drawShape() //döngü halinde çalışmasını sağlar
        super.drawShape()  /* en üst classdaki drawShape i çağırmak : open fun drawShape() {
        println("name:$name")
        println("color:$mColor")
        println ("edgeCount:$mEdgeCount")
        println(                        )
    }*/

        calculateArea()

        val rectangle = """
        
        ********
        *      *
        *      *
        *      *
        ********
        """.trimIndent()
        println(rectangle)
    }

}

class Circle(name: String, color: String) : Shape(name, color) {
    override fun drawShape() {
        super.drawShape()

        val circle = """
            
            ........
          .          .
         .            .
        .              .
         .            . 
          .          .
            .........
        
        """.trimIndent()
        println(circle)
    }
}

open class Square(name: String, color: String, edgeCount: Int) : Shape(name, color, edgeCount) {
   final override fun drawShape() {
        super.drawShape()

        val square = """
            *******
            *     *
            *     *
            *******
          """.trimIndent()
        println(square)
    }

//    override fun calculateArea(){
//
//    }

//    fun drawShape(){ //Miras alınan herhangi bir shape class da bu fonksiyonun birebir aynısını yazamayız.(Üat class da ovveride olarak durduğu için yazamayız)
//
//    }

//    fun drawShape(){ //üst class da var olan drawShape i tekrar dan yazdığımız da hata verir
//
//    }

   /* fun drawShape(name: String){

    }*/


}

class OneMeterSquare: Square("OneMeteSquare","Yellow",4){

//    override fun drawShape() {
//        super.drawShape()
//  super.super.super()

    fun main(){
        drawshape() //default olarak kendi classındaki drawshape çağrıldığı anlamına gelir
        //ya da
        super.drawShape()

        this.drawShape() //alttaki yani yeni drawshape func. çağırmak için this kullanıyoruz
    }

    //    ust class daki drawsahpe final olursa , alt class da bu functions override edilemez. 0 an yazilmasi gerekiyor
    fun drawshape(){
    }

}




fun main() {
    val shape = Shape("Shape")
    val rectangle = Rectangle("Rectangle")
    val circle = Circle("Circle", "Magenta")
    val square = Square("Square", "Cyan", 1)

    shape.drawShape()


    rectangle.drawShape()
    circle.drawShape()
    square.drawShape()

}


