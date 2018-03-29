// In a game, there are two kinds of soldier: blue soldier and red soldier
// Because of heavy weight design, 5 soldier objects are created.
// after flyweight implementation, only 2 soldier objects should be created

public class FlyweightDemo
{
	public static void main(String[] args)
	{
		SoldierClient warSoldiers [] ={
					new SoldierClient("red"),
					new SoldierClient("blue"),
					new SoldierClient("red"),
					new SoldierClient("blue"),
					new SoldierClient("red")	};
			
			warSoldiers[4].moveSoldier(17, 2112);
			warSoldiers[1].moveSoldier(137, 112);
			warSoldiers[4].moveSoldier(1, 11);
	}
}
