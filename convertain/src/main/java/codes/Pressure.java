package codes;

public class Pressure {
	public double toPsi(double v, String key) {
		if (key.equals("pa"))
			return v / 6895.0;

		else if (key.equals("kpa"))
			return v / 6.895;

		else if (key.equals("barr"))
			return v * 14.504;

		else if (key.equals("atm"))
			return v * 14.696;

		else if (key.equals("torr"))
			return v / 51.715;

		return v;
	}

	public double toPa(double v,String key) {
		if (key.equals("psi"))
			return v * 6894.757;

		else if (key.equals("kpa"))
			return v * 1000.0;

		else if (key.equals("barr"))
			return v / 100000.0;

		else if (key.equals("atm"))
			return v * 101325.0;

		else if (key.equals("torr"))
			return v * 133.322;

		return v;
	}

	public double toKpa(double v,String key) {
		if (key.equals("psi"))
			return v * 6.895;

		else if (key.equals("pa"))
			return v / 1000.0;

		else if (key.equals("barr"))
			return v / 100.0;

		else if (key.equals("atm"))
			return v * 101.325;

		else if (key.equals("torr"))
			return v / 7.501;

		return v;
	}

	public double toBarr(double v,String key) {
		if (key.equals("psi"))
			return v / 14.504;

		else if (key.equals("pa"))
			return v / 100000.0;

		else if (key.equals("kpa"))
			return v / 100.0;

		else if (key.equals("atm"))
			return v * 1.013;

		else if (key.equals("torr"))
			return v / 750.0;

		return v;
	}

	public double toAtm(double v,String key) {
		if (key.equals("psi"))
			return v / 14.696;

		else if (key.equals("pa"))
			return v / 101325.0;

		else if (key.equals("kpa"))
			return v / 101.0;

		else if (key.equals("barr"))
			return v / 1.013;

		else if (key.equals("torr"))
			return v / 760.0;

		return v;
	}

	public double toTorr(double v,String key) {
		if (key.equals("psi"))
			return v * 51.715;

		else if (key.equals("pa"))
			return v / 133.0;

		else if (key.equals("kpa"))
			return v * 7.501;

		else if (key.equals("barr"))
			return v;

		else if (key.equals("atm"))
			return v * 760.0;

		return v;
	}
}