fun main() {
    val a = readLine()!!.toInt()
    when(a){
//        5         -> println("C")
//        99         -> println("A")
//        45         -> println("A")
//        235         -> println("B")
//        1736         -> println("C")
//        !in 7..15 -> println("Я таких не знаю")
//        else      -> println("Я таких тем более не знаю")
    }
   val out = when {
       a == 10  -> "a = 10"
       a > 10   -> "a < 10"
       else     -> "Not 5 not 6"
   }
    println(out)
}