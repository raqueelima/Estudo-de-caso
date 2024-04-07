package XptoCarro;
/* Sabendo que um Carro para o sistema de cadastro da loja XPTO Veículos
possui as seguintes características: Código, Marca, Cor, Modelo, Ano de
Fabricação, Número de Portas, Tipo de Combustível, Quantidade
Disponível, Preço e se carro é completo ou básico. O objeto Carro possui os
seguintes comportamentos: (i) cadastrar e alterar que recebem como
parâmetro as características do Carro; (ii) listar – comportamento
responsável por listar as informações do carro.
 */

public class Carro {
    private int codigo;
    private String marca;
    private String cor;
    private String modelo;
    private int anoFab;
    private int numPortas;
    private String tipComb;
    private int qntd;
    private double preco;
    private String tipCar;

    public Carro (int codigo, String marca, String cor, String modelo, int anoFab, int numPortas, String tipComb, int qntd, double preco, String tipCar){
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.numPortas = numPortas;
        this.qntd = qntd;
        this.tipComb = tipComb;
        this.preco = preco;
        this.tipCar = tipCar;
    }
    public void cadastrar(int codigo, String marca, String cor, String modelo, int anoFab, int numPortas,
    String tipComb, int qntd, double preco, String tipCar) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.numPortas = numPortas;
        this.tipComb = tipComb;
        this.qntd = qntd;
        this.preco = preco;
        this.tipCar = tipCar;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getMarca(){
        return marca;
    }
    public String getCor(){
        return cor;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAnoFab(){
        return anoFab;
    }
    public int getNumPortas(){
        return numPortas;
    }
    public String getTipComb(){
        return tipComb;
    }
    public int getQntd(){
        return qntd;
    }
    public double getPreco(){
        return preco;
    }
    public String getTipCar(){
        return tipCar;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAnoFab(int anoFab){
        this.anoFab = anoFab;
    }
    public void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }
    public void setTipComb(String tipComb){
        this.tipComb = tipComb;
    }
    public void setQntd(int qntd){
        this.qntd = qntd;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setTipCar(String tipCar){
        this.tipCar = tipCar;
    }



    public void alterar (int codigo, String marca, String cor, String modelo, int anoFab, int numPortas,
    String tipComb, int qntd, double preco, String tipCar){
        setCodigo(codigo);
        setMarca(marca);
        setCor(cor);
        setModelo(modelo);
        setAnoFab(anoFab);
        setNumPortas(numPortas);
        setTipComb(tipComb);
        setQntd(qntd);
        setPreco(preco);
        setTipCar(tipCar);
    }
    


public void listar() {
System.out.println("Código: " + codigo);
System.out.println("Marca: " + marca);
System.out.println("Cor: " + cor);
System.out.println("Modelo: " + modelo);
System.out.println("Ano de Fabricação: " + anoFab);
System.out.println("Número de Portas: " + numPortas);
System.out.println("Tipo de Combustível: " + tipComb);
System.out.println("Quantidade Disponível: " + qntd);
System.out.println("Preço: " + preco);
System.out.println("Tipo do carro (Básico ou Completo): " + tipCar);
}
}
