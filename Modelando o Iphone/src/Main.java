public class Main {

    public static void main(String[] args) {

        verifyConexao(new Iphone());
        navegar(new Iphone());

    }

    public static void verifyConexao(NavegadorInternet iphone) {
        iphone.verificarConexao();
    }

    public static void navegar(NavegadorInternet iphone) {
        iphone.navegarInternet();
    }

}
