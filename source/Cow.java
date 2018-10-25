class Cow implements Animal 
{     
	private String myType;
	private String mySound;
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
