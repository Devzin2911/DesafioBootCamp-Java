package Desafio03;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("==== EXTRATO - Conta Poupança ====");
        super.imprimirInfoComuns();
    }
}
