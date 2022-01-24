package shootForLoot;

import java.util.ArrayList;

import processing.core.PApplet;


/**
 * Builds all the levels
 * @author ericf
 *
 */
public class Levels extends PApplet {


	public Levels() {
		
	
	}
	
	/**
	 * Building first level
	 * @param window
	 * @param r1
	 * @param r2
	 * @param r3
	 * @param r4
	 * @param r5
	 * @param cr1
	 * @param s1
	 * @param g1
	 * @param rects
	 */
	public void levelOne(PApplet window,Rect r1, Rect r2, Rect r3, Rect r4, Rect r5, ColorRec cr1, Switch s1, Goal g1, ArrayList<Rect> rects) {
		
		window.fill(255);
		window.textSize(15);
		window.text("Characters can only jump on same colored platform", 0, 15);
		window.text("Use green switch to change color of platform", 0, 30);
		r1.setxPos(300);
		r1.setyPos(635);
		r1.setWidth(600);
		r1.setHeight(30);
		
		r2.setxPos(300);
		r2.setyPos(548);
		r2.setWidth(300);
		r2.setHeight(30);
		
		r3.setxPos(500);
		r3.setyPos(419);
		r3.setWidth(200);
		r3.setHeight(30);
		
		r4.setxPos(50);
		r4.setyPos(419);
		r4.setWidth(200);
		r4.setHeight(30);
		
		r5.setxPos(500);
		r5.setyPos(170);
		r5.setWidth(300);
		r5.setHeight(30);
		
		cr1.setxPos(300);
		cr1.setyPos(299);
		cr1.setWidth(300);
		cr1.setHeight(30);
		cr1.setColor(cr1.getColor());
		
		s1.setxPos(400);
		s1.setyPos(150);
		
		g1.setxPos(500);
		g1.setyPos(135);
		
		
		
		/**window.rect(r1.getxPos(), r1.getyPos(), r1.getWidth(), r1.getHeight());
		window.rect(r2.getxPos(), r2.getyPos(), r2.getWidth(), r2.getHeight());**/
	
}
	/**
	 * Building second level
	 * @param window
	 * @param r1
	 * @param r2
	 * @param r3
	 * @param r4
	 * @param r5
	 * @param cr1
	 * @param s1
	 * @param g1
	 * @param rects
	 */
	public void levelTwo(PApplet window,Rect r1, Rect r2, Rect r3, Rect r4, Rect r5, ColorRec cr1, Switch s1, Goal g1, ArrayList<Rect> rects) {
		r1.setxPos(300);
		r1.setyPos(635);
		r1.setWidth(600);
		r1.setHeight(30);
		
		r2.setxPos(500);
		r2.setyPos(530);
		r2.setWidth(200);
		r2.setHeight(30);
		
		r3.setxPos(500);
		r3.setyPos(419);
		r3.setWidth(200);
		r3.setHeight(30);
		
		r4.setxPos(50);
		r4.setyPos(419);
		r4.setWidth(200);
		r4.setHeight(30);
		
		r5.setxPos(50);
		r5.setyPos(323);
		r5.setWidth(100);
		r5.setHeight(30);
		
		cr1.setxPos(250);
		cr1.setyPos(327);
		cr1.setWidth(30);
		cr1.setHeight(200);
		cr1.setColor(cr1.getColor());
		
		s1.setxPos(50);
		s1.setyPos(399);
		
		g1.setxPos(50);
		g1.setyPos(288);
	}
	
	public void levelThree(PApplet window,Rect r1, Rect r2, Rect r3, Rect r4, Rect r5, ColorRec cr1, Switch s1, Goal g1, ArrayList<Rect> rects) {
		r1.setxPos(300);
		r1.setyPos(635);
		r1.setWidth(600);
		r1.setHeight(30);
		
		r2.setxPos(300);
		r2.setyPos(500);
		r2.setWidth(300);
		r2.setHeight(30);
		
		r3.setxPos(300);
		r3.setyPos(380);
		r3.setWidth(300);
		r3.setHeight(30);
		
		r4.setxPos(300);
		r4.setyPos(260);
		r4.setWidth(300);
		r4.setHeight(30);
		
		r5.setxPos(0);
		r5.setyPos(0);
		r5.setWidth(0);
		r5.setHeight(0);
		
		cr1.setColor(cr1.getColor());
		cr1.setxPos(300);
		cr1.setyPos(140);
		cr1.setHeight(30);
		cr1.setWidth(600);
		
		s1.setxPos(300);
		s1.setyPos(615);
		
		g1.setxPos(355);
		g1.setyPos(105);
		
	}
	
	
	/**
	 * Draws the level
	 * @param window
	 * @param r1
	 * @param r2
	 * @param r3
	 * @param r4
	 * @param r5
	 * @param cr1
	 * @param s1
	 * @param g1
	 * @param rects
	 */
	public void drawLevels(PApplet window,Rect r1, Rect r2, Rect r3, Rect r4, Rect r5, ColorRec cr1, Switch s1, Goal g1, ArrayList<Rect> rects) {
		window.rectMode(CENTER);
		window.fill(128, 128, 128);
		for(Rect r : rects) {
			window.rect(r.getxPos(), r.getyPos(), r.getWidth(), r.getHeight());
		}
			
		
		if(cr1.getColor()=="BLUE") {
			window.fill(0,0,255);
		}else {
			window.fill(255,0,0);
		}
		window.rect(cr1.getxPos(), cr1.getyPos(), cr1.getWidth(), cr1.getHeight());
		
		window.fill(0,255,0);
		window.rect(s1.getxPos(), s1.getyPos(), 10, 10);
		
		window.fill(255, 255, 0);
		window.rect(g1.getxPos(), g1.getyPos(), 20, 40);
	}
	
}
