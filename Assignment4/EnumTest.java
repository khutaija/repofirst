/**
*Use enum to represent the type of vehicles, like Bus, Motorcycle, Sedan, SUV, Truck...
	 */

/**
 * Define a vehicle class. Use suitable encapsulation. Use the enum you defined
 * to represent the types. There is no standard answer for this question, but
 * you need create necessary attributes for this class, and methods if needed.
 */
public class EnumTest {

	public static void main(String[] args) {

		Vehicle vehicle1 = new Vehicle();
		vehicle1.setName("Ducati");
		vehicle1.setType(Vehicles.Motorcycle);

		Vehicle vehicle2 = new Vehicle();
		vehicle2.setName("Hummer");
		vehicle2.setType(Vehicles.SUV);

		Vehicle vehicle3 = new Vehicle();
		vehicle3.setName("Civic");
		vehicle3.setType(Vehicles.Sedan);

		Vehicle vehicle4 = new Vehicle();
		vehicle4.setName("SoundTransit");
		vehicle4.setType(Vehicles.Bus);

		System.out.println("This is a " + vehicle1.getName());
		System.out.println("Type of vehicle : " + vehicle1.getType());
		vehicle1.vehicleStart();
		vehicle1.vehicleMove(vehicle1.getName());
		vehicle1.vehicleStop(vehicle1.getName());

		System.out.println("This is a " + vehicle2.getName());
		System.out.println("Type of vehicle : " + vehicle2.getType());
		vehicle2.vehicleStart();
		vehicle2.vehicleMove(vehicle2.getName());
		vehicle2.vehicleStop(vehicle2.getName());
	}

}
