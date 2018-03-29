 /*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Homework 10
 */

// This is the "Flyweight" design 
public class SoldierFactory
{
	private static Soldier blueSoldier = null;	// Only one of soldier of each type will be kept
	private static Soldier redSoldier = null;
	
	public static Soldier getSoldier(String type)
	{
		if (type == "red")
			if (redSoldier == null) // if redSoldier does not exist create it and return it
			{
				redSoldier = new SoldierImp("red");
				return redSoldier;
			}
			else
				return redSoldier;	// if redSoldier already exists, return instance
		else if (type == "blue")
		{
			if (blueSoldier == null) // if blueSoldier does not exist create it and return it
			{
				blueSoldier = new SoldierImp("blue");
				return blueSoldier;	
			}
			else
				return blueSoldier; // if blueSoldier already exists, return instance
		}
		else	// notify user of error if they attempt to create soldier of type other than blue or red
			System.out.println("Error: Soldiers can only be 'red' or 'blue'");
			return null;
		
	}
}