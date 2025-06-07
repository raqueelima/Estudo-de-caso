package Carro;
public class RodarDeCarro {
    public static void main (String [] x){
        Carro raquelCarro = new Carro(" modelo");

        raquelCarro.acelerar(0);
        raquelCarro.desacelerar();
        raquelCarro.desligar();
        raquelCarro.ligar();
        raquelCarro.direita();
        raquelCarro.esquerda();
        raquelCarro.mBaixo();
        raquelCarro.mCima();

        System.out.println(raquelCarro);
    }

    
}