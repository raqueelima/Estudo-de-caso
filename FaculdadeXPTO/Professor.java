package FaculdadeXPTO;
/* Sabendo que um Professor para o sistema de cadastro da Faculdade XPTO
possui as seguintes características: nome, titulação, formação, carga horária,
salário e uma descrição das disciplinas que professor pode ensinar. O
Professor possui os seguintes comportamentos: (i) cadastrar e alterar que
recebem como parâmetro as características do Professor; (ii) alterar a
descrição de disciplina ensinada; (iii) Imprimir dados do Professor */
public class Professor {
    private String nome;
    private String titulacao;
    private String formacao;
    private int cargahoraria;
    private double salario;
    private String discdisp;

    public Professor(String nome, String titulacao, String formacao, int cargahoraria, double salario, String discdisp){
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargahoraria = cargahoraria;
        this.salario = salario;
        this.discdisp = discdisp;
    }
    public void cadastrar(String nome, String titulacao, String formacao, int cargahoraria, double salario, String discdisp){
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargahoraria = cargahoraria;
        this.salario = salario;
        this.discdisp = discdisp;
    }

    public String getDiscDisp(){
        return discdisp;
    }
    public void setDiscDisp(String discdisp){
        this.discdisp = discdisp;
    }

    public void alterar (String discdisp){
        setDiscDisp(discdisp);
    }

    public void imprimir(){
        System.out.println("Nome do professor:" + nome);
        System.out.println("Titulaçao do professor:" + titulacao); 
        System.out.println("Formaçao do professor:" + formacao);
        System.out.println("Carga horaria:" + cargahoraria);
        System.out.println("Salario:" + salario);
        System.out.println("Disciplinas disponiveis" + discdisp);
    }





}
