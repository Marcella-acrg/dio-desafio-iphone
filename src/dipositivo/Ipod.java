package dipositivo;

import java.util.ArrayList;
import java.util.List;

public class Ipod implements ReprodutorMusical {


    private List<String> playlist = new ArrayList<>();
    private int indiceMusical = 0;

    public Ipod() {
        playlist.add("Nirvana - Smells Like Teen Spirit");
        playlist.add("Red Hot Chili Peppers - Californication");
        playlist.add("Coldplay-Yellow");

    }

    @Override
    public void tocarMusica() {
        System.out.println("Ipod - Tocando: " + playlist.get(indiceMusical));

    }

    @Override
    public void pausarMusica() {
        System.out.println("Ipod - Pausar: " + playlist.get(indiceMusical));

    }

    @Override
    public void mudarMusica() {
        indiceMusical = (indiceMusical + 1) % playlist.size();
        System.out.println("Ipod - Mudar para: " + playlist.get(indiceMusical));

    }
}
