package shootForLoot;

/**
 * Class to set dimensions and position of platforms
 * @author ericf
 *
 */
public class Rect {
	private float xPos;
	private float yPos;
	private float width; 
	private float height;
	

	public void setxPos(float xPos) {
		this.xPos = xPos;
	}


	public void setyPos(float yPos) {
		this.yPos = yPos;
	}


	public void setWidth(float width) {
		this.width = width;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public float getxPos() {
		return xPos;
	}
	public float getyPos() {
		return yPos;
	}
	public float getWidth() {
		return width;
	}
	public float getHeight() {
		return height;
	}	
	
	
}
