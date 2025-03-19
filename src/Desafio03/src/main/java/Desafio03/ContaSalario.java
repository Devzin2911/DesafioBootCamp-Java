package Desafio03;

public class ContaSalario extends Conta {

    private String funcionario;
    private double salario;
    private double chequeEspecial;

    public ContaSalario(String funcionario, double salario, Cliente cliente) {
        super(cliente);
        this.funcionario = funcionario;
        this.salario = salario;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== EXTRATO - Conta Salario ====");
        super.imprimirInfoComuns();
        System.out.println("Funcionario: " + funcionario);
        System.out.println("Salario: " + salario);
        System.out.println("Cheque Especial: " + this.limiteChequeEspecial());

    }

    public double limiteChequeEspecial() {
      return this.chequeEspecial = salario * 0.5;
    }

}
