class SoldierImp implements Soldier
{
	 //Intrinsic State
	private String type;
	
	public SoldierImp(String type)
	{
		this.type = type;
		System.out.println("FYI: One " + type + " soldier is created!");
	}

	//Soldier Location is Extrinsic and no reference to previous location 
	public void moveSoldier(int previousLocationX, int previousLocationY, int newLocationX, int newLocationY)
	{
		System.out.println("One " + type + " soldier moved from (" + previousLocationX + ", " + previousLocationY + ") to (" + newLocationX + ", " + newLocationY + ")" ); 	
	}
}