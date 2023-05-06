package `6 Class`

/**
 * Kotlin de Propert Vardır , Field yoktur!
 */



/**
 * Property nedir?
 * bir değişkenin get ve set fonksiyonları
 */


class BankAccount {
    /**
     * Aşağıda yazılan kod sadece 57 ve 58 i etkiler
     */

    public var balance = 1_000_000 // Kotlin de property , aslında arkada private ve field değil property
                                    // Java da değiken ya da field denir ya da variable

        set(value) {
            field = value           // backing field
        }

    private var dept = 4500         // Bu kod 57 ve 58 i etkilemez çünkü private


    /**
     *public var balance = 100_000_00 Assembly kodu üretilirken aşağıdaki kod üretilir
     */

//    public fun getBalance(): Int = 1_000_000
//    public fun setBalance(value: Int){
//        balance = value
//    }

    //TODO Gizlilik sıralaması :  private - protected - internal - public
    // Kendisiyle eşit veya daha aşağıda yapılmadır


    var money = 5_000_000
        private set(value){
            field = value
        }
        public get(){
            return field
        }

    private var cash = 250_000
        private set(value) {
            field = value
        }

        private get() {
            return field
        }

    /**
     *  Yukarıda get ve seti bizim belirlemekle belirlememek arasındaki fark , set ve getin private
     *  hallerini göörüyoruz
     */


}

fun main() {
    val bankAccount = BankAccount()

    //todo Public

    bankAccount.balance
    println(bankAccount.balance)

    bankAccount.balance = 500_000
    println(bankAccount.balance)

    bankAccount.money
    println(bankAccount.money)

    //todo Private

    /*println(bankAccount.dept)
    bankAccount.dept = 5000
    println(bankAccount.dept)*/

    /*
    println(bankAccount.cash)
    bankAccount.cash = 500_000
    println(bankAccount.cash)
     */


}

//todo Java Çıktısı

/**
 * Kotlin de ne kadar public olsa da aslında java da her zaman private olur ve kotlinde private olarak verdiğimiz
 * fonksiyonların property çıktısı yoktur
 */

/* public final class BankAccount {
   private int balance = 10000000; //Field
   private int dept = 4500; //Field

   public final int getBalance() { return this.balance; } //Property
   public final void setBalance(int var1) {this.balance = var1; } /Property
}*/