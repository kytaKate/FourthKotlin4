package part1
//Оператор when
/*
Напишите программу, которая считывает число и выводит "A", если оно двузначное, "B", если оно трёхзначное и "C" во всех остальных случаях.
Гарантируется, что число положительное.
 */
fun solution(a: Int): Char {
    when (a) {
        in 10..99 -> 'A'
        in 100..999 -> 'B'
        else -> return 'C'
    }


    fun main() {
        println(solution(5))     // C
        println(solution(99))    // A
        println(solution(45))    // A
        println(solution(235))   // B
        println(solution(1736))  // C

        val a = readLine()!!.toInt()
        println(solution(a))
    }




