fun main() {

  //Escreva um programa em que o usuário informe o seu nome e em seguida o programa
 // perguntará a idade do usuário. Agora o programa deve exibir a mensagem
// "Olá, [NomeDoUsuario], sua idade é [idade]".

    var nomeDoUsuario = ""
    print("Digite seu nome completo:")
    nomeDoUsuario = readln().toString()

    var idade = ""
    print("Digite sua idade:")
    idade = readln().toString()

    print("Olá, $nomeDoUsuario, sua idade é: $idade")
}