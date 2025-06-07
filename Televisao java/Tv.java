package Televisao;
/*Uma televisão possui as seguintes características:
 tamanho de tela (em polegadas);
 volume: de 1 a 10 iniciando em 5 (somente no construtor);
 marca;
 voltagem (220 e 110);
 canal.
A televisão pode realizar as seguintes ações:
 ligar: ao ligar a televisão deve imprimir seu consumo. O
consumo deve ser definido pela voltagem multiplicada pela
quantidades de polegadas;
 desligar;
 aumentar e diminuir o volume;
 subir e descer canal. */


public class Tv {
    private double tela;
    private int volume;
    private int voltagem;
    private int canal;
    private String marca;

    public Tv(double tela, int voltagem) {
        this.tela = tela;
        this.volume = 5;
        this.voltagem = voltagem;
    }

    public String getMarca() {
        return marca;
    }

    public double getTela() {
        return tela;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTela(double tela) {
        this.tela = tela;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void ligar() {
        double consumo;
        consumo = (getTela() * getVoltagem());
        System.out.println("O consumo da TV é:" + consumo);
    }
    public void desligar(){
        System.out.println("Desligando a TV.");
    }
    public void abaixarvol(){
        setVolume(getVolume() - 1);
    }
    public void aumentarvol(){
        setVolume(getVolume() + 1);
    }
    public void scanal(){
        setCanal(getCanal() + 1);
    }
    public void abcanal(){
        setCanal(getCanal() - 1);
    }

}