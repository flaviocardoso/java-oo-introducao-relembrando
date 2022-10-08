
public class TesteReferencia {
	public static void main (String[] args) {
		System.out.println("Criando referências para classe Conta.");
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		// toda referência da primeira conta agora é da segunda conta.
		// Mesmo se mudar algum valor de atributo na segunda conta, os valores vão passar para primeira conta.
		Conta segundaConta = primeiraConta;
		System.out.println(segundaConta.saldo);
		segundaConta.saldo = 500;
		
		System.out.println(segundaConta.saldo); // 500
		System.out.println(primeiraConta.saldo); // 500
		
		Conta terceiraConta = new Conta();
		
		if (primeiraConta == segundaConta) {
			System.out.println("Mesma conta!");
		} else {
			System.out.println("Contas diferentes!");
		}
		
		if (primeiraConta == terceiraConta) {
			System.out.println("Mesma conta!");
		} else {
			System.out.println("Contas diferentes!");
		}
	}
}
