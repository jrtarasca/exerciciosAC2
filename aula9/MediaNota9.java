import java.util.Scanner;

public class MediaNota9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Calculadora de Média");
        System.out.println("Quantos alunos serão avaliados?");
        double NumeroAlunos = scanner.nextDouble();

        for (int aluno = 1; aluno <= NumeroAlunos; aluno++) {
            System.out.println("Inserir notas do aluno " + aluno);
            System.out.println("Quantas notas serão inseridas para o aluno " + aluno + "?");
            double numeroNotas = scanner.nextDouble();

            double soma = 0;
            double peso = 1.0; // peso igual para todas as notas

            for (int i = 0; i < numeroNotas; i++) {
                System.out.println("Insira a nota " + (i + 1) + ":");
                double nota = scanner.nextDouble();
                soma += nota * peso;
            }

            System.out.println("Qual a nota mínima para aprovação?");
            double minima = scanner.nextDouble();
            
            double media = soma / numeroNotas; 

            System.out.println("Nome do aluno " + aluno + ":");
            String nomeAluno = scanner.next();

            System.out.println("Média final do aluno " + aluno + ": " + media);

            if (media >= 0 && media <= 2) {
                System.out.println("aluno " + aluno + ": Reprovado.");
            } else if (media >= 2.1 && media <= 4.9) {
                System.out.println(" aluno " + aluno + ": Fazer a prova substitutiva.");
            } else if (media >= minima) {
                System.out.println(" aluno " + aluno + ": Aprovado");
            } else {
                System.out.println(" aluno " + aluno + ": Reprovado.");
            }
        }

        scanner.close();
    }
}