fun main() {


    val list1: List<Int> = listOf(1, 2, 3, 4, 5) // não é mutavel

    val list2: MutableList<Int> = mutableListOf(1, 2, 3, 4 , 5) // é mutavel

    println(list2[0])

    println(list2)
    println(list2.size)

    list2.add(8)
    list2.add(10)
    list2.remove(8)
    list2.removeAt(0)

    println(list2)
    println(list2.size)
    println(list2.contains(5))
    list2.clear()
}