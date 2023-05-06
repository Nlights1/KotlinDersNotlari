package `6 Class`


/**
 *
 * Absreact la beraber final ve open modifierları kullanmak doğru değildir.
 *
 * Abstract olarak yazilmis class'a yeni eklnene tum abstract yapilar , tum child class'larda ovveride edilmek zorunda
 *
 * Eger abstract class'iniza eklemek istediginiz opsiyonel yapilar varsa , bunlar, child class'larin tamaminda override
 * etmek zorunda olmayalim diye open keyword'u ile tanimlanacaktir.
 *
 * Abstract bir class , abstract bir class'i miras alirsa , abstract yapilari ovveride etmek zorunda degildir.
 *
 * Abstract bir class başka bir class ı miras alıyorsa tümünü override etmek zorunda.
 *
 * Abstract func. body'si olmaz property'lerin de default degeri olmaz.
 *
 * Abstract class'lar ayni zamanda instance'i olusturmayan class'lar.
 *
 * Abstract class'lar ayni zamanda instance'i olusturmayan class'lar.Bu sebeple singleton gibi pattern'ler icin de
 * kullanilabiliyorlar.
 *
 */

 /**
  * Bir class'in abstract olabilmesi icin onune abstract keywordu gelmelidir.
  */

/**
 * Abstract class'lar şablon class'lardir. Yani basitçe sözleşme gibi düşünülebilir ve sözleşmelerdir var nesne olucak denir
 * nesnenin somut özeellikler yani markası,fiyatı,ne kadar olduğu söylenmez.
 */

//abstract class MCDonalds{
//    abstract val fridge: Fridge
//    abstract val superVisor: SuperVisor
//    abstract val employeeOne: Employee
//    abstract val employeeTwo: Employee
//    abstract val employeeThree: Employee
//    abstract val menuList: List<Mchamburger>
//
//    abstract fun clean(clock: Int)
//
//    open val policeOfficer: Police = Police()
//}
//
//abstract class McDonaldsExpress : MCDonalds() {
//    abstract fun sellCoffe(): McCoffee
//
//    override fun clean(clock: Int) {
//        println("Clean Time: $clock")
//    }
//}
//
//class McDonaldsMaltepe : MCDonalds(), MCDonaldsService {
//    override val fridge: Fridge
//        get() = TODO("Not yet implemented")
//}







