
public class Chipv2 {
	private String Name; //Chip Name.
	
	private boolean[] Frame = new boolean[11]; //Conditional to see which frames exist in the chip.
	private double[] Frames = new double[11]; //Multiplier for each frame, 1 is Chase, 0 is SP.
	private double[] PerElem = new double[6]; //Multiplier Per Chip Of Each Elem.
	private double[] Elements = new double[6]; //Amount added at max LV for each element.
	
}
