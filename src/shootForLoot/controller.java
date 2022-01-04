package shootForLoot;
import processing.core.PApplet;
import processing.core.PGraphics;

public class controller extends PApplet{
	 Red p1;
	 
	 public static void main(String[] args) {
	        PApplet.main("shootForLoot.controller"); 
	    }
	 
	 public void settings() {
		 size(900, 500);
		 p1 = new Red(5, 100, 100);
	 }
	 
	 
	 public void draw() {
		
		 p1.drawPlayer(this);
	 }
	 
	 public void keyPressed() {
		 if(key == 'd') {
			 p1.move();
			 p1.drawPlayer(this);
			 
		 }
	 }
}
