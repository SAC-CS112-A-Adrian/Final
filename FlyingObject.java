
public class FlyingObject {
	
	private int airSpeedMPH = 0;
	private int elevationPerMinute = 0;
	private int distance = 0;
	
	public FlyingObject(int airSpeedMPH, int elevationPerMinute, int distance) {
		this.airSpeedMPH = airSpeedMPH;
		this.elevationPerMinute = elevationPerMinute;
		this.distance = distance;
	}
	
	public void setAirSpeedMPH(int speed) {
		airSpeedMPH = speed;
	}

	public int getAirSpeedMPH() {
		return airSpeedMPH;
	}
	
	public void setAltimeter(int elevation) {
		elevationPerMinute = elevation;
	}

	public int getAltimeter() {
		return elevationPerMinute * 2;
	}
	
	public void setDistance(int dis) {
		distance = dis;
	}

	public int getDistance() {
		return airSpeedMPH;
	}
	
	public void fly(int num) {
		setAirSpeedMPH(num);

		airSpeedMPH = getAirSpeedMPH();
		elevationPerMinute = getAltimeter();
		distance = getDistance();
	}
	
	public String toString() {
		return String.format(
				"Air Speed: %d MPH | Elevation: %d FPM | Distance: %d Miles",
				airSpeedMPH, elevationPerMinute, distance);
	}

}
