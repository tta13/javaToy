package toyJava.javaToy;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubTest {
	
	@Test
	public void testaSub(){
		Subtracao sub = new Subtracao();
		assertEquals(1, sub.getSub());
	}
}
