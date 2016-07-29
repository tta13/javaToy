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
	
	@Test
	public void testaSubSemSet(){
		Subtracao sub = new Subtracao();
		assertEquals(0, sub.getSub());
	}
	
	@Test
	public void testaSubComSet(){
		Subtracao sub = new Subtracao();
		sub.setNumeroUm(2);
		assertEquals(2, sub.getSub());
	}
}
