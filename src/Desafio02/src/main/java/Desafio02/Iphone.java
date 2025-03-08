package Desafio02;

public class Iphone {

    public static void main(String[] args) {
        ReprodutorMusical rp = new ReprodutorMusical();
        AparelhoTelefonico at = new AparelhoTelefonico();
        Navegador nav = new Navegador();

        rp.tocarMusica();
        rp.pausarMusica();
        rp.selecionarMusica("Creed - Higher");

        System.out.println();

        at.ligar("(21)99605-3683");
        at.atender(true);

        System.out.println();

        nav.exibirPagina("http://aprendendonadio.com.br");
        nav.addNovaAba();
        nav.atualizarPagina();

    }
}
