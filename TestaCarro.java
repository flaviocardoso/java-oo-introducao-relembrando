
import minha.classes.Carro;

public class TestaCarro {
	public static void main (String[] args) {
		Carro carro = new Carro(2013, "Gol", 35000.0);
		Carro carro2 = new Carro("Civic", 95000.0);
		
		System.out.println("Carro " + carro.getModelo() + ", Ano de " + carro.getAno() + ", Valor de R$ " + carro.getPreco());
		System.out.println("Carro " + carro2.getModelo() + ", Valor de R$ " + carro2.getPreco());
	}
}
