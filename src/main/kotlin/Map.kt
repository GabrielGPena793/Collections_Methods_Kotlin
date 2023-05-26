fun main() {

    // Chave -> valor  =  { key: "value"}
    // Não repete valores
    // Caso coloque a mesma chave com outro valor o ultimo valor atribuido vai permanecer

    val map1 = mapOf<String, String>(Pair("Franca", "Paris"), Pair("Alemanha", "Berlim"), Pair("Alemanha", "Vida"))
    val map2 = mutableMapOf<String, String>(Pair("Franca", "Paris"), Pair("Alemanha", "Berlim"),)

    println(map1.entries)   // retorna valores em formato de array
    println(map1.keys)      // retorna as keys em formato de array
    println(map1.values)    // retorna os valores em formato de array

    map2["Brasil"] = "Brasília"
    println(map2)

    map2.remove("Brasil")
    println(map2.contains("Brasil"))
    map2.clear()
}