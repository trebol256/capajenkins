package org.gradle;
import org.junit.Test;
import static org.junit.Assert.*;
public class SumaTest {
	@Test
	public void SumarTest(){
		Suma suma = new Suma();
		assertEquals((Integer)10, suma.sumar(8, 2));
	}

}
