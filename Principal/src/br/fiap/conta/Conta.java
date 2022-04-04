package br.fiap.conta;

import br.fiap.cliente.Cliente;

public class Conta {
	private Cliente cliente;
	private double saldo;

	public Conta(Cliente cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public String getDados() {
		String aux = "";
		aux += "CPF: " + cliente.getCpf() + "\n";
		aux += "Nome: " + cliente.getNome() + "\n";
		aux += "Saldo: R$ " + saldo + "\n";

		return aux;
	}

	public void Sacar(double valor) {
		if (valor > saldo) {
			System.out.println("Erro!");
		} else {
			this.saldo -= valor;
		}
	}

	public void depositar(double valor) {
		if (!(valor < 0)) {
			this.saldo += valor;
		} else {
			System.out.println("Erro!");
		}

	}

}
