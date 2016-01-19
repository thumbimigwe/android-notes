
public class soldier {
	private int lives;
	private int hitPoints;
	private int remainigHitpoint;
	
	public soldier(int newLilives,int newHitpoints){
		this.lives=newlives;
		this.hitPoints=newHitPoints;
		this.remainingHitpoint=newHitPoints;
	}
	public void setHitPoints (int hit){
		this.hitPoints=hit;
	}
	public int getHitPoints(){
		return this.hitPoints;
	}
	public void setLives (int life);{
		this.lives=life;
	}
	public int getLives(){
		return this.lives;
	}
	public int getremainingHitpoint(){
		return this.getremainingHitpoint;
	}
	public void setremainingHitpoint(int rPoints){
		this.remainigHitpoint=rPoints;
	}
	public void takeDamage(int damage){
		this.remainigHitpoint=getHitPoints()-damage;
	}
}
