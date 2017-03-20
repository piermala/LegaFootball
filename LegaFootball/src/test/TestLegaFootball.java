package test;

import static org.junit.Assert.*;

import java.util.List;

import eccezioni.SquadraEsiste;
import eccezioni.SquadraNonValida;
import gestione.GestioneCampionato;
import model.Campionato;
import model.Squadra;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestLegaFootball {
	
	private static Campionato c;
	private static GestioneCampionato g;
	
	@BeforeClass
	public static void setUpBeforeClass(){
		c = new Campionato();
		g = new GestioneCampionato();
	}

	
	/// testo se l'istanza della classe Campionato sia diversa da 'null'
	
	@Test
	public void testPrimaIstanza() {
		assertNotNull(c);
	}
	
	
	/// testo se l'istanza della classe GestioneCampionato sia diversa da 'null'
	
	@Test
	public void testSecondaIstanza() {
		assertNotNull(g);
	}
	
	
	
	/// qui creo le squadre, le aggiungo alla lista delle squadre e testo se i dati inseriti per ogni squadra sono validi
	
	@Test
	public void testCreazioneSquadra() throws SquadraEsiste, SquadraNonValida{
		
		Squadra s1 = new Squadra("Arsenal", 87, 26, 9, 3, 79, 36, 43);
		Squadra s2 = new Squadra("Liverpool", 80, 24, 8, 6, 67, 30, 36);
		Squadra s3 = new Squadra("Manchester United", 77, 24, 5, 9, 87, 45, 42);
		
		c.addSquadra(s1);
		c.addSquadra(s2);
		c.addSquadra(s3);
		
		assertTrue(s1.isValid());
		assertTrue(s2.isValid());
		assertTrue(s3.isValid());
		
	}
	
	
	
	/// qui testo se le squadre sono state inserite nella lista, ed in tal caso le dimensioni della stessa devono essere uguali al numero da noi indicato
	
	@Test
	public void testListaSquadre() throws SquadraEsiste{
		
		c.addSquadra(new Squadra("Newcastle", 71, 21, 8, 9, 74, 52, 22));
		c.addSquadra(new Squadra("Leeds", 66, 18, 12, 8, 53, 37, 16));
		
		List<Squadra> squadre = c.getSquadre();
		
		assertEquals(squadre.size(), 2);
	}
	

}
