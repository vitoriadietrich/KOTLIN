fun main(){
  //Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive).
 //Considere que o N será sempre maior que ZERO.
 //N  é um valor informado pelo usuário


    var N = 0
    print("Informe o valor:")
    N = readln().toInt()


    // Laço enquanto para imprimir os números de 10 a 1
    while(N >= 1)
    {
        println(N)  // Imprime o valor de decrescente
        N = N - 1  // Decrementa 1 em decrescente
    }
}