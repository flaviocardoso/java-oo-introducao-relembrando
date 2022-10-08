
public class TesteMetodosClasse {
	public static void main (String[] args) {
		System.out.println("Criando metódos na classe.");
		
		ContaMetodos conta = new ContaMetodos();
		conta.saldo = 100;
		conta.depositar(50);
		
		System.out.println("Conta saldo - " + conta.saldo);
		
		conta.sacar(20);
		
		System.out.println(conta.saldo);
		
		ContaMetodos conta2 = new ContaMetodos();
		conta2.depositar(500);
		
		System.out.println("Conta2 saldo - " + conta2.saldo);
		
		boolean transferenciaInfo = conta2.transferir(300, conta);
		
		if (transferenciaInfo) {
			System.out.println("Transferência com sucesso!");
		} else {
			System.out.println("Faltou dinheiro!");
		}
		
		System.out.println("Conta2 saldo - " + conta2.saldo);
		System.out.println("Conta saldo - " + conta.saldo);
	}
}
