fun main(){

   //Escreva um programa que calcule a média de quatro números informados pelo usuário,
  //mas somente se esses números forem maiores que 0 e menores que 10. No final, se a média
 //for maior que cinco o usuário receberá uma mensagem "Você passou no teste".
//Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"


    // Declaração das variáveis
    var val1 = 0.0
    var val2 = 0.0
    var val3 = 0.0
    var val4 = 0.0
    var media = 4
    var media1 = 0.0

    // Leitura dos valores
    print("Informe o primeiro valor (entre 0 e 10): ")
    val1 = readln().toDouble()

    print("Informe o segundo valor (entre 0 e 10): ")
    val2 = readln().toDouble()

    print("Informe o terceiro valor (entre 0 e 10): ")
    val3 = readln().toDouble()

    print("Informe o quarto valor (entre 0 e 10): ")
    val4 = readln().toDouble()


    if ((val1 > 0 && val1 < 10) && (val2 > 0 && val2 < 10) && (val3 > 0 && val3 < 10) && (val4 > 0 && val4 < 10) ){

        // Calculando a média
        println("\nA média dos valores é: " + (val1 + val2 + val3 + val4) / media)


    }

    if ((val1 > 5) && (val2 > 5) && (val3 > 5) && (val4 > 5)) {
        print("\nVocê passou no teste!")
    }
    else if ((val1 < 5) && (val2 < 5) && (val3 < 5) && (val4 < 5)) {
        print("\nVocê não passou no teste!")
    }
    else {
        print("\nTente novamente!")
    }
}