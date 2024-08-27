package oops_Abstraction;

public class Brakes {

	public static void main(String[] args) {
		MountainBike m1 = new MountainBike();
		m1.brake();
		SportsBike s1 = new SportsBike();
		s1.brake();
		DirtBike d1 = new DirtBike();
		d1.brake();
	}
}
