fun main(){
    //Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das
   //seguintes operações a serem executadas (codificada da seguinte forma: 1. Adição,
  //2. Subtração, 3. Divisão, 4. Multiplicação).
 //O programa deve calcular e escrever o resultado dessa operação sobre os dois valores
//lidos.
//Observação: Considere que só serão lidos os valores 1, 2, 3 ou 4 para as operações


    var valor1 = 0
    var valor2 = 0
    var operacao = 0
    var resultado = 0

    print("Informe o primeiro valor:")
    valor1 = readln().toInt()

    print("Informe o segundo valor:")
    valor2 = readln().toInt()

    print("Escolha a operação (1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação):")
    operacao = readln().toInt()

    // Verifica a operação e realiza o cálculo
    if (operacao == 1) { // Adição
        resultado = valor1 + valor2
        print("A soma é: $resultado")
    }
    else if (operacao == 2) { // Subtração
        resultado = valor1 - valor2
        print("A subtração é: $resultado")
    }
    else if (operacao == 3) { // Divisão
        if (valor2 != 0) { // Verifica divisão por zero
            resultado = valor1 / valor2
            print("A divisão é: $resultado")
        }
        else {
            print("Erro: Não é possível dividir por zero.")
        }
    }
    else if (operacao == 4) { // Multiplicação
        resultado = valor1 * valor2
        print("A multiplicação é: $resultado")
    }
    else {
        print("Operação inválida! Escolha um valor entre 1 e 4.")
    }
}