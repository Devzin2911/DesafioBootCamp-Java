package desafio01;

import java.util.Scanner;

public class contaTerminal {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=========================================");
		System.out.println("    SISTEMA BANCARIO DO RIO DE JANEIRO   ");
		System.out.println("=========================================");
		System.out.println();
		
		
		System.out.print("Por favor, digite o numero da sua conta: ");
		int numeroConta = scan.nextInt();
		System.out.println();
		System.out.println("-----------------------------");
		
		System.out.print("Por favor, digite sua agencia: ");
		String ag = scan.next();
		System.out.println();
		System.out.println("-----------------------------");
		
		System.out.print("Por favor, digite seu nome: ");
		String nomeCliente = scan.next();
		System.out.println();
		System.out.println("-----------------------------");
		
		System.out.print("Por favor, digite seu saldo: ");
		Double saldo = scan.nextDouble();
		System.out.println();
		System.out.println("-----------------------------");
		
		
		System.out.print(
				"Olá " + nomeCliente + 
				", obrigado por criar uma conta em nosso banco, "
				+ "sua conta é " + numeroConta
				+ ", sua agencia é " + ag + " e seu saldo é " + saldo + 
				"já está disponivel para saque"
				);
	}
	
}
