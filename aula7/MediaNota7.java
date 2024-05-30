import java.util.Scanner;

public class MediaNota7 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
    
        System.out.println("Calculadora de Média");
        System.out.println("Digite sua AC1:");
        double AC1 = scann.nextDouble();

        System.out.println("digite sua AC2");
        double AC2 = scann.nextDouble();

        System.out.println("Digite sua AG");
        double AG = scann.nextDouble();

        System.out.println("Digite sua AF");
        double AF = scann.nextDouble();

        double Resultado = (AC1*0.15) + (AC2*0.30) + (AG*0.10) + (AF*0.45);
        
        System.out.println("Qual a nota minima?");
        double Minima = scann.nextDouble();
        
        if (Resultado >= 0 && Resultado <= 2){
        System.out.println("Reprovado.");}

        else if  (Resultado >= 2.1 && Resultado <= 4.9){
        System.out.println("Fazer a prova substitutiva.");}

        else if (Resultado > 4.9){
        System.out.println("Aprovado");
        }

        System.out.println("Sua média é de:" + Resultado);

        scann.close();

        }

        }
