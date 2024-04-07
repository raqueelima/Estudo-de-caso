package JardimZoo;
/* Sabendo que um Animal para o sistema de cadastro do Jardim Zoológico
possui as seguintes características: Espécie, Data de Nascimento, Nome,
Número de Registro e Local de Nascimento. O objeto possui os seguintes
comportamentos: (i) cadastrar e alterar que recebem como parâmetro as
características do Animal; (ii) outro comportamento desse objeto é a
capacidade de imprimir as informações armazenadas nas suas
características.
 */
public class Animal {
    private String especie;
    private int nascimento;
    private String nome;
    private int numregistro;
    private String localnasc;

    public Animal(String especie, int nascimento, String nome, int numregistro, String localnasc){
        this.especie = especie;
        this.nascimento = nascimento;
        this.localnasc = localnasc;
        this.nome = nome;
        this.numregistro = numregistro;
    }
    public void cadastrar(String especie, int nascimento, String nome, int numregistro, String localnasc){
        this.especie = especie;
        this.nascimento = nascimento;
        this.localnasc = localnasc;
        this.nome = nome;
        this.numregistro = numregistro;
    }
    public String getEspecie(){
        return especie;
    }
    public int getNascimento(){
        return nascimento;
    }
    public String getNome(){
        return nome;
    }
    public int getNumRegistro(){
        return numregistro;
    }
    public String getLocalNasc(){
        return localnasc;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public void setNascimento(int nascimento){
        this.nascimento = nascimento;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNumRegistro(int numregistro){
        this.numregistro = numregistro;
    }
    public void setLocalNasc(String localnasc){
        this.localnasc = localnasc;
    }


    public void alterar(String especie, int nascimento, String nome, int numregistro, String localnasc){
        setEspecie(especie);
        setLocalNasc(localnasc);
        setNome(nome);
        setNumRegistro(numregistro);
        setNascimento(nascimento);
    } 

    public void imprimir(){
        System.out.println("Nome do animal:" + nome);
        System.out.println("Especie do animal:" + especie);
        System.out.println("Numero de registro do animal:" + numregistro);
        System.out.println("Local de nascimento do animal:" + localnasc);
        System.out.println("Data de nascimento do animal:" + nascimento);


    }
}
