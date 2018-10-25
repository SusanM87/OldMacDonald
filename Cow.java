class Cow implements Animal 
{     
	protected String myType;
	protected String mySound;
	public Cow(String type, String sound)
	{
		myType = type;
		mySound = sound;
	}
	public Cow()
	{
		myType = "unknown";
		mySound = "unknown";
	}
	public String getType() {return myType;}
	public String getSound() {return mySound;}
}

class namedCow extends Cow
{
	private String myName;
	public namedCow(String type, String name, String sound)
	{
		myName = name;
		myType = type;
		mySound = sound;
	}
	public String getName()
	{
		return myName;
	}
}