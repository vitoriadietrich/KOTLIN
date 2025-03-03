fun main(){
  //Escreva um programa para imprimir todas as tabuadas de 1 a N. N será informado pelo
 //usuário.

    var N = 0
    var terceiro_numero = 1
    var segundo_numero = 1
    var contador = 1
    print("Informe o valor:")
    N = readln().toInt()


    // Laço enquanto para imprimir os números de 10 a 1
    while(contador >= 1 && contador <= 10)
    {
        terceiro_numero = N * segundo_numero
        contador = contador + 1
        println("\n" + N + "X" + segundo_numero + "=" + terceiro_numero)
        segundo_numero = segundo_numero + 1
    }
}