fun main() {
    // Crie um programa onde o usuário possa cadastrar estudantes sem limites, e, em seguida,
    // se o usuário digitar "PARE", o programa deve exibir a quantidade de estudantes cadastrados
    // e a lista com cada um deles.

    val estudantes = mutableListOf<String>() // Lista para armazenar os nomes dos estudantes
    var cadastrar: String

    while (true) {
        print("Informe o estudante (ou digite 'PARE' para finalizar): ")
        cadastrar = readln()

        if (cadastrar == "PARE") {
            break // Sai do loop se o usuário digitar "PARE"
        }

        estudantes.add(cadastrar) // Adiciona o nome do estudante à lista
    }

    // Exibe a quantidade e a lista de estudantes cadastrados
    println("A quantidade de estudantes cadastrados é: ${estudantes.size}")
    println("Os estudantes cadastrados são: ${estudantes.joinToString(", ")}")
}