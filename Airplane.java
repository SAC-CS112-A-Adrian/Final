
public class Airplane extends FlyingObject {

	public Airplane(int airSpeedMPH, int elevationPerMinute, int distance) {
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