import java.util.Scanner;

public class MediaNota6 {
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
        
        System.out.println("Qual a nota minima");
        double Minima = scann.nextDouble();
        
        if (AC1 < Minima){

            System.out.println(" AC1 Esta abaixo " + AC1);}

        if(AC2 < Minima){

            System.out.println("AC2 Esta abaixo " + AC2);
        }
        if (AG < Minima){
            System.out.println("AG Esta abaixo " + AG);
        }
        if (AF < Minima) {
            System.out.println(" AF Esta abaixo " + AF);
        }
        if( Resultado >= Minima){
            System.out.println("Aprovado ");
        
        }
        else{
            System.out.println("Reprovado");
        }
        System.out.println("Sua média é de:" + Resultado);

        scann.close();

        }

        }
