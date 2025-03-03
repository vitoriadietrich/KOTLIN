fun main(){
 //Escreva um algoritmo para ler as notas de avaliações de um aluno, calcule e imprima a
// média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura
// (0 a 10) para cada nota. São 6 notas ao total.
//Caso o valor informado para qualquer uma das notas esteja fora do limite estabelecido,
// deve ser solicitado um novo valor ao usuário.


    var nota1 = 0.0
    var nota2 = 0.0
    var nota3 = 0.0
    var nota4 = 0.0
    var nota5 = 0.0
    var nota6 = 0.0

    var ler = 0
    var media = 0.0


    print("Informe a primeira nota - (0 a 10):")
    nota1 = readln().toDouble()

    if(nota1 > 10) {
        print("Digite outro valor que seja menor ou igual a 10.")
        nota1 = readln().toDouble()
    }

    print("Informe a segunda nota - (0 a 10):")
    nota2 = readln().toDouble()

    if(nota2 > 10) {
        print("Digite outro valor que seja menor ou igual a 10.")
        nota2 = readln().toDouble()
    }

    print("Informe a terceira nota - (0 a 10):")
    nota3 = readln().toDouble()

    if(nota3 > 10) {
        print("Digite outro valor que seja menor ou igual a 10.")
        nota3 = readln().toDouble()
    }

    print("Informe a quarta nota - (0 a 10):")
    nota4 = readln().toDouble()

    if(nota4 > 10) {
        print("Digite outro valor que seja menor ou igual a 10.")
        nota4 = readln().toDouble()
    }

    print("Informe a quinta nota - (0 a 10):")
    nota5 = readln().toDouble()

    if(nota5 > 10) {
        print("Digite outro valor que seja menor ou igual a 10.")
        nota5 = readln().toDouble()
    }

    print("Informe a sexta nota - (0 a 10):")
    nota6 = readln().toDouble()

    if(nota6 > 10) {
        print("Digite outro valor que seja menor ou igual a 10.")
        nota6 = readln().toDouble()
    }


    if (nota1 > 10 || nota2 > 10 || nota3 > 10 || nota4 > 10 || nota5 > 10 || nota6 > 10) {
        println("\nValor inválido. Tente novamente!")
        println("Digite outro valor que seja menor ou igual a 10.")
        ler = readln().toInt()
    }

    media = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6) / 2
    println("\nA média simples é: " + media)

}