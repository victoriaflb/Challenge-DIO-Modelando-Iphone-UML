package reprodutor;

public class Discman implements ReprodutorMusical{
    public void tocar() {
        System.out.println("Tocando uma música pelo Dicsman");
    }


    public void pausar() {
        System.out.println("Pausando uma música pelo Dicsman");
    }


    public void selecionarMusica(String musica) {
        System.out.println("Fazendo a seleção de uma música pelo Dicsman");
        System.out.println("Tocando: "+ musica);

    }
}
