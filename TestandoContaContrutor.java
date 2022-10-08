
import minha.classes.Conta;

public class TestandoContaContrutor {
	public static void main(String[] args) {
		// podemos setar os valores de agencia e numero diretamente pelo contrutor
		// Quando criamos o contrutor, já não temos mais o contrutor padrão, e deixa de se comporta de maneira padrão.
		// Podemos ter mais de um contrutor, dependendo do tipo ou a quantidade de parametros, isso vale para os métodos.
		Conta conta = new Conta(1223, 2334);
		
		System.out.println("Agencia: " + conta.getAgencia());
		System.out.println("Numero: " + conta.getNumero());
		
		// A classe conta nos permite acessar os sets de agencia e numero
		// Ambas contrutor e os sets não permite nos passar valores negativos.
		conta.setAgencia(-223); // Mostra uma mensagem
		conta.setAgencia(234); // Nos permite fazer a operação
		conta.setNumero(-334566); //Mostra uma mensagem
		conta.setNumero(3345567); // Nos permite fazer a operação
		
		System.out.println("Agencia: " + conta.getAgencia());
		System.out.println("Numero: " + conta.getNumero());
	}
}
