fun main(){

   //Faça um programa que receba quatro valores informados pelo usuário, mas informe
  //somente o primeiro, o último e o maior de todos eles (considere que todos os números
 //informados serão diferentes)

    var valor1 = 0.0
    var valor2 = 0.0
    var valor3 = 0.0
    var valor4 = 0.0
    var maior = 0.0

    print("Informe o primeiro valor:")
    valor1 = readln().toDouble()

    print("Informe o segundo valor:")
    valor2 = readln().toDouble()

    print("Informe o terceiro valor:")
    valor3 = readln().toDouble()

    print("Informe o quarto valor:")
    valor4 = readln().toDouble()

    maior = valor1
    if(valor2 > maior)
    {
        maior = valor2
    }
    if (valor3 > maior)
    {
        maior = valor3
    }
    if (valor4 > maior)
    {
        maior = valor4
    }

    // Exibe o primeiro, o último e o maior valor
    println("\nO primeiro valor informado é: $valor1")
    println("O último valor informado é: $valor4")
    println("O maior valor informado é: $maior")
}