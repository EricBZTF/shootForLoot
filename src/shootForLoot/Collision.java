package shootForLoot;

public class Collision {
	Rect r1;
	Player p1;
	private boolean isOnGround;
	
	public Collision(Rect r1, Player p1) {
		this.r1 = r1;
		this.p1 = p1;
	}
	
	public boolean checkForCollisionOnTop() {
		if(p1.getXPos() < r1.getxPos() + r1.getWidth()/2 && p1.getXPos() > r1.getxPos() - r1.getWidth()/2 && p1.getYPos() >= r1.getyPos() - 26 && p1.getYPos() <= r1.getyPos() + 15) {
			 isOnGround = true;	 
			 System.out.println(r1.getWidth());
		}else {
			isOnGround = false;
		}
		return isOnGround;
	}
	
	public void setIsOnGround(boolean isOnGround) {
		this.isOnGround = isOnGround;
	}
	
	public Boolean getIsOnGround() {
		return isOnGround;
	}
}
