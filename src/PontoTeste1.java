

import minha.classes.Conta;

public class PontoTeste1 {
	public static void main(String[] args) {
		// Classes com diferentes package os atributos ou métodos precisam ser public para serem acessados.
		System.out.println("Classe com package diferente");
		System.out.println("Ponto de Teste1!");
		
		// Quando se cria uma instância todos os atributos são zerados, em default. (int - 0, double - 0.0)
		// Também se pode adicionar valores padrões para os atributos.
		// Para não ter problema em acesso se usa o encapsulamento (privado).
		// Classes em nivel de package tem acesso sem precisar de public.
		
		// em Java, primeira conta é uma referência de conta
		Conta primeiraConta = new Conta();
		
		System.out.println(primeiraConta.getSaldo()); // 0.0
		System.out.println(primeiraConta.getTitular()); // null
		
		primeiraConta.depositar(200);
		
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta();
		
		segundaConta.depositar(100);
		
		System.out.println(segundaConta.getSaldo());	
		System.out.println(segundaConta.getAgencia()); // valor padrão - int 0
		System.out.println(segundaConta.getNumero()); // valor padrão - int 0
		
	}
}
