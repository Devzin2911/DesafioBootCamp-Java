package Desafio03;

public class Main {

    public static void main(String[] args) {
        Cliente neide = new Cliente();
        neide.setNome("Neide da Silva Torres");

        Conta cc = new ContaCorrente(neide);
        Conta cp = new ContaPoupanca(neide);

        cc.depositar(355.54);
        cc.depositar(970.00);
        cc.depositar(1235.65);

        cc.transferir(561.19, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println();

        Cliente janderson = new Cliente();
        janderson.setNome("Janderson Silva");

        Conta cs = new ContaSalario("Sim", 2500, janderson);

        cs.depositar(2500);
        cs.imprimirExtrato();
    }
}
