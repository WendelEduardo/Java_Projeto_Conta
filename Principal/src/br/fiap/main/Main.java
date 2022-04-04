package br.fiap.main;

import java.util.Scanner;

import br.fiap.cliente.Cliente;
import br.fiap.conta.Conta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		Conta[] conta = new Conta[3];

		for (int i = 0; i < conta.length; i++) {
			String nome;
			String cpf;
			double saldo;

			
			System.out.print("Digite o nome: ");
			nome = entrada.next();

			System.out.print("Digite o CPF: ");
			cpf = entrada.next();

			System.out.print("Digite o valor para iniciar o saldo: ");
			saldo = entrada.nextDouble();

			conta[i] = new Conta(new Cliente(cpf, nome), saldo);
			System.out.println(" ");
		}
		
		for (Conta c : conta) {
			System.out.println(c.getDados());
		}

	}

}
