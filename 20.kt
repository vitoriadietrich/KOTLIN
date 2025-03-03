fun main(){
  //Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros
//informados pelo usuário e todos os números inteiros entre eles. Considere que o primeiro
//sempre será menor que o segundo.

    var numero1 = 0
    var numero2 = 0
    var soma = 0
    var contador = 0
    var media = 0.0

            // Leitura dos dois números informados pelo usuário
            print("Informe o primeiro número: ")
            numero1 = readln().toInt()
            print("Informe o segundo número: ")
            numero2 = readln().toInt()

    soma = 0
    contador = 0

    // Laço enquanto para somar os números entre numero1 e numero2, inclusive
    while(numero1 <= numero2)
    {
        soma = soma + numero1
        contador = contador + 1
        numero1 = numero1 + 1  // Incrementa para passar para o próximo número
    }

    // Calcula a média
    media = soma.toDouble() / contador

    // Exibe o resultado da média
    println("A média aritmética é: $media")

    // Aguarda a finalização para garantir que o resultado seja mostrado antes de fechar
    print("\nPressione qualquer tecla para finalizar... ")
    numero1 = readln().toInt() // Isso serve para fazer o programa esperar uma entrada antes de fechar
}