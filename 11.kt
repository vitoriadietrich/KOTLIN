fun main(){

  //Faça um programa que leia 6 números que o usuário vai informar. Todos os números
 //lidos com valor inferior a 72 devem ser somados. Escreva o valor final da soma
//efetuada e também todos valores que o usuário informou.


    var val1 = 0.0
    var val2 = 0.0
    var val3 = 0.0
    var val4 = 0.0
    var val5 = 0.0
    var val6 = 0.0
    var soma = 0.0
    var final = 72
    var soma1 = 0.0


    // Leitura dos valores
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

    // Determinando os números lidos com valor inferior a 72
    final = 72

    if (val1 < final)
    {
        soma = soma1 + val1
    }
    if (val2 < final)
    {
        soma = soma1 + val2
    }
    if (val3 < final)
    {
        soma = soma1 + val3
    }
    if (val4 < final)
    {
        soma = soma1 + val4
    }
    if (val5 < final)
    {
        soma = soma1 + val5
    }
    if (val6 < final)
    {
        soma = soma1 + val6
    }

    // Exibe todos os números que o usúario informou
    println("\nOs valores informados foram: $val1, $val2, $val3, $val4, $val5, $val6")

    // Exibe todos os números somados inferior a 72
    println("Soma dos valores inferiores a 72: $soma")
}