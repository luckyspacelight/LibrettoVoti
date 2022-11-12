package it.polito.tdp.LibrettoVoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List <Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<Voto>();
	}
	
	public void add(Voto v) {
		this.voti.add(v);
	}	 
	
	public Libretto filtraPunti(int punti) {
		Libretto result = new Libretto();
		for (Voto v : this.voti) {
			if (v.getPunti() == punti) {
				result.add(v);
			}
		}
		return result;		
	}
	
	/**
	 * Restituisce il punteggio ottenuto all'esame di cui
	 * specifico il nome	
	 * @param nome Nome dell'esame
	 * @return punteggio numerico, oppure {@code} null se l'esame non esiste
	 */
	public Integer puntiEsame(String nome) {
		for (Voto v : this.voti) {
			if (v.getNome().equals(nome)) {
				return v.getPunti();
			}
		}
		return null;
		// return -1;
		// throw new newIllegalArgumentException("Corso non trovato");
	}
	
	public String toString() {		
		return this.voti.toString();		
	}

}
