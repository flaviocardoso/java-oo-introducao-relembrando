
public class TesteMetodoReferencia {
	public static void main (String[] args) {
		System.out.println("Testando metodo de classes returnado a própria referência.");
		
		ContaMetodoReferencia conta = new ContaMetodoReferencia();
		
		conta.saldo = 500;
		
		conta
			.depositar(150)
			.sacar(90)
			.depositar(60)
			.depositar(80)
			.sacar(750);
		
		// foi sacado duas vezes
		// Mas só aparece uma vez sacado.
		
		System.out.println(conta.saldo);
	}
}
