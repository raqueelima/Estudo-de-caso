package EmpresaXPTO;
/*Sabendo que um Funcionário para o sistema de cadastro da Empresa XPTO
S.A. possui as seguintes características: nome, data de nascimento, RG,
CPF, endereço, naturalidade (Local de nascimento), salário, profissão, grau
de instrução e matrícula. O Funcionário possui os seguintes comportamentos: 
(i) cadastrar e alterar que recebem como parâmetro as
características do Funcionário; (ii) Imprimir dados do Funcionário;
 */
public class Funcionario {
    private String nome;
    private int datanasc;
    private int rg;
    private int cpf;
    private String endereco;
    private String naturalidade;
    private int salario;
    private String profissao;
    private String grau;
    private int matricula;

    public Funcionario (String nome, int datanasc, int rg, int cpf, String endereco, String naturalidade, int salario, String profissao, String grau, int matricula){
        this.nome = nome;
        this.datanasc = datanasc;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grau = grau;
        this.matricula = matricula;
    }
    public void cadastrar(String nome, int datanasc, int rg, int cpf, String endereco, String naturalidade, int salario, String profissao, String grau, int matricula){
        this.nome = nome;
        this.datanasc = datanasc;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grau = grau;
        this.matricula = matricula;
    }


    public String getNome(){
        return nome;
    }
    public int getDatanasc(){
        return datanasc;
    }
    public int getRg(){
        return rg;
    }
    public int getCpf(){
        return cpf;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getNaturalidade(){
        return naturalidade;
    }
    public int getSalario(){
        return salario;
    }
    public String getProfissao(){
        return profissao;
    }
    public String getGrau(){
        return grau;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setNaturalidade(String naturalidade){
        this.naturalidade = naturalidade;
    }
    public void setProfissao(String profissao){
        this.profissao = profissao;
    }
    public void setGrau(String grau){
        this.grau = grau;
    }
    public void setRg(int rg){
        this.rg = rg;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public void setSalario(int salario){
        this.salario = salario;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setDatanasc(int datanasc){
        this.datanasc = datanasc;
    }


    public void alterar(String nome, int datanasc, int rg, int cpf, String endereco, String naturalidade, int salario, String profissao, String grau, int matricula){
        setCpf(cpf);
        setDatanasc(datanasc);
        setEndereco(endereco);
        setMatricula(matricula);
        setGrau(grau);
        setNaturalidade(naturalidade);
        setNome(nome);
        setProfissao(profissao);
        setRg(rg);
        setSalario(salario);

    }

    public void imprimir(){
        System.out.println("Nome do funcionario:" + nome);
        System.out.println("CPF do funcionario:" + cpf);
        System.out.println("RG do funcionario:" + rg);
        System.out.println("Matricula do funcionario:" + matricula);
        System.out.println("Naturalidade do funcionario:" + naturalidade);
        System.out.println("Endereço do funcionario:" + endereco);
        System.out.println("Nascimento do funcionario:" + datanasc);
        System.out.println("Profissao do funcionario:" + profissao);
        System.out.println("Salario do funcionario:" + salario);
        System.out.println("Grau do funcionario:" + grau);

    }
    
}
