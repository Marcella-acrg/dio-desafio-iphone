import dipositivo.Iphone;
import dipositivo.Ipod;
import dipositivo.Safari;
import dipositivo.Telefone;

public class App {
    public static void main(String[] args) {

        Telefone telefone = new Telefone();
        telefone.ligar();
        telefone.atender();
        telefone.correioDeVoz();

        Safari safari = new Safari();
        safari.atualizarPagina();

        Iphone iphone = new Iphone();
        iphone.tocarMusica();

        Ipod ipod = new Ipod();
        ipod.tocarMusica();
        ipod.mudarMusica();
        ipod.tocarMusica();
        ipod.mudarMusica();
        ipod.pausarMusica();



    }
}