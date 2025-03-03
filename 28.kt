fun main() {
    // Crie uma array de planetas que inclua "Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno"  e,
    // em seguida, peça ao usuário para digitar o nome de um planeta.
    //Verifique se o planeta que o usuário informou está na array e informe ao usuário.


    val planetas = arrayOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")

    // Peça ao usuário para digitar o nome de um planeta
    print("Digite o nome de um planeta: ")
    val novoPlaneta = readln()

    // Verifica se o planeta informado está no array
    if (planetas.contains(novoPlaneta)) {
        println("O planeta $novoPlaneta está na lista de planetas.")
    } else {
        println("O planeta $novoPlaneta não está na lista de planetas.")
    }
}