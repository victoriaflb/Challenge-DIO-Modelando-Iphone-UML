package reprodutor;

public class Walkman implements ReprodutorMusical{
    public void tocar() {
        System.out.println("Tocando uma música pelo Walkman");
    }


    public void pausar() {
        System.out.println("Pausando uma música pelo Walkman");
    }


    public void selecionarMusica(String musica) {
        System.out.println("Fazendo a seleção de uma música pelo Walkman");
        System.out.println("Tocando: "+ musica);

    }
}
