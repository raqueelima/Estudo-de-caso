package Carro;
/*//*1) Utilizando os conhecimentos de O.O. construa um
programa utilizando as informações abaixo.
Um carro possui as seguintes características:
 modelo;
 velocidade;
 aceleração;
 marcha.
O carro pode realizar as seguintes ações:
 ligar e desligar;
 acelerar e desacelerar;
 virar a direita e esquerda;
 marcha para cima e para baixo. */

public class Carro{
  private String modelo;
  private int velocidade;
  private double aceleracao;
  private int marcha;
  
    public Carro (String modelo){
        this.modelo = modelo;
    
        
    }

  public double getAceleracao() {
      return aceleracao;
  }
  public String getModelo(){
        return modelo;
  }
  public int getMarcha() {
      return marcha;
  }
  public int getVelocidade() {
      return velocidade;
  }
  public void setAceleracao(double aceleracao) {
      this.aceleracao = aceleracao;
  }
  public void setMarcha(int marcha) {
      this.marcha = marcha;
  }
  public void setModelo(String modelo) {
      this.modelo = modelo;
  }
  public void setVelocidade(int velocidade) {
      this.velocidade = velocidade;
  }
  public void ligar (){
    System.out.println("O carro está ligando.");
  }
  public void desligar (){
    System.out.println("O carro está desligando.");
  }
  public void acelerar (double aceleracao){
    setAceleracao(aceleracao);
    mCima();
  }
  public void desacelerar (){
    setAceleracao(getAceleracao() - 1);
    mBaixo();
  }
  public void direita(){
    System.out.println("Indo para a direita.");
  }
  public void esquerda(){
    System.out.println("Indo para a esquerda.");
  }
  public void mCima (){
    setMarcha(getMarcha() + 1);
  }
  public void mBaixo(){
    setMarcha(getMarcha() - 1);
  }
  public String toString(){
    return "Modelo do carro" + getModelo();
  }



}