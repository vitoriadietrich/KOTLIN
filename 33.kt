fun main() {
    // Lista para armazenar os registros
    val registros = mutableListOf<Pair<String, Double>>() // Agora você vai armazenar 'nome' e 'altura' (como Double)

    // Função para registrar os dados
    fun cadastro() {
        for (i in 1..15) {
            println("$i registro:")

            print("Informe seu nome: ")
            val nome = readln()

            print("Informe sua altura: ")
            val altura = readln().toDouble() // Converte a altura para Double

            // Armazena o registro na lista
            registros.add(Pair(nome, altura)) // Armazena nome e altura
        }

        println("Cadastro realizado com sucesso!")
    }

    // Função para exibir os registros das pessoas com altura menor ou igual a 1.5m
    fun registrosMenorOuIgual1_5() {
        val registrosMenorIgual = registros.filter { it.second <= 1.5 }
        if (registrosMenorIgual.isEmpty()) {
            println("Não há registros de pessoas com altura menor ou igual a 1.5m.")
        } else {
            println("Registros das pessoas com altura menor ou igual a 1.5m:")
            for (registro in registrosMenorIgual) {
                val (nome, altura) = registro
                println("Nome: $nome, Altura: $altura")
            }
        }
    }

    // Função para exibir os registros das pessoas com altura maior que 1.5m
    fun registrosMaiorQue1_5() {
        val registrosMaior = registros.filter { it.second > 1.5 }
        if (registrosMaior.isEmpty()) {
            println("Não há registros de pessoas com altura maior que 1.5m.")
        } else {
            println("Registros das pessoas com altura maior que 1.5m:")
            for (registro in registrosMaior) {
                val (nome, altura) = registro
                println("Nome: $nome, Altura: $altura")
            }
        }
    }

    // Função para exibir os registros das pessoas com altura maior que 1.5m e fazer algum processamento
    fun registrosMaiorQue1_5ComProcessamento() {
        val registrosMaior = registros.filter { it.second > 1.5 }
        if (registrosMaior.isEmpty()) {
            println("Não há registros de pessoas com altura maior que 1.5m.")
        } else {
            println("Registros das pessoas com altura maior que 1.5m e o processamento:")
            for (registro in registrosMaior) {
                val (nome, altura) = registro
                // Exemplo de processamento (poderia ser qualquer outra coisa)
                val mensagem = if (altura > 1.8) "Altura impressionante!" else "Altura boa."
                println("Nome: $nome, Altura: $altura - $mensagem")
            }
        }
    }

    // Função para exibir os registros (caso o cadastro tenha sido feito)
    fun totalRegistros() {
        if (registros.isEmpty()) {
            println("Registros indisponíveis! Por favor, complete o cadastro primeiro.")
        } else {
            println("Registros completos:")
            for ((index, registro) in registros.withIndex()) {
                val (nome, altura) = registro
                println("${index + 1}. Nome: $nome, Altura: $altura")
            }
        }
    }

    // Função para exibir um registro específico
    fun pesquisarRegistro() {
        println("Digite o número do registro que deseja visualizar (1-15):")
        val numeroRegistro = readln().toInt()

        if (numeroRegistro in 1..registros.size) {
            val registro = registros[numeroRegistro - 1]
            val (nome, altura) = registro
            println("Registro $numeroRegistro: Nome: $nome, Altura: $altura")
        } else {
            println("Número de registro inválido!")
        }
    }

    // Função para sair e dar uma mensagem de despedida
    fun sair() {
        println("Foi um prazer ter você por aqui!\n")
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
            println("3. Exibir registros de pessoas com altura menor ou igual a 1.5m")
            println("4. Exibir registros de pessoas com altura maior que 1.5m")
            println("5. Exibir registros de pessoas com altura maior que 1.5m e um processamento")
            println("6. Sair")

            opcao = readln().toInt()

            println("A opção selecionada foi: $opcao")

            // Executa a ação correspondente à opção escolhida
            when (opcao) {
                1 -> cadastro() // Fazer cadastro
                2 -> totalRegistros() // Exibe registros
                3 -> registrosMenorOuIgual1_5() // Exibe registros de pessoas com altura <= 1.5m
                4 -> registrosMaiorQue1_5() // Exibe registros de pessoas com altura > 1.5m
                5 -> registrosMaiorQue1_5ComProcessamento() // Exibe registros com processamento
                6 -> sair() // Sai do programa
                else -> erro() // Caso a opção seja inválida
            }
        } while (opcao != 6) // Continua até que o usuário escolha sair
    }

    // Chama a função de início para iniciar o programa
    inicio()
}
