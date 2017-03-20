package model;

import eccezioni.SquadraNonValida;

public class Squadra {

	private String nome;
	private int punti;
	private int partiteVinte;
	private int partitePareggiate;
	private int partitePerse;
	private int goalFatti;
	private int goalSubiti;
	private int differenzaReti;	
	
	
	
	/// COSTRUTTORI	
	
	public Squadra(String nome, int punti, int partiteVinte,
			int partitePareggiate, int partitePerse, int goalFatti,
			int goalSubiti, int differenzaReti) {
		super();
		this.nome = nome;
		this.punti = punti;
		this.partiteVinte = partiteVinte;
		this.partitePareggiate = partitePareggiate;
		this.partitePerse = partitePerse;
		this.goalFatti = goalFatti;
		this.goalSubiti = goalSubiti;
		this.differenzaReti = differenzaReti;
	}

	public Squadra(){}
	
	
	
	/// GETTERS AND SETTERS
	
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
	public int getPartiteVinte() {
		return partiteVinte;
	}
	public void setPartiteVinte(int partiteVinte) {
		this.partiteVinte = partiteVinte;
	}
	public int getPartitePareggiate() {
		return partitePareggiate;
	}
	public void setPartitePareggiate(int partitePareggiate) {
		this.partitePareggiate = partitePareggiate;
	}
	public int getPartitePerse() {
		return partitePerse;
	}
	public void setPartitePerse(int partitePerse) {
		this.partitePerse = partitePerse;
	}
	public int getGoalFatti() {
		return goalFatti;
	}
	public void setGoalFatti(int goalFatti) {
		this.goalFatti = goalFatti;
	}
	public int getGoalSubiti() {
		return goalSubiti;
	}
	public void setGoalSubiti(int goalSubiti) {
		this.goalSubiti = goalSubiti;
	}
	public int getDifferenzaReti() {
		this.differenzaReti = this.goalFatti - this.goalSubiti;
		return differenzaReti;
	}
	

	
	/// METODO TO STRING
	
	@Override
	public String toString() {
		return "Squadra " + nome + ", Goal Fatti = " + goalFatti
				+ ", Goal Subiti = " + goalSubiti + ", Differenza Reti = "
				+ differenzaReti;
	}
	
	
	/// ALTRI METODI
	
	public boolean isValid() throws SquadraNonValida{
		
		if (this.nome.length() > 0 && 
			this.nome != null &&
			this.punti > -1 && 
			this.goalFatti > -1 && 
			this.goalSubiti > -1 && 
			this.partiteVinte > -1 && 
			this.partitePareggiate > -1 && 
			this.partitePerse > -1){
			
			return true;
			
		}
		
		throw new SquadraNonValida("I dati della squadra inserita non sono validi!");
		
	}
	
	
}
