package jUnitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import shootForLoot.*;

/**
 * Test all of the movement options
 * @author ericf
 *
 */
class MovementTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testJump() {
		Red p1 = new Red(20, 20, 10, "RED");
		float currY = p1.getYPos();
		p1.jump();
		assertEquals("Checks if befor and after jumppositions are correct", currY - 3, p1.getYPos(), 0);
	}
	
	@Test
	void testWalkRight() {
		Red p1 = new Red(20, 20, 10, "RED");
		float currX = p1.getXPos();
		p1.move(1);
		assertEquals("Checks if Movement updates position correct", currX + 20, p1.getXPos(), 0);
	}
	
	@Test
	void testWalkLeft() {
		Red p1 = new Red(20, 20, 10, "RED");
		float currX = p1.getXPos();
		p1.move(0);
		assertEquals("Checks if Movement updates position correct", currX - 20, p1.getXPos(), 0);
	}
	

}
