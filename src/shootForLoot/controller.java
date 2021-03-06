package shootForLoot;
import processing.core.PApplet;
import java.util.ArrayList;
import processing.core.PGraphics;

public class Controller extends PApplet{
	 
	 Levels l1;
	 float currY;
	 
	 int currLevel = 1;
	 
	 Rect r1;
	 Rect r2;
	 Rect r3;
	 Rect r4; 
	 Rect r5;
	 
	 ArrayList<Rect> rects;
	 
	 float yOnSwitch;
	 float xOnSwitch;
	 
	 Switch s1;
	 Goal g;
	 	 
	
	 
	 ColorRec cr1;
	 ArrayList<ColorRec> colorRects;
	 
	 Red p1;
	 Blue p2;
	 int currPlayer = 0;
	 ArrayList<Player> players;
	 
	 Collision c1;
	 Collision c2;
	 ArrayList<Collision> collisions;
	 
	 int rectsOriginalSize;
	 
	 enum SpielZustand{
		 Start, Spiel, Ende;
	 }
	 
	 SpielZustand state = SpielZustand.Start;
	 
	 /**
	  * Main to start the programm
	  * @param args
	  */
	 public static void main(String[] args) {
	        PApplet.main("shootForLoot.Controller"); 
	    }
	 
	 /**
	  * Displays Screen and initialzes all needed objects
	  */
	 public void settings() {
		 size(600, 650);
		 
		 r1 = new Rect();
		 r2 = new Rect();
		 r3 = new Rect();
		 r4 = new Rect();
		 r5 = new Rect();
		 l1 = new Levels(); 
		 
		 g = new Goal();
		 
		 s1 = new Switch();
		 
		 p1 = new Red(10, 50, 610, "RED");
		 p2 = new Blue(10, 450, 610, "BLUE");
		 players = new ArrayList<>();
		 players.add(p1);
		 players.add(p2);
		 
		 c1 = new Collision(p1);
		 c2 = new Collision(p2);
		 collisions = new ArrayList<>();
		 collisions.add(c1);
		 collisions.add(c2);
		 
		 rects = new ArrayList<>();
		 rects.add(r1);
		 rects.add(r2);
		 rects.add(r3);
		 rects.add(r4);
		 rects.add(r5);
		 colorRects = new ArrayList<>();
		 cr1 = new ColorRec();
		 colorRects.add(cr1);
		 rectsOriginalSize = rects.size(); 
} 
	 
	 
	 /**
	  * drawing the levels and player
	  * calls jump if SPACEBAR is pressed
	  * calls collisiondetection
	  * displays different if state changes
	  */
	 public void draw() {
		 if(state == SpielZustand.Ende) {
			 background(0);
			 fill(255);
			 textSize(40);
			 text("Level Cleared",60, 200);
			 textSize(18);
			 text("Press n for next level", 50, 250);
			 text("Press s to get to the startscreen", 50, 270);
			 p1.setXPos(50);
			 p1.setYPos(610);
			 p2.setXPos(450);
			 p2.setYPos(610);
			 p1.setFalling(false);
			 p1.setOnGround(true);
			 p1.setJumping(false);
			 p2.setFalling(false);
			 p2.setOnGround(true);
			 p2.setJumping(false);
		 }
		 if(state == SpielZustand.Start) {
			 background(0);
			 fill(255);
			 textSize(40);
			 text("Press 's' to start the game", 60, 200);
			 textSize(18);
			 text("Move left --> a", 50, 250);
			 text("Move right --> d", 50, 270);
			 text("Jump--> SPACE", 50, 290);
			 text("Switch characters --> s", 50, 310);
			 text("Both characters need to get to the golden goal", 50, 330);
			 
		 }
		 if(state == SpielZustand.Spiel) {
			 background(0);
			 switch(currLevel) {
			 case 1:
				 l1.levelOne(this, r1, r2, r3, r4, r5, cr1, s1, g, rects);
				 break;
			 case 2:
				 l1.levelTwo(this, r1, r2, r3, r4, r5, cr1, s1, g, rects);
				 break;
			 case 3:
				 l1.levelThree(this, r1, r2, r3, r4, r5, cr1, s1, g, rects);
				 break;
			 };
			 
		 l1.drawLevels(this, r1, r2, r3, r4, r5, cr1, s1, g, rects);

		 p1.drawPlayer(this, p1.getColor());
		 p2.drawPlayer(this, p2.getColor());
		 
		 if(players.get(currPlayer).isJumping() == true) {
			 players.get(currPlayer).jump();
			 players.get(currPlayer).setOnGround(false);
		 }
		 
		 if(currY  - players.get(currPlayer).getYPos() > 150) {
			 players.get(currPlayer).setJumping(false);
		 }
		 if(players.get(currPlayer).isJumping() == false && players.get(currPlayer).isOnGround()==false) {
			 players.get(currPlayer).fall();
			 players.get(currPlayer).setFalling(true);
		 }
		 
		 		 
		 if(players.get(currPlayer).isOnGround()  == false) {
			 for(Rect r : rects) { 
				 collisions.get(currPlayer).checkForCollisionOnSide(r);	 
			 }
		 }
		 
		 for(Rect r : rects) {
			 if(collisions.get(currPlayer).checkForCollisionOnTop(r) == true) {
				 players.get(currPlayer).setJumping(false);
				 players.get(currPlayer).setOnGround(true);
				 players.get(currPlayer).setFalling(false);
				 break;
			 }else {
				 players.get(currPlayer).setOnGround(false);
			 }
		 }
		 
		 
		 for(Rect r : rects) {
			 if(collisions.get(currPlayer).checkForCollisionOnBottom(r)) {
				 players.get(currPlayer).setFalling(true);
				 players.get(currPlayer).setJumping(false);
				 players.get(currPlayer).setOnGround(false);
				 break;
			 }
		 
		 }
		 
		 if(collisions.get(players.size()-2).isOnSwitch(s1) || collisions.get(players.size()-1).isOnSwitch(s1) ) {
			 cr1.setColor("BLUE");
		 }else {
			 cr1.setColor("RED");
		 }
		 
		 
		 if(collisions.get(currPlayer).checkForRightColor(cr1)){	 	
				
					
						for(ColorRec cr : colorRects) { 
							 collisions.get(currPlayer).checkForCollisionOnSide(cr);	 
							 
						}
					 
					 
					for(ColorRec cr : colorRects) {
						 if(collisions.get(currPlayer).checkForCollisionOnTop(cr)) {
							 players.get(currPlayer).setJumping(false);
							 players.get(currPlayer).setOnGround(true);
							 players.get(currPlayer).setFalling(false);
							 break;
						 }
					 }
					 
					 
					 for(ColorRec cr : colorRects) {
						 if(collisions.get(currPlayer).checkForCollisionOnBottom(cr)) {
							 
							 players.get(currPlayer).setFalling(true);
							 players.get(currPlayer).setJumping(false);
							 players.get(currPlayer).setOnGround(false);
							 break;
						 }
					 
					 }
					 
				 }
		 
		 if(dist(players.get(currPlayer).getXPos(), players.get(currPlayer).getYPos(), g.getxPos(), g.getyPos()) < 20 && dist(xOnSwitch, yOnSwitch, g.getxPos(), g.getyPos())< 20){
			 state = SpielZustand.Ende;
		 }
		 	}
		 
	 }
	 
	 
	 /**
	  * Listens for keys and changes state 
	  */
	 
	 public void keyPressed() {
		 switch(state) {
		 case Start: keyPressedStart(); break;
		 case Spiel: keyPressedInGame(); break;
		 case Ende: keyPressedEnd(); break;
		 }
	 }
	 
	 /**
	  * Changes level if n is pressed
	  * Back to menue if s is pressed
	  */
	 public void keyPressedEnd() {
		 if(key == 'n') {
			 currLevel += 1;
			 state = SpielZustand.Spiel;
			 
		 }
		 if(key == 's') {
			 state = SpielZustand.Start;
		 }
	 }
	 
	 public void keyPressedStart() {
		 if(key == 's') {
			 state = SpielZustand.Spiel;
		 }
	 }
	 
	 /**
	  * Move if a or d are pressed
	  * Set velocity for jumps
	  * Set currY to current y coordinates to limit jump height
	  */
	 public void keyPressedInGame() {
		 if(key == 'd') {
			 players.get(currPlayer).move(1);	
			 players.get(currPlayer).setVelocity(1);
		 }else if(key == 'a') {
			 players.get(currPlayer).move(2);
			 players.get(currPlayer).setVelocity(-1);
		 }else if (key == 32 && players.get(currPlayer).isJumping() == false && players.get(currPlayer).isFalling() == false) {
			 players.get(currPlayer).setJumping(true);
			 currY = players.get(currPlayer).getYPos();
		 }else if(key == 's') {
			  xOnSwitch = players.get(currPlayer).getXPos();
			  yOnSwitch = players.get(currPlayer).getYPos();
			 if(currPlayer == 1) {
				 currPlayer = 0;
			 }else {
				 currPlayer = 1;
			 }
		 }
	 }
	 
	 /**
	  * setting velocity to 0 if left/right keys aren't pressed
	  * Velocity does not change if player is in air
	  */
	 public void keyReleased() {
		 if(players.get(currPlayer).isJumping() == false) {
		 if(key == 'd' || key == 'a') {
			 players.get(currPlayer).setVelocity(0);
		 }
		 }
	 }
}
