/**
 * This object provides all soldier services and is used in the game 
 */
class SoldierClient
{
	private Soldier soldier;
	private int currentLocationX;
	private int currentLocationY;
	
	public SoldierClient(String type)
	{
		soldier = SoldierFactory.getSoldier(type);
		currentLocationX = 0;
		currentLocationY=0;
	}
	
	public void moveSoldier(int newLocationX, int newLocationY)
	{
		soldier.moveSoldier(currentLocationX, currentLocationY, newLocationX, newLocationY);
		
		currentLocationX = newLocationX;
		currentLocationY = newLocationY;
	}
}