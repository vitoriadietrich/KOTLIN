fun main(){
 //Faça um programa para ler 3 valores (considere que não serão informados valores iguais)
 //e escrever o maior deles.

    var valor1 = 0.0
    var valor2 = 0.0
    var valor3 = 0.0

    print("Informe o primeiro valor:")
    valor1 = readln().toDouble()

    print("Informe o segundo valor:")
    valor2 = readln().toDouble()

    print("Informe o terceiro valor:")
    valor3 = readln().toDouble()

    if(valor1 > valor2){
        print("O maior valor é o: $valor1")
    }
    else if(valor2 > valor3){
        print("O maior valor é o: $valor2")
    }
    else if(valor1 > valor3){
        print("O maior valor é o: $valor1")
    }
    else {
        print("O maior valor é o: $valor3")
    }
}