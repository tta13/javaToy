package toyJava.javaToy;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomaTest {

	@Test
	public void testSoma(){
		Soma soma = new Soma();
		soma.setNumeroUm(6);
		assertEquals("error in Soma", 6, soma.getSoma());
	}
}
