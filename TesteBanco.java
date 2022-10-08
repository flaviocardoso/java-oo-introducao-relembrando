
public class TesteBanco {
	public static void main(String[] args) {
		Cliente flavio = new Cliente();
		flavio.nome = "Flavio Cardoso";
		flavio.cpf = "999.999.999-99";
		flavio.profissao = "programador";
		
		Conta conta = new Conta();
		conta.depositar(100);
		
		// referencia ao cliente já existente
		conta.titular = flavio;
		
		System.out.println(conta.titular.nome);
		System.out.println(conta.titular);
		System.out.println(flavio);
		
		Conta conta2 = new Conta();
		conta2.depositar(400);
		
		// instanciando diretamente o titular
		// conta2.titular.nome = "Nome titular"; // err - Não existe cliente, não foi inicializado 
		conta2.titular = new Cliente(); // o cliente pode inicializar tanto dessa forma, tanto na classe de conta.
		conta2.titular.nome = "Outro cliente";
		
		System.out.println(conta2.titular.nome);
		
	}
}
