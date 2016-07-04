package toyJava.javaToy;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubTest {
	
	@Test
	public void testaSub(){
		Subtracao sub = new Subtracao();
		sub.setNumeroUm(1);
		assertEquals(1, sub.getSub());
	}
}
