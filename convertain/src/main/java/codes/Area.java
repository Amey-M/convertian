package codes;

public class Area {
	public double toMm2(double v, String key) {
		if (key.equals("cm2")) {
			return v / 10000;
		} else if (key.equals("km2")) {
			return v * 1000000;
		} else if (key.equals("acre")) {
			return v * 4047;
		} else if (key.equals("hect")) {
			return v * 10000;
		}
		return v;
	}

	public double toCm2(double v, String key) {
		if (key.equals("mm2")) {
			return v * 10000;
		} else if (key.equals("km2")) {
			return v * 10000000000.0;
		} else if (key.equals("acre")) {
			return v * 4.047 * 10000000;
		} else if (key.equals("hect")) {
			return v * 100000000;
		}
		return v;
	}

	public double toKm2(double v, String key) {
		if (key.equals("mm2")) {
			return v / 1000000;
		} else if (key.equals("cm2")) {
			return v / 10000000000.0;
		} else if (key.equals("acre")) {
			return v / 247;
		} else if (key.equals("hect")) {
			return v / 100;
		}
		return v;
	}

	public double toAcre(double v, String key) {
		if (key.equals("mm2")) {
			return v / 4047;
		} else if (key.equals("cm2")) {
			return v / (4.047 * 10000000);
		} else if (key.equals("km2")) {
			return v * 247;
		} else if (key.equals("hect")) {
			return v * 2.471;
		}
		return v;
	}

	public double toHect(double v, String key) {
		if (key.equals("mm2")) {
			return v / 10000;
		} else if (key.equals("cm2")) {
			return v / 100000000;
		} else if (key.equals("km2")) {
			return v * 100;
		} else if (key.equals("acre")) {
			return v / 2.471;
		}
		return v;
	}

}