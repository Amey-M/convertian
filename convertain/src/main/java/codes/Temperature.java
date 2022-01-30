package codes;

public class Temperature {
	public double toC(double v, String key) {
		if (key.equals("k")) {
			return (v - 273.15);
		} else if (key.equals("f")) {
			return ((v - 32) * 0.555);
		}
		return v;
	}

	public double toK(double v, String key) {
		if (key.equals("c")) {
			return v + 273.15;
		} else if (key.equals("f")) {
			return ((v - 32) * (0.555) + 273.15);
		}
		return v;
	}

	public double toF(double v, String key) {
		if (key.equals("k")) {
			return ((v - 273.15) * (1.8) + 32);
		} else if (key.equals("c")) {
			return ((v * 1.8) + 32);
		}
		return v;
	}
}
