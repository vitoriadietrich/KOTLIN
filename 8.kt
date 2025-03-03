fun main(){

   //Faça um programa que leia 3 valores informados pelo usuário (considere que não
  //serão informados valores iguais) e escrever a soma dos 2 maiores.

    var val1 = 0.0
    var val2 = 0.0
    var val3 = 0.0
    var soma = 0.0

    print("Informe o primeiro valor:")
    val1 = readln().toDouble()

    print("Informe o segundo valor:")
    val2 = readln().toDouble()

    print("Informe o terceiro valor:")
    val3 = readln().toDouble()

    if(val1 > val2) {
        if (val1 > val3) {
            if (val2 > val3) {
                soma = val1 + val2
            } else {
                soma = val1 + val3
            }
        } else {
            soma = val1 + val3
        }
    }
    else {
        if (val2 > val3) {
            soma = val2 + val1
        } else {
            soma = val3 + val1
        }
    }

       print("A soma dos dois maiores valores é: $soma")
     }
