package model;

import java.util.ArrayList;
import java.util.List;

import eccezioni.SquadraEsiste;

public class Campionato {

	private String nome;
	private List<Squadra> squadre = new ArrayList<>();

	
	
	/// GETTERS AND SETTERS
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Squadra> getSquadre() {
		return squadre;
	}
	
	
	
	/// METODO ADD
	
	public void addSquadra(Squadra s) throws SquadraEsiste {
		
		for (Squadra sq : squadre){			
			if (s.getNome() == sq.getNome()){
				throw new SquadraEsiste("La squadra già esiste!");
			}			
		}
		
		squadre.add(s);
		
	}
	
	
	/// COSTRUTTORI
	public Campionato(String nome) {
		
		this.nome = nome;
		
	}
	
	public Campionato(){}

	
	
}
