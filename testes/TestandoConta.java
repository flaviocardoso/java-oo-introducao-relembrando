package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import classes.Conta;
import classes.Cliente;

@DisplayName("Testando Conta")
public class TestandoConta {
	private final Conta primeiraConta = new Conta();
	private final Conta segundaConta = new Conta();
	private final Conta terceiraConta = primeiraConta;

	@Test
	void testContaSaldo() {
		primeiraConta.depositar(200);
		
		assertEquals(200, primeiraConta.getSaldo());
		
		primeiraConta.depositar(100);
		
		assertEquals(300, primeiraConta.getSaldo());
	}
	
	@Test
	void testAumentandoSaldo() {
		primeiraConta.depositar(400);
		primeiraConta.depositar(100);
		
		assertEquals(500, primeiraConta.getSaldo());
	}
	
	@Test
	void testContaAgencia() {
		primeiraConta.setAgencia(234);
		assertEquals(234, primeiraConta.getAgencia());
	}
	
	@Test
	void testContaNumero() {
		primeiraConta.setNumero(338884888);
		assertEquals(338884888, primeiraConta.getNumero());
	}
	
	@Test
	void testContaTitular() {
		Cliente cliente = new Cliente();
		cliente.setNome("Joselito");
		
		primeiraConta.setTitular(cliente);
		assertEquals("Joselito", primeiraConta.getTitular().getNome());
	}
	
	@Test
	void testContaDiferenteConta2() {
		assertEquals(false, primeiraConta == segundaConta);
	}
	
	@Test
	void testContaIgualConta3() {
		assertEquals(true, primeiraConta == terceiraConta);
	}
	
	@Test
	void testContaSacar() {
		primeiraConta.depositar(450);
		
		assertEquals(450, primeiraConta.getSaldo());
		
		primeiraConta.depositar(700);
		
		assertEquals(1150, primeiraConta.getSaldo());
		
		primeiraConta.sacar(900);
		
		assertEquals(250, primeiraConta.getSaldo());
	}
	
	@Test
	void testContaTransferir() {
		primeiraConta.depositar(530);
		segundaConta.depositar(950);
		
		segundaConta.transferir(300, primeiraConta);
		
		assertEquals(830, primeiraConta.getSaldo());
		assertEquals(650, segundaConta.getSaldo());
	}
}
