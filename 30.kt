fun main(){
    var saldo = 150.00 // Float
    var nome = "" // Inicializando a variável nome como uma string vazia
    var extrato = "" // String para armazenar o extrato das transações
    var contador = 0 // Contador para controlar as transações
    var senhaCorreta = 3589 // Senha para acessar funcionalidades importantes

    // Função para verificar a senha antes de acessar saldo, extrato, saque, etc.
    fun validarSenha() {
        print("Digite a sua senha: ")
        val senha = readln().toIntOrNull() ?: -1 // Lê a senha e trata entrada inválida
        if (senha != senhaCorreta) {
            println("Senha incorreta. Tente novamente.\n")
            validarSenha() // Chama novamente a função inicio se a senha for incorreta
        }
    }

    fun verSaldo(){
        validarSenha() // Valida a senha antes de acessar o saldo
        println("Seu saldo atual é: R$ $saldo")
    }

    fun fazerDeposito() {
        validarSenha() // Valida a senha antes de fazer o depósito

        var deposito = 0.0

        print("Qual o valor para depósito? ")
        deposito = readln().toDouble()

        if (deposito <= 0){
            println("Operação não autorizada. O valor deve ser maior que zero.\n")
            fazerDeposito()
        } else {
            saldo = saldo + deposito
            // Registrar a transação no extrato
            extrato = extrato + "Depósito de R$ $deposito\n"
            verSaldo()
        }
    }

    fun fazerSaque(){
        validarSenha() // Valida a senha antes de fazer o saque

        var saque = 0.0

        print("Qual o valor para saque? ")
        saque = readln().toDouble()

        // Verifica se o saque é menor ou igual a zero
        if (saque <= 0) {
            println("Operação não autorizada. O valor deve ser maior que zero.\n")
            fazerSaque()
        }
        // Verifica se o saque é maior que o saldo
        else if (saque > saldo) {
            println("Operação não autorizada. Saldo insuficiente.\n")
            fazerSaque()
        }
        else {
            saldo = saldo - saque // Realiza o saque
            // Registrar a transação no extrato
            extrato = extrato + "Saque de R$ $saque\n"
            verSaldo()
        }
    }

    fun fazerTransferencia() {
        validarSenha() // Valida a senha antes de realizar a transferência

        var numeroConta = 0
        var valorTransferencia = 0.0

        print("Digite o número da conta para transferência: ")
        numeroConta = readln().toInt()

        // Verifica se o número da conta é válido
        if (numeroConta <= 0) {
            println("Operação não autorizada. O número da conta deve ser um valor positivo.\n")
            fazerTransferencia()
        }

        print("Qual o valor para transferência? ")
        valorTransferencia = readln().toDouble()

        // Verifica se o valor da transferência é maior que zero
        if (valorTransferencia <= 0) {
            println("Operação não autorizada. O valor a ser transferido deve ser maior que zero.\n")
            fazerTransferencia()
        }
        // Verifica se o valor da transferência é maior que o saldo
        else if (valorTransferencia > saldo) {
            println("Operação não autorizada. Saldo insuficiente.\n")
            fazerTransferencia()
        }
        else {
            saldo = saldo - valorTransferencia // Realiza a transferência
            // Registrar a transação no extrato
            extrato = extrato + "Transferência de R$ $valorTransferencia para a conta $numeroConta\n"
            verSaldo()
        }
    }

    fun verExtrato(){
        validarSenha() // Valida a senha antes de ver o extrato

        if (extrato == "") {
            println("Não há transações registradas.\n")
        } else {
            println("Extrato:\n")
            println(extrato)
        }
    }

    fun erro() {
        println("Opção Inválida. Por favor, escolha uma opção válida.\n")
    }

    fun sair(){
        println(nome + ", foi um prazer ter você por aqui!\n")
    }

    fun inicio() {
        // Solicitar o nome apenas uma vez no início
        if (nome.isEmpty()) { // Se o nome ainda não foi informado
            print("Olá, qual o seu nome? ")
            nome = readln().toString()
            println("Olá, $nome é um prazer ter você por aqui!\n")
        }

        var opcao = 0

        do {
            print("Escolha uma opção:\n")
            print("1. Ver saldo\n")
            print("2. Ver extrato\n")
            print("3. Fazer saque\n")
            print("4. Fazer depósito\n")
            print("5. Transferir\n")
            print("6. Sair\n")
            opcao = readln().toInt()

            println("A opção selecionada foi: $opcao")

            when (opcao) {
                1 -> verSaldo()
                2 -> verExtrato()
                3 -> fazerSaque()
                4 -> fazerDeposito()
                5 -> fazerTransferencia()
                6 -> sair()
                else -> erro()
            }
        } while (opcao != 6) // Continua até que o usuário escolha sair
    }

    // Chama a função de início
    inicio()
}
