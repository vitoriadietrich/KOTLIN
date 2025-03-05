fun main() {
    // Lista para armazenar os registros
    val registros = mutableListOf<Triple<String, String, String>>() // Agora você vai armazenar 'nome', 'RA', e 'telefone' se necessário

    // Função para registrar os dados
    fun cadastro() {
        for (i in 1..20) {
            println("$i registro:")

            print("Informe seu nome: ")
            val nome = readln()

            print("Informe seu RA: ")
            val registroAluno = readln()

            // Solicita as notas do aluno
            print("Informe a nota 1: ")
            val nota1 = readln().toDouble()

            print("Informe a nota 2: ")
            val nota2 = readln().toDouble()

            print("Informe a nota 3: ")
            val nota3 = readln().toDouble()

            // Calcula a média do aluno
            val media = (nota1 + nota2 + nota3) / 3

            // Armazena o registro na lista, incluindo a média
            registros.add(Triple(nome, registroAluno, media.toString())) // Armazena nome, RA e a média do aluno como string
        }

        println("Cadastro realizado com sucesso!")
    }

    // Função para exibir os registros (caso o cadastro tenha sido feito)
    fun totalRegistros() {
        if (registros.isEmpty()) {
            println("Registros indisponíveis! Por favor, complete o cadastro primeiro.")
        } else {
            println("Registros completos:")
            for ((index, registro) in registros.withIndex()) {
                val (nome, registroAluno, media) = registro
                val status = if (media.toDouble() >= 5) "Aprovado" else "Reprovado"
                println("${index + 1}. Nome: $nome, RA: $registroAluno, Média: $media, Status: $status")
            }
        }
    }

    // Exibir registros um por vez
    fun pesquisarRegistro() {
        println("Digite o número do registro que deseja visualizar (1-20):")
        val numeroRegistro = readln().toInt()

        if (numeroRegistro in 1..registros.size) {
            val registro = registros[numeroRegistro - 1]
            val (nome, registroAluno, _) = registro
            println("Registro $numeroRegistro: Nome: $nome, RA: $registroAluno")
        } else {
            println("Número de registro inválido!")
        }
    }

    // Função para sair e dar uma mensagem de despedida
    fun sair() {
        println("Foi um prazer ter você por aqui, estudante!\n")
    }

    // Função para exibir mensagem de erro
    fun erro() {
        println("Opção Inválida. Por favor, escolha uma opção válida.\n")
    }

    // Função principal que controla o fluxo do programa
    fun inicio() {
        var opcao = 0

        do {
            // Exibe as opções para o usuário
            println("Escolha uma opção:")
            println("1. Fazer cadastro")
            println("2. Apresentar todos os registros")
            println("3. Exibir um registro por vez")
            println("4. Sair")

            opcao = readln().toInt()

            println("A opção selecionada foi: $opcao")

            // Executa a ação correspondente à opção escolhida
            when (opcao) {
                1 -> cadastro() // Fazer cadastro
                2 -> totalRegistros() // Exibe registros
                3 -> pesquisarRegistro() // Exibir um por vez
                4 -> sair() // Sai do programa
                else -> erro() // Caso a opção seja inválida
            }
        } while (opcao != 4) // Continua até que o usuário escolha sair
    }

    // Chama a função de início para iniciar o programa
    inicio()
}
