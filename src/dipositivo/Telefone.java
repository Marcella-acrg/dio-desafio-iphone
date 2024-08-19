package dipositivo;

public class Telefone implements AparelhoTelefonico{


    @Override
    public void ligar() {
        System.out.println("Ligando para 83-99947-0002");
    }

    @Override
    public void atender() {
        System.out.println("Atendendendo 83-99635-4898");

    }

    @Override
    public void correioDeVoz() {
        System.out.println("Correio de Voz: Você possui uma conta em aberto no nosso sistema.");

    }
}
