class Chick implements Animal
{
	private String myType;
	private String mySound;
	private String grownUp;
	private String childish;
	public Chick(String type, String sound)
	{
		myType = type;
		mySound = sound;
	}
	public Chick(String type)
	{
		myType = type;
		grownUp = "cluck";
		childish = "cheep";
		double feeling = Math.random();
		if (feeling < .5)
			mySound = grownUp;
		else 
			mySound = childish;
	}
	public Chick()
	{
		myType = "unknown";
		mySound = "unknown";
	}
	public String getType() {return myType;}
	public String getSound() {return mySound;}
}
