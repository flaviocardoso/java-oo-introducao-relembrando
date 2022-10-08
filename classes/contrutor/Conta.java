package classes.contrutor;

import classes.Cliente;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public Conta(int agencia, int numero) {
		if (agencia <= 0 || numero <= 0) {
			System.out.println("As entradas não podem ser negativas");
			return;
		}
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agencia não pode ser negativa");
			return;
		}
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Numero não pode ser negativo");
			return;
		}
		this.numero = numero;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	public boolean transferir(double valor, Conta destino) {
		if (this.sacar(valor)) {
			destino.depositar(valor);
			return true;
		}
		return false;
	}
}
