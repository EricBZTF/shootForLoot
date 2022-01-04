package shootForLoot;
import processing.core.PApplet;

public abstract class Player extends PApplet{
	private int width = 20;
	private int height = 20;
	private enum color{BLUE, RED};
	private float speed;
	private float xPos;
	private float yPos;
	/**
	 * @param width
	 * @param height
	 * @param speed
	 * @param xPos
	 * @param yPos
	 */
	public Player(float speed, float xPos, float yPos) {
		this.speed = speed;
		this.xPos = xPos;
		this.yPos = yPos;
		
	}
	
	public void drawPlayer(PApplet window) {
		
		window.fill(130,130,130);
		window.rect(width, height, xPos, yPos);	
		
	}
	
	public void move() {	
		xPos += 20;
	}
	
	
}
