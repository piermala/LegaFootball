package test;

import java.util.List;

import model.Campionato;
import model.Squadra;
import gestione.GestioneCampionato;

public class MainLegaFootball {

	public static void main(String[] args) {
		
		GestioneCampionato g = new GestioneCampionato();
		Campionato c = new Campionato("Premier League");
		
		g.aggiungiSquadre(c);
		
		System.out.println(c.getSquadre() + "\n");
		
		
		List<Squadra> squadre = g.getClassifica(c);
		System.out.println(squadre + "\n");
		
		

	}

}
