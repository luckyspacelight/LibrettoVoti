package it.polito.tdp.LibrettoVoti.model;

public class Voto {
	
	private String nome;
	private int punti;
	
	public Voto(String nome, int punti) {
		super();
		this.nome = nome;
		this.punti = punti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPunti() {
		return punti;
	}

	public void setPunti(int punti) {
		this.punti = punti;
	}

	@Override
	public String toString() {
		return nome + " : " + punti ;
	}
	
	
	
	
	
	
	
	
	
	
}
