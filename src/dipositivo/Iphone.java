package dipositivo;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical {

    private List<String> playlist = new ArrayList<>();
    private int indiceMusical = 0;

    public Iphone() {
        playlist.add("Nirvana - Smells Like Teen Spirit");
        playlist.add("Red Hot Chili Peppers - Californication");
        playlist.add("Coldplay-Yellow");

    }

    @Override
    public void ligar() {
        System.out.println("Ligando");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");

    }

    @Override
    public void correioDeVoz() {
        System.out.println("Iniciando correio");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");

    }

    @Override
    public void tocarMusica() {
        System.out.println("Iphone - Tocando: " + playlist.get(indiceMusical));

    }

    @Override
    public void pausarMusica() {
        System.out.println("Iphone - Pausar: " + playlist.get(indiceMusical));

    }

    @Override
    public void mudarMusica() {
        indiceMusical = (indiceMusical + 1) % playlist.size();
        System.out.println("Ihpone - Mudar para: " + playlist.get(indiceMusical) );

    }
}
