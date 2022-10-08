

public class PontoTeste2 {
	public static void main(String[] args) {
		// As classes em mesmo package não precisam que mostrem seus atributos em modo public
		System.out.println("Classe com mesmo package.");
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 100;
		
		System.out.println(primeiraConta.saldo);
	}
}
