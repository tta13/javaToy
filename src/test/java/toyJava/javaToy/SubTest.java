package toyJava.javaToy;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubTest {
	
	@Test
	public void testaSubtracao(){
		Subtracao sub = new Subtracao();
		assertEquals(0, sub.getSubtracao());
	}
}
