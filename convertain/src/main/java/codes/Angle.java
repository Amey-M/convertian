package codes;

public class Angle {
	public double toDegree(double v, String key) {
		if (key.equals("rad")) {
			return v * 57.29;
		}
		if (key.equals("rev")) {
			return v * 360.0;
		}
		return v;

	}

	public double toRadian(double v, String key) {
		if (key.equals("deg")) {
			return v * 0.0174533;
		}
		if (key.equals("rev")) {
			return v * 6.28319;
		}
		return v;
	}

	public double toRev(double v, String key) {
		if (key.equals("deg")) {
			return v * 0.00277778;
		}
		if (key.equals("rad")) {
			return v * 0.159155;
		}
		return v;
	}

}