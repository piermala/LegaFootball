package gestione;

import java.util.Collections;
import java.util.List;

import comparator.Classifica;
import comparator.SquadreComparator;
import eccezioni.SquadraEsiste;
import model.Campionato;
import model.Squadra;

public class GestioneCampionato {

	public void aggiungiSquadre(Campionato c){
		
		try {
			c.addSquadra(new Squadra("Arsenal", 87, 26, 9, 3, 79, 36, 43));
			c.addSquadra(new Squadra("Liverpool", 80, 24, 8, 6, 67, 30, 36));
			c.addSquadra(new Squadra("Manchester United", 77, 24, 5, 9, 87, 45, 42));
			c.addSquadra(new Squadra("Newcastle", 71, 21, 8, 9, 74, 52, 22));
			c.addSquadra(new Squadra("Leeds", 66, 18, 12, 8, 53, 37, 16));
			c.addSquadra(new Squadra("Chelsea", 64, 17, 13, 8, 66, 38, 28));
			c.addSquadra(new Squadra("West Ham", 53, 15, 8, 15, 48, 57, -9));
			c.addSquadra(new Squadra("Aston Villa", 50, 12, 14, 12, 46, 47, -1));
			c.addSquadra(new Squadra("Tottenham", 50, 14, 8, 16, 49, 53, -4));
			c.addSquadra(new Squadra("Blackburn Rovers", 46, 12, 10, 16, 55, 51, 4));
			c.addSquadra(new Squadra("Southampton", 45, 12, 9, 17, 46, 54, -8));
			c.addSquadra(new Squadra("Middlesbrough", 45, 12, 9, 17, 35, 47, -12));
			c.addSquadra(new Squadra("Fulham", 44, 10, 14, 14, 36, 44, -8));
			c.addSquadra(new Squadra("Charlton", 44, 10, 14, 14, 38, 49, -11));
			c.addSquadra(new Squadra("Everton", 43, 11, 10, 17, 45, 57, -12));
			c.addSquadra(new Squadra("Bolton", 40, 9, 13, 16, 44, 62, -18));
			c.addSquadra(new Squadra("Sunderland", 40, 10, 10, 18, 29, 51, -22));
			c.addSquadra(new Squadra("Ipswich Town", 36, 9, 9, 20, 41, 64, -23));
			c.addSquadra(new Squadra("Derby County", 30, 8, 6, 24, 33, 63, -30));
			c.addSquadra(new Squadra("Leicester City", 28, 5, 13, 20, 30, 64, -34));
			
		} catch (SquadraEsiste e) {
			
			e.printStackTrace();
			
		}
	}
	
	
	public Squadra getSquadraMinDiffReti(Campionato c){
		
		List<Squadra> squadre = c.getSquadre();
		
		Collections.sort(squadre, new SquadreComparator());
		
		Squadra s = squadre.get(0);
		
		return s;
		
	}
	
	
	public List<Squadra> getClassifica(Campionato c){
		
		List<Squadra> squadre = c.getSquadre();
		
		Collections.sort(squadre, new Classifica());
		
		return squadre;
		
	}
	
}
