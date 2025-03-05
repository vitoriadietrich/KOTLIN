fun main() {
    // Lista para armazenar os registros
    val registros = mutableListOf<Pair<String, Double>>() // Agora você vai armazenar 'nome' e 'altura' (como Double)

    // Função para registrar os dados
    fun cadastro() {
        for (i in 1..20) {
            println("$i registro:")

            print("Informe seu nome: ")
            val nome = readln()

            print("Informe seu número de matrícula: ")
            val matricula = readln().toDouble() // Converte a altura para Double

            // Armazena o registro na lista
            registros.add(Pair(nome, matricula)) // Armazena nome e matrícula
        }

        println("Cadastro realizado com sucesso!")
    }

    // Função para apresentar de forma ordenada (por matrícula) os registros dos empregados que recebem salários
    //abaixo de R$1.000,00.
    fun registrosMenorOuIgual1_0() {
        val registrosMenorIgual = registros.filter { it.second <= 1.000 }
        if (registrosMenorIgual.isEmpty()) {
            println("Não há registros dos empregados que recebem salários abaixo de R$1.000,00.")
        } else {
            println("Registros dos empregados que recebem salários abaixo de R$1.000,00.")
            for (registro in registrosMenorIgual) {
                val (nome, matricula) = registro
                println("Nome: $nome, Matricula: $matricula")
            }
        }
    }

    // Função para apresentar de forma ordenada (por matrícula) os registros dos empregados que recebem salários
    //acima de R$1.000,00.
    fun registrosMaiorQue1_0() {
        val registrosMaior = registros.filter { it.second > 1.000 }
        if (registrosMaior.isEmpty()) {
            println("Não há registros dos empregados que recebem salários acima de R$1.000,00.")
        } else {
            println("Registros dos empregados que recebem salários acima de R$1.000,00.")
            for (registro in registrosMaior) {
                val (nome, matricula) = registro
                println("Nome: $nome, Matrícula: $matricula")
            }
        }
    }

    // Função para apresentar de forma ordenada (por matrícula) os registros dos empregados que recebem salários
    //iguais de R$1.000,00.
    fun registrosMaiorQue1_0ComProcessamento() {
        val registrosMaior = registros.filter { it.second > 1.000 }
        if (registrosMaior.isEmpty()) {
            println("Não há registros dos empregados que recebem salários igual a R$1.000,00.")
        } else {
            println("Registros dos empregados que recebem salários igual a R$1.000,00.")
            for (registro in registrosMaior) {
                val (nome, matricula) = registro
                // Exemplo de processamento (poderia ser qualquer outra coisa)
                println("Nome: $nome, Matrícula: $matricula")
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
                val (nome, matricula) = registro
                println("${index + 1}. Nome: $nome, Matrícula: $matricula")
            }
        }
    }

    // Função para exibir um registro específico
    fun pesquisarRegistro() {
        println("Digite o número do registro que deseja visualizar (1-20):")
        val numeroRegistro = readln().toInt()

        if (numeroRegistro in 1..registros.size) {
            val registro = registros[numeroRegistro - 1]
            val (nome, matricula) = registro
            println("Registro $numeroRegistro: Nome: $nome, Matrícula: $matricula")
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
            println("6. Exibir um registro por vez")
            println("3. Exibir registros dos empregados que recebem salários abaixo de R$1.000,00.")
            println("4. Exibir registros dos empregados que recebem salários igual a R$1.000,00.")
            println("5. Exibir registros dos empregados que recebem salários acima de R$1.000,00.")
            println("7. Sair")

            opcao = readln().toInt()

            println("A opção selecionada foi: $opcao")

            // Executa a ação correspondente à opção escolhida
            when (opcao) {
                1 -> cadastro() // Fazer cadastro
                2 -> totalRegistros() // Exibe registros
                6 -> pesquisarRegistro() // Exibir um por vez
                3 -> registrosMenorOuIgual1_0() // menor ou igual a 1000
                5 -> registrosMaiorQue1_0() // acima de 1000
                4 -> registrosMaiorQue1_0ComProcessamento() // Exibe registros com processamento
                7 -> sair() // Sai do programa
                else -> erro() // Caso a opção seja inválida
            }
        } while (opcao != 6) // Continua até que o usuário escolha sair
    }

    // Chama a função de início para iniciar o programa
    inicio()
}
