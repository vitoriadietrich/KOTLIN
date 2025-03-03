fun main(){
  //Faça um algoritmo que calcule e escreva a média aritmética dos números inteiros
 //entre 15 (inclusive) e 100 (inclusive).

    var numeros = 0
    var soma = 0
    var contador = 0

    soma = 0
    contador = 0
    numeros = 100

    // Laço enquanto para somar os números de 100 até 15
    while(numeros >= 15)
    {
        soma = soma + numeros  // Soma o número atual
        contador = contador + 1  // Conta quantos números foram somados
        numeros = numeros - 1  // Decrementa 1 em numeros
    }

    // Calcula a média aritmética
    var media = 0
            media = soma / contador

    // Exibe o resultado da média
    println("\nO resultado da média é: $media")
}