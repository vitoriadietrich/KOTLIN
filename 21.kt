fun main(){
 // Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a média final.
// Considere que a nota de aprovação é 9,5. Logo após escrever a mensagem "Calcular a
// média de outro aluno Sim/Não?" e solicitar um resposta. Se a resposta for "S", o
// programa deve ser executado novamente, caso contrário deve ser encerrado exibindo a
// quantidade de alunos aprovados.
    

    var nota1 = 0.0
    var nota2 = 0.0
    var calcular = "S"
    var media = 0.0
    var alunos_aprovados = 0

    while (calcular == "S")
    {
        print("Informe a primeira nota:")
        nota1 = readln().toDouble()

        print("Informe a segunda nota:")
        nota2 = readln().toDouble()


        media = (nota1 + nota2) / 2
        print("A média final é: " + media)


        if (media >= 5) {
            print("\nVocê foi aprovado!")
            alunos_aprovados = alunos_aprovados + 1
        }
        else if (media < 5) {
            print("\nvocê foi reprovado!")
        }
        else {
            print("\nVocê está de recuperação!")
        }

        print("\n\nCalcular a média de outro aluno sim/não?")
        calcular = readln().toString()
    }

    print("Alunos aprovados: $alunos_aprovados")
}