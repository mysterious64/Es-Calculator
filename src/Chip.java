
public class Chip {
	
	private String name;
	private char[] frames = new char[2];
	private double multiplier;
	private char type; //p = Photon Arts or Techniques, C = Character, w = weaponoid, e = enemy, i = intensifier/booster
	private char element; // f = fire, i = ice, e = lightning(electric), w = wind, l = light, d = dark
	private int[] elemount = new int[6];
	
	public Chip()
	{
		name = "";
		frames[0] = '\0';
		frames[1] = '\0';
		multiplier = 0;
		type = '\0';
		element = '\0';
	}
	/*
	public Chip (String n, char f, double m, char t, char e)
	{
		name = n;
		frames[0] = f;
		frames[1] = '\0';
		multiplier = m;
		type = t;
		element = e;
	} 
	*/

	public Chip (String n, char f1, char f2, double m, char t, char e)
	{
		name = n;
		frames[0] = f1;
		frames[1] = f2;
		multiplier = m;
		type = t;
		element = e;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setFrame (char f1, char f2)
	{
		frames[0] = f1;
		frames[1] = f2;
	}
	
	public void setMult (double m)
	{
		multiplier = m;
	}
	
	public void setType (char t)
	{
		type = t;
	}
	
	public void setElement (char e)
	{
		element = e;
	}
	
	public String getName()
	{
		return name;
	}
	
	public char[] getFrame()
	{
		return frames;
	}
	
	public double getMult()
	{
		return multiplier;
	}
	
	public char getType()
	{
		return type;
	}
	
	public char getElement()
	{
		return element;
	}
	
	

}
