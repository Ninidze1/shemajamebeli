// shemajamebeli
// task 1
fun main() {

    val x = arrayListOf(1,2,3,4,5,6)
    val y = arrayListOf(4,5,7,8,9,6)
    println(countDistinct(y))
    println(interSection(x, y))
    println(union(x, y))
    println(lessAverage(x))
    println(notThatMax(x))

}

// task 1
fun countDistinct(ar: List<Int>): Int {
    return ar.toSet().size
}

// task 2
fun interSection(ar1: ArrayList<Int>, ar2: ArrayList<Int>): Set<Int> {
    return ar1.intersect(ar2)
}

// task 3
fun union(ar1: List<Int>, ar2: List<Int>): Set<Int> {
    return ar1.union(ar2)
}

//task 4
fun lessAverage(ar1: List<Int>): List<Int> {
    val newList = arrayListOf<Int>()
    val avg = ar1.sum()/ar1.size
    for (each in ar1) {
        if (each < avg)
            newList.add(each)
    }
    return newList
}

// task 5
fun notThatMax(ar1: ArrayList<Int>): String {

    val maxValue:Int = ar1.toSet().max()!!
    val minValue:Int = ar1.toSet().min()!!
    val tempList1: ArrayList<Int> = arrayListOf()
    val tempList2: ArrayList<Int> = arrayListOf()
    tempList1.addAll(ar1)
    tempList1.sort()
    var result = tempList1.distinct()
    tempList2.addAll(result)
    tempList2.remove(maxValue)
    tempList2.remove(minValue)
    return "${tempList2.max()} და ${tempList2.min()}"
}
