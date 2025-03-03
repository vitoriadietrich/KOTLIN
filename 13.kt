fun main(){
    //Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma
   //mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o
  //mês em que ela nasceu).

    var ano_nascimento = 0
    var ano_atual = 0
    var idade = 0

    print("Digite o seu ano de nascimento:")
    ano_nascimento = readln().toInt()

    print("Digite o ano atual:")
    ano_atual = readln().toInt()

    // Calcula a idade da pessoa
    idade = ano_atual - ano_nascimento

    if (idade >= 16) {
        print("Você poderá votar este ano! Idade: $idade")
    }
    else {
        print("Você não poderá votar este ano! Idade: $idade")
    }
}