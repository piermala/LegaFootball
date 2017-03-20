package comparator;

import java.util.Comparator;

import model.Squadra;

public class SquadreComparator implements Comparator<Squadra>{

	@Override
	public int compare(Squadra s1, Squadra s2) {
		
		int differenzaReti = s1.getDifferenzaReti() - s2.getDifferenzaReti();
		
		return differenzaReti;
	}

}
