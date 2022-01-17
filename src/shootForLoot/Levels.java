package shootForLoot;

import java.util.ArrayList;

import processing.core.PApplet;



public class Levels extends PApplet {


	public Levels() {
		
	
	}
	
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
		
		/**window.rect(r1.getxPos(), r1.getyPos(), r1.getWidth(), r1.getHeight());
		window.rect(r2.getxPos(), r2.getyPos(), r2.getWidth(), r2.getHeight());**/
	
}
	public void levelTwo(PApplet window,Rect r1, Rect r2, Rect r3, Rect r4, Rect r5, ColorRec cr1, Switch s1, Goal g1, ArrayList<Rect> rects) {
		r1.setxPos(300);
		r1.setyPos(635);
		r1.setWidth(600);
		r1.setHeight(30);
		
		r2.setxPos(400);
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
