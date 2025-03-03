fun main() {
    // Tendo como entrada a altura e o gênero designado ao nascer (codificado da seguinte
    // forma: 1: feminino - 2: masculino - ) de uma pessoa, construa um programa que calcule
    // e imprima seu peso ideal, utilizando as seguintes fórmulas.

    // Fórmula para cálculo
    // para homens - (72.7 * h) - 58
    // para mulheres - (62.1 * h) - 44.7

    var genero: Int
    var altura: Double

    print("Informe seu gênero (1 para feminino, 2 para masculino): ")
    genero = readln().toInt() // Lê o gênero como um inteiro

    print("Informe sua altura em metros: ")
    altura = readln().toDouble() // Lê a altura como um double

    // Calcula o peso ideal com base no gênero
    when (genero) {
        1 -> { // Gênero feminino
            val pesoIdeal = (62.1 * altura) - 44.7
            println("Seu peso ideal (feminino) é: $pesoIdeal kg")
        }
        2 -> { // Gênero masculino
            val pesoIdeal = (72.7 * altura) - 58
            println("Seu peso ideal (masculino) é: $pesoIdeal kg")
        }
        else -> {
            println("Gênero inválido! Digite 1 para feminino ou 2 para masculino.")
        }
    }
}