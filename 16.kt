fun main(){
  // Escreva um algoritmo para ler 2 valores informados pelo usuário e se o segundo valor
 //informado for igual ou menor que ZERO, deve ser lido um novo valor. Ou seja, para o
//segundo valor não pode ser aceito o valor zero, nem um valor negativo.
//O seu programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo
//valor e exibir o resultado ao usuário.


    var valor1 = 0.0
    var valor2 = 0.0
    var divisao = 0.0

    print("Digite o primeiro valor - maior que zero e positivo:")
    valor1 = readln().toDouble()

    print("Digite o segundo valor - maior que zero e positivo:")
    valor2 = readln().toDouble()

    while (valor2 <= 0) {
        print("Digite um novo valor:")
        valor2 = readln().toDouble()
    }

    divisao = valor1 / valor2
    print("O resultado da divisão é: $divisao")

}
