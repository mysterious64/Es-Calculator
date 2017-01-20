

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chip chip = new Chip();
		chip.setName("Sylph Malinca");
		chip.setFrame('e', '\0');
		chip.setMult(85);
		chip.setType('w');
		System.out.println("New Chip: " + chip.getName());
		System.out.println(chip.getName() + " has type " + chip.getType());
		System.out.println(chip.getName() + " has magnitude " + chip.getMult());
		
		

	}

}
