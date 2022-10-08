
public class ContaMetodoReferencia {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public ContaMetodoReferencia depositar(double valor) {
		this.saldo += valor;
		return this;
	}
	
	public ContaMetodoReferencia sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Sacado!!!");
		}
		return this;
	}
}
