package usuario;

import java.util.Scanner;
import Iphone.Iphone;
import aparelho.AparelhoEletronico;
import aparelho.MotorolaRazrV3;
import aparelho.Nokia3310;
import navegador.Chrome;
import navegador.Firefox;
import navegador.NavegadorInternet;
import reprodutor.Discman;
import reprodutor.ReprodutorMusical;
import reprodutor.Walkman;

public  class Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aparelhos
        Iphone iphone = new Iphone();
        MotorolaRazrV3 motorola = new MotorolaRazrV3();
        Nokia3310 nokia3310 = new Nokia3310();

        // Navegadores
        Chrome chrome = new Chrome();
        Firefox firefox = new Firefox();

        // Reprodutores
        Walkman walkman = new Walkman();
        Discman discman = new Discman();

        System.out.println("IPHONE");

        // Escolher a funcionalidade do Iphone
        System.out.println("*---------------------* Bem-vinde ao Iphone © 2024 *---------------------*\n" +
                "Qual a funcionalidade que você deseja utilizar?\n" +
                "\n0 - Telefone\n 1 - Navegar na Internet\n 2 - Música\n 3 - Desligar"
        );
        int opcao;
        do {
            opcao = scanner.nextInt();
            System.out.println("Opção: " + opcao);

            switch (opcao) {
                // TELEFONE
                case 0:
                    System.out.println("TELEFONE");
                    System.out.println("Qual função do telefone você quer testar?\n" +
                            "\n0 - Ligar\n 1 - Atender\n 2 - Correio de Voz");
                    int ligacao = scanner.nextInt();
                    switch (ligacao) {
                        case 0:
                            System.out.print("Digite o número para ligar: ");
                            String numero = scanner.next();
                            iphone.ligar(numero);
                            break;
                        case 1:
                            iphone.atender();
                            break;
                        case 2:
                            iphone.iniciarCorreioVoz();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;

                // NAVEGAÇÃO
                case 1:
                    System.out.println("NAVEGAR NA INTERNET");
                    System.out.println("Qual navegador você quer usar?\n" +
                            " 0 - Chrome\n 1- Firefox");
                    int navegacao = scanner.nextInt();

                    switch (navegacao) {
                        case 0:
                            System.out.println("Navegador: CHROME");

                            System.out.println("Qual função da Chrome você deseja utilizar?\n" +
                                    "\n0 - Exibir página\n1- Adicionar Nova Aba\n2- Atualizar Página");
                            int internet = scanner.nextInt();

                            System.out.print("Digite a URL: ");
                            String urlChrome = scanner.next();

                            switch (internet) {
                                case 0:
                                    chrome.exibirPagina(urlChrome);
                                    break;
                                case 1:
                                    chrome.adicionarNovaAba();
                                    break;
                                case 2:
                                    chrome.atualizarPagina();
                                    break;
                                default:
                                    System.out.println("Opção inválida");
                            }
                            break;
                        case 1:
                            System.out.println("Navegador: FIREFOX");

                            System.out.println("Qual função do Firefox você deseja utilizar?\n" +
                                    "\n0 - Exibir página\n1- Adicionar Nova Aba\n2- Atualizar Página");
                            int internet2 = scanner.nextInt();

                            System.out.print("Digite a URL: ");
                            String urlFirefox = scanner.next();

                            switch (internet2) {
                                case 0:
                                    firefox.exibirPagina(urlFirefox);
                                    break;
                                case 1:
                                    firefox.adicionarNovaAba();
                                    break;
                                case 2:
                                    firefox.atualizarPagina();
                                    break;
                                default:
                                    System.out.println("Opção inválida");
                            }
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    break;

                // MÚSICA
                case 2:
                    System.out.println("MÚSICA");

                    System.out.println("Qual plataforma de música você deseja usar?\n" +
                            "\n0 - Discman\n 1 - Walkman");
                    int plataforma = scanner.nextInt();
                    switch (plataforma) {
                        case 0:
                            System.out.println("PLATAFORMA: DISCMAN");
                            System.out.println("Qual funcionalidade do Discman você quer testar?\n" +
                                    "\n0 - Tocar Música \n 1 - Pausar Música \n 2 - Selecionar Música");
                            int funcMusica = scanner.nextInt();
                            switch (funcMusica) {
                                case 0:
                                    discman.tocar();
                                    break;
                                case 1:
                                    discman.pausar();
                                    break;
                                case 2:
                                    System.out.print("Digite o nome da música: ");
                                    String musicaDiscman = scanner.next();
                                    discman.selecionarMusica(musicaDiscman);
                                    break;
                                default:
                                    System.out.println("Opção inválida");
                            }
                            break;
                        case 1:
                            System.out.println("PLATAFORMA: WALKMAN");
                            System.out.println("Qual funcionalidade do Walkman você quer testar?\n" +
                                    "\n0 - Tocar Música \n 1 - Pausar Música \n 2 - Selecionar Música");
                            int funcMusicaWalkman = scanner.nextInt();
                            switch (funcMusicaWalkman) {
                                case 0:
                                    walkman.tocar();
                                    break;
                                case 1:
                                    walkman.pausar();
                                    break;
                                case 2:
                                    System.out.print("Digite o nome da música: ");
                                    String musicaWalkman = scanner.next();
                                    walkman.selecionarMusica(musicaWalkman);
                                    break;
                                default:
                                    System.out.println("Opção inválida");
                            }
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    break;

                // DESLIGAR
                case 3:

                   iphone.DesligarIphone();
                   break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
           break;
        } while (opcao != 3);

        scanner.close();

        System.out.println("\nAll rights reserved victoriaflb © 2024\n");
    }
}
