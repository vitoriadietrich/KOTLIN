
 //Vamos criar uma lista de compras.
//Crie uma array de frutas, exiba-a ao usuário e, em seguida, peça ao usuário para digitar o nome de uma das frutas.
//Caso a fruta esteja no array, remova-a e exiba a mensagem "Fruta foi retirada da lista".
//Peça novamente para o usuário digitar o nome de uma fruta para ser removida.
//Sempre que o usuário procurar por uma fruta que não está no array exiba a mensagem "Fruta indisponível no nosso mercado".
//Quando o array não possuir mais itens dentro de si, escreva "Lista de compras finalizada".

    fun main() {

        val frutas = mutableListOf("Uva", "Morango", "Melão", "Lichia", "Banana", "Maçã")

        while (frutas.isNotEmpty()) { // Enquanto a lista não estiver vazia
            // Exibe a lista de frutas disponíveis
            println("Frutas disponíveis: ${frutas.joinToString(", ")}")

            // Peça ao usuário para digitar o nome de uma fruta
            print("Digite o nome de uma fruta para remover: ")
            val novaFruta = readln()

            // Verifica se a fruta informada está na lista
            if (frutas.contains(novaFruta)) {
                frutas.remove(novaFruta) // Remove a fruta da lista
                println("Fruta $novaFruta foi retirada da lista.")
            } else {
                println("Fruta indisponível no nosso mercado.")
            }
        }

        // Quando a lista estiver vazia
        println("Lista de compras finalizada.")
    }