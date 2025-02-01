fun main() {
    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)

    // Solution 1: Using an iterator
    val iterator = list2.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() > 2) {
            iterator.remove()
        }
    }
    println("Solution 1: "+ list2) // Output: [1, 2]

    // Solution 2: Create a copy
    val list3 = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList = mutableListOf<Int>()
    for (i in list3) {
        if (i <= 2) {
            newList.add(i)
        }
    }
    println("Solution 2: " + newList) // Output: [1, 2]
    
    //Solution 3: Using removeIf
    val list4 = mutableListOf<Int>(1,2,3,4,5)
    list4.removeIf {it > 2}
    println("Solution 3: " + list4) // Output: [1,2]
} 