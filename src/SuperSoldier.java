
public class SuperSoldier extends soldier{

	public SuperSoldier(int newLives, int newHitPoints) {
		super (newLives,newHitPoints);
	}
	
	public void takeDamage(int damage){
		super.setremainingHitpoint(super.getremainingHitpoint()-(damage/2));
	}
	
	public boolean checkHitpoints(){
		if(getHitpoints()<1500){
			return false;
		}
		else{
			return true;
		}
	}

}
