package Iphone;

import aparelho.AparelhoEletronico;
import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;

public class Iphone implements AparelhoEletronico, NavegadorInternet, ReprodutorMusical{

    public void ligar(String numero) {

        System.out.println("Ligando para o número: " + numero);
    }



    public void ligar() {

    }

    public void atender() {
        System.out.println("Atendendo uma ligação pelo IPHONE");
    }


    public void iniciarCorreioVoz() {
        System.out.println("Entrando no Correio de Voz do IPHONE");
    }


    public void exibirPagina(String url) {
        System.out.println(url);
        System.out.println("Exibindo uma página IPHONE");
    }


    public void adicionarNovaAba() {
        System.out.println("ADIÇÃO DE UMA NOVA ABA IPHONE");
    }


    public void atualizarPagina() {
        System.out.println("ATUALIZAÇÃO DA PÁGINA PELO IPHONE");
    }


    public void tocar() {
        System.out.println("Tocando uma música pelo Iphone");
    }


    public void pausar() {
        System.out.println("Pausando uma música pelo Iphone");
    }


    public void selecionarMusica(String musica) {
        System.out.println(musica);
        System.out.println("Fazendo a seleção de uma música pelo Iphone");
    }

    public void DesligarIphone(){
        System.out.println("Desligando.....");
        try {
            Thread.sleep(2000); // Pausa de 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Iphone Desligado.");

    }
}
