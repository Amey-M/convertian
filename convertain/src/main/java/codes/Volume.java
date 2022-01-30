package codes;

public class Volume {
	public double toMl(double v, String key) {
		if (key.equals("l")) {
			return v * 1000;
		} else if (key.equals("kl")) {
			return v * 1000000;
		} else if (key.equals("gal")) {
			return v * 3785.41;
		} else if (key.equals("cc")) {
			return v;
		} else if (key.equals("m3")) {
			return v * 1000000;
		}
		return v;
	}

	public double toL(double v, String key) {
		if (key.equals("ml")) {
			return v / 1000;
		} else if (key.equals("kl")) {
			return v * 1000;
		} else if (key.equals("gal")) {
			return v * 3.785;
		} else if (key.equals("cc")) {
			return v / 1000;
		} else if (key.equals("m3")) {
			return v * 1000;
		}
		return v;
	}

	public double toKl(double v, String key) {
		if (key.equals("ml")) {
			return v / 1000000;
		} else if (key.equals("l")) {
			return v / 1000;
		} else if (key.equals("gal")) {
			return v / 264;
		} else if (key.equals("cc")) {
			return v / 1000000;
		} else if (key.equals("m3")) {
			return v;
		}
		return v;
	}

	public double toGal(double v, String key) {
		if (key.equals("ml")) {
			return v / 3785;
		} else if (key.equals("l")) {
			return v / 3.785;
		} else if (key.equals("kl")) {
			return v * 264;
		} else if (key.equals("cc")) {
			return v / 3785;
		} else if (key.equals("m3")) {
			return v * 264;
		}
		return v;
	}

	public double toCc(double v, String key) {
		if (key.equals("ml")) {
			return v;
		} else if (key.equals("l")) {
			return v / 1000;
		} else if (key.equals("kl")) {
			return v * 1000000;
		} else if (key.equals("gal")) {
			return v * 3785;
		} else if (key.equals("m3")) {
			return v / 264;
		}
		return v;
	}

	public double toM3(double v, String key) {
		if (key.equals("ml")) {
			return v / 1000000;
		} else if (key.equals("l")) {
			return v / 1000;
		} else if (key.equals("kl")) {
			return v;
		} else if (key.equals("gal")) {
			return v / 264;
		} else if (key.equals("cc")) {
			return v / 1000000;
		}
		return v;
	}
}

