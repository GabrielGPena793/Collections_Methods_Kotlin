fun main() {
    val receitas = listaDeDados()

    // println("Tem receitas? ${if (receitas.any()) "sim" else "não"}")
    // println("Tem ${receitas.count()} receitas")

    // println("Primeira receita: ${receitas.first().nome }")
    // println("Ultima receita: ${receitas.last().nome}")

    // println(listOf<Int>().firstOrNull()) // pega o primeiro elemento caso não tenha retorna null
    // println(listOf<Int>().lastOrNull()) // pega o ultimo elemento caso não tenha retorna null

    // ==== sum e sumOf
    // println(listOf<Int>(1, 2 ,3 ,4).sum()) // soma o array de números (float, double, int )
    // println(receitas.sumOf { it.calorias }) // Soma apenas números, porém podemos definir que propriedade vai fazer essa interação no array de objetos

    // ===== filter
    val receitasEquivalentes = receitas.filter { it.calorias > 500 }
    println(receitasEquivalentes)

    // ===== Predicados
    receitas.count { it.calorias < 500 }
    receitas.any { it.nome == "Hamburguer" }

    // ===== take e takelast
    val firstsRecipes = receitas.take(2) // pega os elementos a partir do inicio do array
    val lastsRecipes = receitas.takeLast(2) // pega os elementos a partir do final do array

    // ===== forEach
    // intera com cada elemento do array

    receitas.filter { it.calorias > 500 }.forEach { println(it.nome) }

    // ==== max e min

    listOf(1, 2, 6, 5).maxOf { it } // pega o valor maximo do array, da erro se for vazio
    listOf(1, 2, 3, 5).maxOrNull() // pega o valor maximo do array, retorna null se for vazio

    listOf(1, 2, 6, 5).minOf { it } // pega o valor minimo do array, da erro se for vazio
    listOf(1, 2, 3, 5).minOrNull() // pega o valor minimo do array, retorna null se for vazio

    receitas.maxOf { it.calorias } // retorna apenas o valor do objeto que for maior
    receitas.maxByOrNull { it.calorias } // retorna o objeto inteiro que tiver o maior valor
    receitas.minByOrNull { it.calorias } // retorna o objeto inteiro que tiver o menor valor

    // ====  map
    // transforma um array em outro de acordo com a lógica que colocar

    receitas.map { it.nome }

    // ==== avarage

    listOf(1, 2, 3).average()
    receitas.map { it.calorias }.average()

    // ====  distict
    // pega todos os elemetos que unicos, se tiver repetidos pega apenas uma vez

    val list = listOf(1, 1, 2, 3, 5, 6, 6, 8)
    println(list.distinct())

    val recipeNames = receitas.distinctBy { it.nome } // tras todos os objetos unicos, se tiver repetido tras uma vez só
    println(recipeNames)

    // ==== sorted
    list.sorted() // ordenada do menor para o maior ( ASC )
    list.sortedDescending() // ordenada do maior para o menor ( DESC )

    // === reversed
    list.reversed() // inverte a lista

}

private fun listaDeDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)