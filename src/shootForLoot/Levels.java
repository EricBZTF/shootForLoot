package shootForLoot;

import processing.core.PApplet;


public class Levels extends PApplet {
	
	private float yPos1 = 500;
	private float  xPos1 = 300;
	public void levelOne(PApplet window) {
		window.rectMode(CENTER);
		window.fill(128, 128, 128);
		window.rect(300, 635, 600, 30);
		window.rect(xPos1, yPos1, 300, 30);
	}
	
	public float getYPos() {
		return yPos1;
	}
	
	public float getXPos() {
		return xPos1;
	}
	
}
