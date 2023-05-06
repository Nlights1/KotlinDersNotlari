package `5 Function`

import javax.swing.Timer

fun main() {

    val name = " Gökhan "
    val surName = "Öztürk"
    val fullName = name + " " + surName

    fun deneme(fullName: String): String {
        return "Hello" + fullName
    }

    fun deneme2(fullName: String): String {
        return "Hello2" + fullName
    }

    val welcome:String = deneme(fullName)

    deneme(deneme2(fullName))

    //--------------------------------------------------------------------------------------------------------------------------

    /**
     *  Fonksiyonlar Kotlinde "Firts Class Citizen"dır. Yani degiskelere deger olarak atanabilir, baska fonksiyonda
     *  parametre olarak verilebeilir ya da bir fonksiyonun geri donus degeri olabilir.
     *
     *  Higher Order Function'lar daha da basitce fonksiyon body'sidir.
     *
     *  TODO Higher Order Function'lar basitce bir fonksiyona parametre olarak verilen fonksiyonlardır.
     *  Parametre olarak verilmekten kasit,fonksiyonun cagriminin parametre kismini yapilmasi degil, fonnksiyon govdesinin(body)
     *  yani suslu parantezler arasinda kalan gorev alaninin baska bir fonksiyona parametre olarak verilmesidir.
     *
     *  Yapisal Olarak;
     *
     *  fun foo(higherOrderFunction:(message: String) -> Unit){
     *
     *  some bussiness logicss
     *  some bussiness logicss
     *  some bussiness logicss
     *  some bussiness logicss
     *
     *    higherOrderFunction("Codemy")
     *  //println("Message :$message")
     *
     *  }
     *
     *  fun boo(boo:String){
     *  }
     *
     * Cagrilirken ;
     *
     * fun main(){
     *
     *    boo("Merhaba")
     *
     *    foo({message ->
     *    println ("Message :$message")})
     *
     * }
     */

    //--------------------------------------------------------------------------------------------------------------------------

    /**
     * Higher Order Function'lari tanimlamanin 3 yolu vardır
     */

    /**
     * Bir degiskene atayarak Higher Order Function tanimlayabilirsiniz.
     * Bu durumda asuslu parantezler yanina higher order function'in aldigi parametreler lambda okunmadan once aralarına virgül.
     * koyularak yazilir.
     * Higher Order Function tek parametre aliyorsa , bu parametreleri yazmak zorunda degilsinizdir.
     * Bu durumda higher order function size "it" kelimesi ile Higher Order Function parametresi tipinde bir degisken vericek.
     */


    val higherOrderFunction = { surName: String ->
        println("surname: $surName")
        "surname: $surName"
    }

    /**
     * Ismii olmayan "anonymous function" tanimlamalari da Higher Order Function olarak , normal bir fonksiyona parametre olarak verilebilir.
     */

    val anonymousFunction = fun(surName: String): String {
        return "surname : $surName"
    }

    /**
     * Anonymous Function'in expression kullanimini dd yine Higher Order Function olarak normal bir fonksiyona parametre olarak verilebilir.
     */

    val anonymousFunction2 =
        fun(surname: String): String = "surname : $surName" // TODO Expression kullaniminda debug kullanilir

    /**
     * Higher Order Function
     */

    fun logPrint(message: String, count: Int): String {
        return "log $message"
    }

    fun foo(higherOrderFunction: (message: String, count: Int) -> String) {
        higherOrderFunction("Codemy", 48) //logprint ("Codemy",24)
    }

    logPrint("IM Okey", 45)
    foo(::logPrint)

    //--------------------------------------------------------------------------------------------------------------------------

    /**
     * Higher Order Function'la ayni parametrew sayisinsa sahip ve bu parametrelerin hepsinin tipleri Higher Order Function
     * parametre tipleri ile ayni ise , bu normal bir fonksiyon da Higher Order Function olarak normal bir fonksiyona
     * parametre olarak verilebilir. Bunu yapmak icin sadece :: koymak yeterli
     */

    val news = News()
    news.read(::println)
    news.read({ title ->
        print("fssdgs")
    })

    news.read { title ->
        println(title)
    }

    news.read {
        print(it)
    }

    val titleFun = fun(title: String): Unit {
        println(title)
    }

    news.read(titleFun)

    printUserInfo(getName(), higherOrderFunction, getAge())
    printUserInfo(getName(), anonymousFunction, getAge())
    printUserInfo(getName(), fun(surName: String): String {
        return "surname $surName"
    }, getAge())

    //Suslu parantezler(body)direkt olarak Higher Order Functiion'in paremtre olarak bekledigi alana da yazilabilir.
    printUserInfo(getName(), {
        "surname : $it"
    }, getAge())

    getItemClickListener({ buttonName ->
        println("$buttonName tıklandı..")
    })

    getItemClickListener({buttonName ->
        println("$buttonName tıklandı...")
    })


    //--------------------------------------------------------------------------------------------------------------------------

    /**
     * Eger bir fonksyion parametreleri icerisinde bir Higher Order Function son parametre olarak tanimladiysa,
     * bu isteniyorsa, bu Higher Order Function, fonksiyon parametrelerin disina da yazilabilir.
     */

    val newsType = NewsType()

    news.getNewsFromServer("FoxTv", newsType, {
        println(this.toString())
    }) //Higher Order Function, fonksyion parametrelerinin icerisinde tanimlanmistir.


    news.getNewsFromServer("ShowTv",newsType) {
        println(this.toString())
    }
     // Higher Order Function , fonksiyon parametrelerinin disinda tanimlanmistir

    //--------------------------------------------------------------------------------------------------------------------------

    /**
     * Higher Order Function birden fazla parametre iceriyorsa , aralarina virgul koyarak lambda isareti ile tanimlanmistir.
     * Tek parametreye sahipse bu durumda parametre ismi ve lambda isaret koyulmayabilir. Bu duruöda ilgili parametre
     * kelimesi ile cagrilabilicektir.
     * Eger bir fonksyion, paremetre olarak sadece Higher Order Fımction aliyorsa bu durumad fonksyion parantezleri
     */

    news.filterNews { filterType, getFilterName ->
        print("$filterType")
        getFilterName()
    }

    //--------------------------------------------------------------------------------------------------------------------------
}

//Normal bir fonksiyon
fun getName(): String {
    return "Gökhan"
}

// Normal bir Fonksiyon,expression kullanima ornek
fun getAge(): Int = 27

//--------------------------------------------------------------------------------------------------------------------------

/**
 *  2.parametre Higher Order Fonksiyon olarak da tanimlanmistir.
 *  Higher Order Fonksiyonlar default deger alabilirler. Bunun icin basitce suslu paratezler acmak yeterlidir.
 *  Dikkat edilmesi gereken konu bu suslu parantezler icine , H,gher Order Function paraemtre bekliyorsa , bunlar verilebilir
 */

fun printUserInfo(name: String, getSurName: (surName: String) -> String = { surNmae -> "" }, age: Int): Unit {
    println("name :$name , age $age")

    println(getSurName("Öztürk"))
}

//--------------------------------------------------------------------------------------------------------------------------

fun getItemClickListener(onClick: (String) -> Unit){

    println("Tıklama Islemi baslatılıyor")

   Timer(3000){

       /*
       Bir Higher Order Function , parametre olarak yazildiktan sonra, bu parametrenin normal bir fonksiyon icerisinde
       cagrilmasi gerekmektedir. Aksi halde bu higher order fonksiyonu tanimlamak mantiksiz olur. Normla bir fonksiyon
       cagrildigi alandaki higher order function body kismi hic bir zaman cagrilmaz demek olur
        */

       onClick("Login")

       println(" Tıklama Islemi Bitti")

   }


}

//--------------------------------------------------------------------------------------------------------------------------

class News {

    fun getNewsType(newsType: NewsType): String {
        return when (newsType.toString()) {

            NewsType.breakingNews -> "Breaking"
            NewsType.urgent -> "Urgent"
            NewsType.local -> "Local"
            NewsType.global -> "Global"
            else -> "Normal"

        }
    }

}

class NewsType {
    companion object { //compain Objelere debug konulmaz

        val breakingNews = "BreakingNews"
        val urgent = "Urgent"
        val local = "Local"
        val global = "Global"
        val normal = "Normal"
    }
}

//--------------------------------------------------------------------------------------------------------------------------

/**
 *
 * Bir Higher Order Function'ina parametre verirken Class ismi.() seklinde tanimlama yapabilir.
 * Bu sayede ilgili class da parametre parantezi icerisinde yazilabilir
 */

fun News.getNewsFromServer(channelType: String , newsType: NewsType ,getNews: NewsType.(Int) -> Unit){
    when(channelType){

        "KanalD" -> {
            getNews(newsType,1)
        }
        "ShowTv" -> {
            getNews(newsType,2)
        }
        "Tv8" -> {
            getNews(newsType,3)
        }
        "FoxTv" -> {
            getNews(newsType,4)
        }
        "CnnTurk" -> {
            getNews(newsType,5)
        }

    }
}

//--------------------------------------------------------------------------------------------------------------------------

/**
 * Bir Higher Order Function'sın parametresi de yine Infix Function olabilir.
 */

infix fun News.filterNews(getFilter: (filterType: String , getFilterName: () -> String) -> Unit){
    val getFilterNameH0 = {
        "String Return Label"
    }

    val getFilterNameH2 = fun():String{
        return "String return label"
    }

    val getFilterNameH03 = fun():String = "String Return Label"

    fun getfilterNameH04():String {
        return "String Return Label"
    }

    fun getFilterNameh05(): String = "String Return Label"

    getFilter("FilterName") {
        "String Return Label"
    }

    getFilter("filterName",getFilterNameH0)
    getFilter("filterName",getFilterNameH2)
    getFilter("filterName",getFilterNameH03)
    getFilter("filterName",::getfilterNameH04)
    getFilter("filterName",::getFilterNameh05)


}

infix fun News.read(readTitle: (title:String) -> Unit){
    readTitle("Codemy Is Awesome")
}
