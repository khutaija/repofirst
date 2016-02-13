public class Vehicle {

	private String name;
	private Vehicles type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicles getType() {
		return type;
	}

	public void setType(Vehicles type) {
		this.type = type;
	}

	public void vehicleStart() {

		System.out.println("vroom vroom ");
	}

	public void vehicleMove(String name) {
		System.out.println("The " + name + " is moving");
	}

	public void vehicleStop(String name) {
		System.out.println("The " + name + " has come to a halt");
	}
}
