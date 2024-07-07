package navegador;

public class Firefox implements NavegadorInternet{

    public void exibirPagina(String url) {
        System.out.println("Buscando a url: "+ url);
        System.out.println("Exibindo uma página pelo Firefox");
    }


    public void adicionarNovaAba() {
        System.out.println("ADIÇÃO DE UMA NOVA ABA PELO FIREFOX");
    }


    public void atualizarPagina() {
        System.out.println("ATUALIZAÇÃO DA PÁGINA PELO FIREFOX");
    }
}
