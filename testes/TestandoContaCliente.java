package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

importclasses.*;

@DisplayName("Testando Conta cliente")
class TestandoContaCliente {
	
	private final Conta primeiraConta = new Conta();

	@Test
	void testContaCliente() {
		Cliente cliente = new Cliente();
		cliente.setNome("Joselito");
		cliente.setCpf("999.999.999-99");
		cliente.setProfissao("designer");
		primeiraConta.setTitular(cliente);
		
		assertEquals("Joselito", primeiraConta.getTitular().getNome());
		assertEquals("999.999.999-99", primeiraConta.getTitular().getCpf());
		assertEquals("designer", primeiraConta.getTitular().getProfissao());
	}
	
	@Test
	void testContaCliente2() {
		primeiraConta.setTitular(new Cliente());
		primeiraConta.getTitular().setNome("Joselito");
		primeiraConta.getTitular().setCpf("999.999.999-99");
		primeiraConta.getTitular().setProfissao("designer");
		
		assertEquals("Joselito", primeiraConta.getTitular().getNome());
		assertEquals("999.999.999-99", primeiraConta.getTitular().getCpf());
		assertEquals("designer", primeiraConta.getTitular().getProfissao());
	}
	
	@Test
	void testContaCliente3() {
		primeiraConta.setTitular(new Cliente());
		Cliente cliente = primeiraConta.getTitular();
		cliente.setNome("Joselito");
		cliente.setCpf("999.999.999-99");
		cliente.setProfissao("designer");
		primeiraConta.setTitular(cliente);
		
		assertEquals("Joselito", primeiraConta.getTitular().getNome());
		assertEquals("999.999.999-99", primeiraConta.getTitular().getCpf());
		assertEquals("designer", primeiraConta.getTitular().getProfissao());
	}

}
