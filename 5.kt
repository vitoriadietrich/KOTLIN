fun main(){

  //. Escreva um programa em que o usuário informe dois números. Então escreva em tela
 // o maior deles.

    var num1 = 0.0
    var num2 = 0.0

    print("Informe o primeiro número:")
    num1 = readln().toDouble()

    print("Informe o segundo número:")
    num2 = readln().toDouble()

    if(num1 > num2) {
        print("O maior número é o: $num1")
    }
    else {
        print("O maior número é o: $num2")
    }
}