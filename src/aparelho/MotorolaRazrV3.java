package aparelho;

public class MotorolaRazrV3 implements AparelhoEletronico{
    public void ligar(String numero) {
        System.out.println(numero);
        System.out.println("Ligando pelo motorola Razr");
    }


    public void atender() {
        System.out.println("Atendendo uma ligação pelo Motorola Razr V3");
    }


    public void iniciarCorreioVoz() {
        System.out.println("Entrando no Correio de Voz pelo Motorola Razr V3");
    }
}
