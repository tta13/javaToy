package toyJava.javaToy;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Test;

public class SomaTest {
	Soma soma = new Soma();
	Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    
	@Test
	public void testSomaUmParalelizando() {
		soma.setNumeroUm(6);
		System.out.println("Esse foi primeiro "+sdf.format(cal.getTime()));
		assertEquals("error in Soma", 6, soma.getSoma());
	}
	
	@Test
	public void testSomaDoinParalelizando() {
		soma.setNumeroUm(7);
		System.out.println("Esse foi segundo "+sdf.format(cal.getTime()));
		assertEquals("error in Soma", 7, soma.getSoma());
	}
	
	@Test
	public void testSomTresParalelizando() {
		soma.setNumeroUm(8);
		System.out.println("Esse foi terceiro "+sdf.format(cal.getTime()));
		assertEquals("error in Soma", 8, soma.getSoma());
	}

}
