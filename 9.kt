fun main() {
    // Faça um programa que leia 6 valores informados pelo usuário, calcule, exiba os
    // números informados e escreva a média aritmética desses valores lidos.

    var val1 = 0.0
    var val2 = 0.0
    var val3 = 0.0
    var val4 = 0.0
    var val5 = 0.0
    var val6 = 0.0

    // Lê os valores do usuário
    print("Informe o primeiro valor: ")
    val1 = readln().toDouble()

    print("Informe o segundo valor: ")
    val2 = readln().toDouble()

    print("Informe o terceiro valor: ")
    val3 = readln().toDouble()

    print("Informe o quarto valor: ")
    val4 = readln().toDouble()

    print("Informe o quinto valor: ")
    val5 = readln().toDouble()

    print("Informe o sexto valor: ")
    val6 = readln().toDouble()

    // Calcula a média
    val soma = (val1 + val2 + val3 + val4 + val5 + val6) / 6

    // Exibe a média
    println("O resultado da média é: $soma")

    // Exibe os valores informados
    println("Os valores informados foram: $val1, $val2, $val3, $val4, $val5, $val6")
}