package XptoBanco;

public class RodarBanco {
    public static void main(String[] args) {
        Banco bancoXpto = new Banco(null, 0, 0, 0, 0, 0);

        bancoXpto.cadastrar(null, 0, 0, 0, 0, 0);
        bancoXpto.alterar(null, 0, 0, 0, 0, 0);
        bancoXpto.imprimir();
    }
}
