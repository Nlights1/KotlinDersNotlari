package `4 Loop`

fun main() {

    /**
     *
     * Degisen hic bir sey yok. Diger dillerde nasıl kullaniliyorsa Kotlinde de aynı sekilde kullaniliyor
     * Eger bir dpnguye ihtiyacınız varsa ve bu dongu sirasında if else ile bir sart durumda for + if else kullanmak yerine while dongusu kullanilrabilir.
     *
     */


    var number = 0
    while (number < 5){ //e kadar
        println(number++)
        //veya
        print("${number++} , ")
    }

//    Ikiside aynı isi yapar

    while (number < 5){
        print("${number++} , ")
        number++
    }

    /**
     *
     * Performans acısında while daha iyidir
     *
     */

    for (value in 0..5){ // listenin sonuna kadar
        if (value < 5){
            print("$value , ")
        }else{
            return
        }
    }

}