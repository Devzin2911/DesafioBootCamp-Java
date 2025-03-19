package Desafio03;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("==== EXTRATO - Conta Corrente ====");
        super.imprimirInfoComuns();
    }

}
