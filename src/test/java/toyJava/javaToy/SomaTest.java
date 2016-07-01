package toyJava.javaToy;

import org.junit.Test;

import junit.framework.TestCase;

public class SomaTest extends TestCase {
	@Test
	public void testSoma() {
		Soma soma = new Soma();
		soma.setNumeroUm(5);
		soma.setNumeroDois(7);
		assertEquals("error in Soma", 12, soma.getSoma());
	}
}
