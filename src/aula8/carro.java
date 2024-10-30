package aula8;

public class carro {
	
	private String modelo;
	private Double valor;
	private int ano;
	
	void Carro(){}
	
	
	
	
	public carro(String modelo, Double valor, int ano) {
		super();
		this.modelo = modelo;
		this.valor = valor;
		this.ano = ano;
	}




	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
