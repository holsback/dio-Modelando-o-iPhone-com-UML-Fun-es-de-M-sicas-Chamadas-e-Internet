import java.awt.event.ActionListener;

public class Iphone implements NavegadorInternet, MusicPlayer, AparelhoTelefonico {
    @Override
    public void verificarConexao() {
        System.out.println("O iphone está verificando a conexão com a internet!");
    }

    @Override
    public void navegarInternet() {
        System.out.println("O iphone está navegando a internet!");
    }

    @Override
    public void desconectar() {
        System.out.println("O Iphone esta desconectado!");
    }

    @Override
    public void playMusic() {
        System.out.println("O Iphone está tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O Iphone pausou a música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O Iphone parou música");
    }


    @Override
    public void ligar() {
        System.out.println("O Iphone está ligando!");
    }

    @Override
    public void atender() {
        System.out.println("O Iphone atendeu a ligação!");
    }

    @Override
    public void desligar() {
        System.out.println("O Iphone desligou a ligação!");
    }
}
