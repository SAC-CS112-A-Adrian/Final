
public class Missile extends FlyingObject {

	public Missile(int airSpeedMPH, int elevationPerMinute, int distance) {
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