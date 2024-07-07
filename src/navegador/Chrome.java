package navegador;

public class Chrome implements NavegadorInternet{
    public void exibirPagina(String url) {
        System.out.println("Buscando a url: "+ url);
        System.out.println("Exibindo uma página pelo Chrome");
    }


    public void adicionarNovaAba() {
        System.out.println("ADIÇÃO DE UMA NOVA ABA PELO CHROME");
    }


    public void atualizarPagina() {
        System.out.println("ATUALIZAÇÃO DA PÁGINA PELO CHROME");
    }

}
