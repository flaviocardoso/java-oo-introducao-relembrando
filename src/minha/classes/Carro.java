package minha.classes;

public class Carro {
	private int ano;
	private String modelo;
	private double preco;
	
	public Carro() {
		
	}
	
	public Carro(int ano, String modelo, double preco) {
		if (ano >= 1891) {
			this.ano = ano;
		} else {
			System.out.println("Valor inválido. Não pode ano inferiores.");
			this.ano = 2022; // valores passados para não ficar vazios
		}
		
		if (modelo != null) {
			this.modelo = modelo;
		} else {
			System.out.println("O modelo não foi informado");
			this.modelo = "Gol"; // valores passados para não ficar vazios
		}
		
		if (preco > 0) {
			this.preco = preco;
		} else {
			System.out.println("O preço não é valido.");
			this.preco = 40000.0; // valores passados para não ficar vazios
		}
		
		this.ano = ano;
		this.modelo = modelo;
		this.preco = preco;
	}
	
	public Carro(String modelo, double preco) {
		this(2022, modelo, preco);
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public double getPreco() {
		return this.preco;
	}
}
