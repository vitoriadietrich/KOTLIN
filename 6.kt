fun main(){
    //Faça um programa que leia um valor informado pelo usuário e diga se o valor informado
   //é positivo, negativo ou zero.

    var valor = 0.0

    print("Informe um valor:")
    valor = readln().toDouble()

    if(valor > 0){
       print("O valor é positivo")
    }
    else if(valor < 0) {
       print("O valor é negativo")
    }
    else {
       print("O valor é zero")
    }
}