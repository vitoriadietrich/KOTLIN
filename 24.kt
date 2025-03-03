fun main(){
  // Escreva um algoritmo para imprimir os 10 primeiros números inteiros maiores que 100.


    var valores = 100
    print("Informe o valor:")
    valores = readln().toInt()


    // Laço enquanto para imprimir os números de 100 a 110
    while(valores >= 100 && valores <= 110)
    {
        println(valores)  // Imprime o valor de decrescente
        valores = valores + 1  // Decrementa 1 em decrescente
    }
}