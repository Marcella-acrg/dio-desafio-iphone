package dipositivo;

public class Safari implements NavegadorDeInternet{


    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando página");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");

    }
}
