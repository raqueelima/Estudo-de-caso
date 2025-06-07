package Televisao;
import java.util.Scanner;


public class RodarTv {
    public static void main (String[] x){
        Scanner teclado = new Scanner(System.in);
        Tv raquelTv;

        System.out.println("Digite o tamanho da tela:");
        double tamanho = teclado.nextDouble();

        System.out.println("Digite a voltagem da TV:");
        int volt = teclado.nextInt();

        raquelTv = new Tv(tamanho, volt);

        raquelTv.abaixarvol();
        raquelTv.aumentarvol();
        raquelTv.abcanal();
        raquelTv.scanal();
        raquelTv.desligar();
        raquelTv.ligar();

        teclado.close();
    }
   
}
