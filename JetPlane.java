
public class JetPlane extends FlyingObject {

	public JetPlane(int airSpeedMPH, int elevationPerMinute, int distance) {
		super(airSpeedMPH, elevationPerMinute, distance);
	}

	@Override
	public void fly(int num) {

		setAirSpeedMPH(num);

		getAirSpeedMPH();
		getAltimeter();
		getDistance();
	}


}