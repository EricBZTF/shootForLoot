package shootForLoot;
import processing.core.PApplet;
import processing.core.PGraphics;

public abstract class Player extends PApplet{
	private int width = 20;
	private int height = 20;

	private float speed;
	private float xPos;
	private float yPos;
	
	private float velocity;
	
	private String color;
	
	private boolean isFalling = false;
	private boolean isOnGround = true;
	private boolean isJumping = false;
	
	/**
	 * @param width
	 * @param height
	 * @param speed
	 * @param xPos
	 * @param yPos
	 */
	public Player(float speed, float xPos, float yPos, String color) {
		this.speed = speed;
		this.xPos = xPos;
		this.yPos = yPos;
		this.color = color;
	}
	
	public void setup() {
		
		
	}
	
	
	public String getColor() {
		return color;
	}
	public void drawPlayer(PApplet window, String color) {
		window.rectMode(CENTER);
		if(color == "BLUE") {
			window.fill(0,0,255);
		}else {
			window.fill(255,0,0);
		}
		window.rect(xPos, yPos, 20, 20);
	}
	
	public void move(int state) {
		switch (state) {
		case 1: xPos += speed;
		break;
		case 2: xPos -= speed;
		break;
		}
	}
	
	public void jump() {
		yPos -= 3;
		xPos += velocity;
	}
	
	public void fall() {
		yPos += 3;
		xPos += velocity;
	}
	
	public float getYPos() {
		return yPos;
	}
	
	public float getXPos() {
		return xPos;
	}
	
	public void setYPos(float yPos) {
		this.yPos = yPos;
	}
	
	public void setXPos(float xPos) {
		this.xPos = xPos;
	}
	
	public void setVelocity(float velocity){
		this.velocity = velocity;
	}
	
	

	public boolean isFalling() {
		return isFalling;
	}

	public void setFalling(boolean isFalling) {
		this.isFalling = isFalling;
	}

	public boolean isOnGround() {
		return isOnGround;
	}

	public void setOnGround(boolean isOnGround) {
		this.isOnGround = isOnGround;
	}

	public boolean isJumping() {
		return isJumping;
	}

	public void setJumping(boolean isJumping) {
		this.isJumping = isJumping;
	}
	
	
	
	
}
