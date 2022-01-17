package shootForLoot;

import processing.core.PApplet;

/**
 * Collisiondetections for all the platforms
 * @author ericf
 *
 */
public class Collision extends PApplet {
	Player p1;
	private boolean isOnGround;
	Integer i = 0;
	
	public Collision(Player p1) {
		this.p1 = p1;
	}
	
	/**
	 * Detects if Player hits top of platform 
	 * @param r1
	 * @return
	 */
	public boolean checkForCollisionOnTop(Rect r1) {
		if(p1.getXPos() <= r1.getxPos() + r1.getWidth()/2 && p1.getXPos() >= r1.getxPos() - r1.getWidth()/2 && p1.getYPos() + 10 == r1.getyPos() - 15) {
			 isOnGround = true;	 
		}else {
			isOnGround = false;
		}
		return isOnGround;
	}
	
	/**
	 * Checks if Player collides with bottom of platform
	 * @param r1
	 * @return
	 */
	public boolean checkForCollisionOnBottom(Rect r1) {
		if(p1.getXPos() + 10 >= r1.getxPos() - r1.getWidth()/2 && p1.getXPos()-10 <= r1.getxPos()+ r1.getWidth()/2 && p1.getYPos() == r1.getyPos()+14) {
			 System.out.println(r1.getWidth());
			return true;
		}else {
			return false;
		}
	}
	
	public void checkForCollisionOnSide(Rect r1) {
		if(p1.getYPos() + 10 > r1.getyPos() - 15 && p1.getYPos() - 10 < r1.getyPos() +15) {
			if(p1.getXPos() + 10 >= r1.getxPos() - r1.getWidth()/2 && p1.getXPos() < r1.getxPos() -r1.getWidth()/2) {
				p1.setXPos(p1.getXPos()-2);
			}else if(p1.getXPos() - 10 <= r1.getxPos() + r1.getWidth()/2 && p1.getXPos() > r1.getxPos() + r1.getWidth()/2) {
				p1.setXPos(p1.getXPos()+2);
			}
		}
			
	}
	
	public boolean checkForRightColor(ColorRec cr1) {
		
		if(cr1.getColor() == p1.getColor()) {
			
			return true;
		}else {
			System.out.println("wrong color");
			return false;
		}
	};
	
	
	public boolean isOnSwitch(Switch s1) {
		if(dist(p1.getXPos(), p1.getYPos(), s1.getxPos(), s1.getyPos()) <=20) {
			return true;
		}else {
			return false;
		}
	}
	
	public void setIsOnGround(boolean isOnGround) {
		this.isOnGround = isOnGround;
	}
	
	public Boolean getIsOnGround() {
		return isOnGround;
	}
	
	
}
