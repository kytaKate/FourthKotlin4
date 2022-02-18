package task1

/*
Реализуйте функцию, которая проверяет, является ли строка допустимым
идентификатором. Действительный идентификатор — это непустая строка,
которая начинается с буквы или символа подчеркивания и состоит только
из букв, цифр и символов подчеркивания.
 */

fun isValidIdentifier(s: String): Boolean {

    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}