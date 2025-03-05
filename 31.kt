fun main() {
    // Hora de Codar 6: O Código nunca Desiste

    // Lista para armazenar os registros
    val registros = mutableListOf<Triple<String, String, String>>()  // Usando Triple para armazenar nome, telefone e endereço

    // Função para mostrar as datas disponíveis
    fun datas() {
        val datasDisponiveis = """
            07/03/2025
            10/03/2025
            12/03/2025
            15/03/2025
            18/03/2025
            20/03/2025
            22/03/2025
            25/03/2025
            28/03/2025
            30/03/2025
        """.trimIndent() // Remove a indentação extra em strings multi-linhas

        // Exibe as datas disponíveis
        println("Datas Disponíveis:\n$datasDisponiveis")
    }

    // Função para registrar os dados
    fun cadastro() {
        for (i in 1..10) {
            println("$i registro:")
            print("Informe seu nome: ")
            val nome = readln()
            print("Informe seu telefone: ")
            val telefone = readln()
            print("Informe seu endereço: ")
            val endereco = readln()

            // Armazena o registro na lista
            registros.add(Triple(nome, telefone, endereco)) // Usando Triple para armazenar os dados como uma única entrada
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
                val (nome, telefone, endereco) = registro
                println("${index + 1}. Nome: $nome, Telefone: $telefone, Endereço: $endereco")
            }
        }
    }

    // Exibir registros um por vez
    fun pesquisarRegistro() {
        println("Digite o número do registro que deseja visualizar (1-10):")
        val numeroRegistro = readln().toInt()

        if (numeroRegistro in 1..registros.size) {
            val registro = registros[numeroRegistro - 1]
            val (nome, telefone, endereco) = registro
            println("Registro $numeroRegistro: Nome: $nome, Telefone: $telefone, Endereço: $endereco")
        } else {
            println("Número de registro inválido!")
        }
    }

    // Função para exibir mensagem de erro
    fun erro() {
        println("Opção Inválida. Por favor, escolha uma opção válida.\n")
    }

    // Função para sair e dar uma mensagem de despedida
    fun sair() {
        println("Foi um prazer ter você por aqui!\n")
    }

    // Função principal que controla o fluxo do programa
    fun inicio() {
        var opcao = 0

        do {
            // Exibe as opções para o usuário
            println("Escolha uma opção:")
            println("1. Ver datas disponíveis")
            println("2. Fazer cadastro")
            println("3. Apresentar todos os registros")
            println("4. Exibir um registro por vez")
            println("5. Sair")

            opcao = readln().toInt()

            println("A opção selecionada foi: $opcao")

            // Executa a ação correspondente à opção escolhida
            when (opcao) {
                1 -> datas() // Exibe as datas disponíveis
                2 -> cadastro() // Fazer cadastro
                3 -> totalRegistros() // Exibe registros
                4 -> pesquisarRegistro() // Exibir um por vez
                5 -> sair() // Sai do programa
                else -> erro() // Caso a opção seja inválida
            }
        } while (opcao != 5) // Continua até que o usuário escolha sair
    }

    // Chama a função de início para iniciar o programa
    inicio()
}
