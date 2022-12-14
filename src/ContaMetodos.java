
public class ContaMetodos {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
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
	
	public boolean transferir(double valor, ContaMetodos destino) {
		if (this.saldo >= valor) {
			this.sacar(valor);
			destino.depositar(valor);;
			return true;
		}
		return false;
	}
}
