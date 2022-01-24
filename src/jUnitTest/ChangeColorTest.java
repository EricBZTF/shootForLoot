package jUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import shootForLoot.*;

class ChangeColorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void changeColor() {
		ColorRec cr1 = new ColorRec();
		cr1.setColor("BLUE");
		assertEquals("BLUE", cr1.getColor(), "Checks if color got set correctly");
	}

}
