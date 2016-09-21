package toyJava.javaToy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomaTest {
	Soma soma = new Soma();

	@Test
	public void testSomaUmParalelizando() {
		soma.setNumeroUm(6);
		System.out.println("Esse foi primeiro");
		assertEquals("error in Soma", 6, soma.getSoma());
	}
	
	@Test
	public void testSomaDoinParalelizando() {
		soma.setNumeroUm(7);
		System.out.println("Esse foi segundo");
		assertEquals("error in Soma", 7, soma.getSoma());
	}
	
	@Test
	public void testSomTresParalelizando() {
		soma.setNumeroUm(8);
		System.out.println("Esse foi terceiro");
		assertEquals("error in Soma", 8, soma.getSoma());
	}

}
