package Exercicio_Robo;

public class Robo {
	String modelo ;
	String cor ;
	int ano ;
	String nSerie ;
	boolean ligado ;
	float direcao ;
	float velocidade ;
	
	public void ligar () {
		ligado = true ;
		velocidade = 0;
	}
	public void desligar () {
		ligado = false ;
		velocidade = 0;
	}
	public void andar () {
		velocidade = 2;
	}
	public void andar(float incremento) {
		velocidade += incremento;
	}
	public void parar () {
		velocidade = 0;
	}
	public void virar () {
		direcao = direcao + 1;
		if( direcao == 360)
			direcao = 0;
	}
	public void virar(float incremento) {
		direcao += incremento;
		if(direcao == 360)
			direcao = 0;
	}
	public Robo() {
		ligado = false;
		modelo = "T1000";
		cor = "Mercúrio";
		ano = 1994;
		nSerie = "1000";
		direcao = 0;
		velocidade = 0;
	}
	public Robo(String modelo, String cor, int ano, String nSerie) {
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.nSerie = nSerie;
		this.velocidade = 2;
		this.direcao = 0;
		this.ligado = true;
	}
	
	public String toString() {
		return "Estado:" + ((ligado) ? " ligado" : " desligado");
	}
	
}
