package shootForLoot;
import processing.core.PApplet;
import processing.core.PGraphics;



/**
 * Child of Player
 * @author ericf
 *
 */
public class Red extends Player{
	
	
	/**
	 * Constructor for Red
	 * @param speed
	 * @param xPos
	 * @param yPos
	 */
	public Red(float speed, float xPos, float yPos, String color) {
		super(speed, xPos, yPos, color);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	
	public String getColor() {
		return color;
	}
}
