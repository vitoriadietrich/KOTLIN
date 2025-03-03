fun main(){
    //Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem
    //regressiva vá de 30 a 0. No final da repetição escreva "EXPLOSÃO".


    var contador = 30

    while(contador >= 0){
        println(contador) // Usando println para imprimir o contador e pular para a próxima linha
        contador-- //decrementa o contador
    }
    print("EXPLOSÃO!!!!!")
}