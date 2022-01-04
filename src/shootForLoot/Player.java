package shootForLoot;
import processing.core.PApplet;
import processing.core.PGraphics;

public abstract class Player extends PApplet{
	private int width = 20;
	private int height = 20;
	private enum color{BLUE, RED};
	private float speed;
	private float xPos;
	private float yPos;
	PGraphics pg;
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
	
	public void setup() {
		pg = createGraphics(50, 50);
		pg.beginDraw();
		pg.stroke(255);
		pg.fill(140, 56, 12);
		pg.rect(xPos, yPos, 50, 50);
		pg.endDraw();
		System.out.println("h");
	}
	
	
	public void drawPlayer(PApplet window) {
		window.image(pg, 50, 40);
	}
	
	public void move() {	
		xPos += 20;
	}
	
	
}
