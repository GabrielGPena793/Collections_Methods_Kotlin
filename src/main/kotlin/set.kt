fun main(){
    /*
    *  O set não tem ordenação no array e ele também não permite valores duplicados
    * */

    val set1: Set<String> = setOf<String>("Paris", "Berlim", "Madrid", "Madrid" )
    val set2: MutableSet<String> = mutableSetOf<String>()

    println(set1)

    set2.add("São Paulo")
    set2.remove("Paris")
    set2.contains("Madrid")

    set2.clear()
    set2.size

}