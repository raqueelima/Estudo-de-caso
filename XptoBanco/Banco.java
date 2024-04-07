package XptoBanco;
/*Sabendo que uma Conta Poupança para o Banco XPTO possui as seguintes
informações: Nome do Correntista, RG, CPF, saldo, número, agência. O
objeto possui os seguintes comportamentos: (i) cadastrar e alterar que
recebem como parâmetro as características da Conta Poupança; (ii)
Imprimir Saldo - que é responsável por imprimir o Saldo do Correntista.
 */
public class Banco {
    private String nome;
    private int rg;
    private int cpf;
    private double saldo;
    private int numero;
    private int agencia;

    public Banco (String nome, int rg, int cpf, double saldo, int numero, int agencia){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }
    public void cadastrar(String nome, int rg, int cpf, double saldo, int numero, int agencia){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }

    public String getNome(){
        return nome;
    }
    public int getRg(){
        return rg;
    }
    public int getCpf(){
        return cpf;
    }
    public double getSaldo(){
        return saldo;
    }
    public int getNumero(){
        return numero;
    }
    public int getAgencia(){
        return agencia;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setRg(int rg){
        this.rg = rg;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public void alterar(String nome, int rg, int cpf, double saldo, int numero, int agencia){
        setNome(nome);
        setRg(rg);
        setCpf(cpf);
        setSaldo(saldo);
        setNumero(numero);
        setAgencia(agencia);
    }

    public void imprimir(){
        System.out.println("Saldo do correntista:"+ saldo);

    }


}
