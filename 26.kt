fun main(){
 //Escreva um programa em que o usuário informe 10 valores e escreva quantos desses
// valores lidos estão entre os números 24 e 42 (incluindo os valores 24 e 42) e
// quantos deles estão fora deste intervalo.


    var N = 0
    var outra_variavel = 0
    var guardar = 0
    var valor = 0
    var contador = 1


    // Laço enquanto para imprimir os números de 10 a 1
    while(contador >= 1 && contador <= 10)
    {  valor = valor + 1
        contador = contador + 1
        print("Informe o " + valor + "º" + "valor:")
        N = readln().toInt()


        if(N >= 24 && N <= 42) {
            guardar = guardar + 1
        }
        else {
            outra_variavel = outra_variavel + 1
        }

    }

    println("\nOs valores lidos entre os números 24 e 42 é: $guardar, e os que estão fora é: $outra_variavel")
}