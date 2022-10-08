
import minha.classes.Conta;

public class TestandoValoresStatic {
	public static void main (String[] args) {
		// atributos de instancia não podem ser acessados por métodos estáticos.
		Conta conta = new Conta();
		Conta conta2 = new Conta();
		Conta conta3 = new Conta(2333, 2233);
		
		// estrutura compartilha a variável static que é private e acessada pela também um método static.
		// Ela é capaz de pegar a soma que nos fizemos em cada construtor.
		System.out.println(Conta.getTotal()); 	
	}
}
