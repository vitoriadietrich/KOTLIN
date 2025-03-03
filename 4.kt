fun main(){

  //Considerando a figura abaixo, escreva um programa para cada forma que calcule e
 // exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores
// de cada variável.

//calculando o retângulo - A= base.altura

    var base = 0.0
    var altura = 0.0
    var area = 0.0

    print("Informe a base do retângulo:")
    base = readln().toDouble()

    print("Informe a altura do retângulo:")
    altura = readln().toDouble()

    area = base * altura

    print("O resultado é: $area")


   //calculando o quadrado - A= lado.lado = lado2

    var lado1 = 0.0

    print("\n\nInforme um 1 lado do quadrado:")
    lado1 = readln().toDouble()

    print("O resultado é: ${lado1 * lado1}²")


    //calculando o losango - A= diagonalMaior * diagonalMenor / 2

      var diagonalMaior = 0.0
      var diagonalMenor = 0.0
      var a = 0.0

      print("\n\nInforme a diagonal maior do losango:")
      diagonalMaior = readln().toDouble()

      print("Informe a diagonal menor do losango:")
      diagonalMenor = readln().toDouble()

      a = diagonalMaior * diagonalMenor / 2

      print("O resultado é: $a")


     //calculando o trapézio - A= (baseMaior + baseMenor).h /2

      var baseMaior = 0.0
      var baseMenor = 0.0
      var altura1 = 0.0

      print("\n\nInforme a base maior do trapézio:")
      baseMaior = readln().toDouble()

      print("Informe a base menor do trapézio:")
      baseMenor = readln().toDouble()

      print("Informe a altura do trapézio:")
      altura1 = readln().toDouble()

      print("O resultado é: ${((baseMaior + baseMenor) * altura1) / 2}")


     //calculando o paralelogramo - A= base * altura

      var base1 = 0.0
      var altura2 = 0.0

      print("\n\nInforme a base do paralelogramo:")
      base1 = readln().toDouble()

      print("Informe a altura do paralelogramo:")
      altura2 = readln().toDouble()

      print("O resultado é: ${base1 * altura2}")


    //calculando o triângulo - A= base * altura /2

      var base2 = 0.0
      var altura3 = 0.0

      print("\n\nInforme a base do triângulo:")
      base2 = readln().toDouble()

      print("Informe a altura do triângulo:")
      altura3 = readln().toDouble()

      print("O resultado é: ${(base2 * altura3) / 2}")


     //calculando o círculo - A= π.r²

      var pi = 0.0
      var raio = 0.0

      print("\n\nO valor de PI é:")
      pi = readln().toDouble()

      print("Informe o valor do raio:")
      raio = readln().toDouble()

      print("O resultado é: ${pi * raio}")
}