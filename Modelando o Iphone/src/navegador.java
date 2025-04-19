public class navegador implements NavegadorInternet {
    @Override
    public void verificarConexao() {
        System.out.println("O iphone está verificando a conexão com a internet!");
    }

    @Override
    public void navegarInternet() {
        System.out.println("O Iphone está navegando na internet!");
    }

    @Override
    public void desconectar() {
        System.out.println("O Iphone está desconectado!");
    }
}
