package toyJava.javaToy;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomaTest {

	@Test
	public void test() {
		Soma soma = new Soma();
		soma.setNumeroUm(5);
		soma.setNumeroDois(7);
		assertEquals(12, soma.getSoma());
	}

}
