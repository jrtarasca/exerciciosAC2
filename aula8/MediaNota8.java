import java.util.Scanner;

public class MediaNota8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Calculadora de Média");
        System.out.println("Quantas notas serão inseridas?");
        double numeroNotas = scanner.nextDouble();

        double soma = 0;
        double peso = 1.0; // peso igual para todas as notas
        
        for (int i = 0; i < numeroNotas; i++) {
            System.out.println("Insira a nota " + (i + 1) + ":");
            double nota = scanner.nextDouble();
            
            soma += nota * peso;
        }

        System.out.println("Qual a nota mínima?");
        double minima = scanner.nextDouble();
        
        double media = soma / numeroNotas; 
        System.out.println("Sua média é de: " + media);

        if (media >= 0 && media <= 2) {
            System.out.println("Reprovado.");
        } else if (media >= 2.1 && media <= 4.9) {
            System.out.println("Fazer a prova substitutiva.");
        } else if (media >= minima) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado.");
        }

        scanner.close();
    }
}