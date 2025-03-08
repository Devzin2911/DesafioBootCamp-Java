package Desafio02;

public class AparelhoTelefonico {

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender(boolean atendeu){
        if(atendeu == true) {
            System.out.println("Atendeu!");
        } else {
            iniciarCorreioVoz();
        }
    }

    public boolean iniciarCorreioVoz() {
        System.out.println("Grave seu recado ou tente mais tarde...");
        return false;
    }

}
