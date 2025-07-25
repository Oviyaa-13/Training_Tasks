package org.example
import kotlin.random.Random
fun main() {
    val numbers = Array(50) { Random.nextInt(1, 1001) }
    println("Initial 50 numbers in the array:")
    for (i in 0 until 50) {
        print("${numbers[i]} ")
    }
    val numberList = numbers.toMutableList()
    val deleteIndices = IntArray(25) { Random.nextInt(0, numberList.size) }
    println("Deleted indices :")
    for (i in deleteIndices)
         print("$i ")
    var removedCount = 0
    for (i in deleteIndices) {
        val adjustedIndex = i - removedCount
        if (adjustedIndex in 0 until numberList.size) {
            numberList.removeAt(adjustedIndex)
            removedCount++
        }
    }
    println("After deletion:")
    for (num in numberList) {
        print("$num ")
    }
}
