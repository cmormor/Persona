package ees.iessoterohernandez.daw.endes.Persona;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {

	private static Persona p;

	@BeforeEach
	public void init() {
		p = new Persona("Persona1", 24, 'H', 75, 1.75);
	}

	@Test
	public void calcularIMC() {

		assertEquals(p.PESO_IDEAL, p.calcularIMC());

		p.setPeso(95);
		assertEquals(p.SOBREPESO, p.calcularIMC());

		p.setPeso(45);
		assertEquals(p.INFRAPESO, p.calcularIMC());

	}

	@Test
	public void esMayorDeEdad() {

		assertEquals(p.esMayorDeEdad(), true);

	}

	@Test
	public void esMenorDeEdad() {

		p.setEdad(15);
		assertEquals(p.esMayorDeEdad(), false);

	}

	@AfterEach
	public void finish() {
		p = null;
	}
}
