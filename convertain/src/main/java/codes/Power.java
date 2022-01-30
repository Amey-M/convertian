package codes;

public class Power {
	public double toW(double v, String key) // toWatts
	{
		if (key.equals("mw")) {
			return v * 1000000.0;
		}
		if (key.equals("gw")) {
			return v * 1000000000.0;
		}
		if (key.equals("tw")) {
			return v * 1000000000000.0;
		}
		if (key.equals("hp")) {
			return v * 745.7;
		}

		return v;

	}

	public  double toMw(double v, String key) // toMegaWatts
	{
		if (key.equals("w")) {
			return v / 1000000.0;
		}
		if (key.equals("gw")) {
			return v * 1000.0;
		}
		if (key.equals("tw")) {
			return v * 1000000.0;
		}
		if (key.equals("hp")) {
			return v * 0.0007457;
		}

		return v;

	}

	public double toGw(double v, String key) // toGigaWatts
	{
		if (key.equals("w")) {
			return v / 1000000000.0;
		}
		if (key.equals("mw")) {
			return v / 1000.0;
		}
		if (key.equals("tw")) {
			return v * 1000.0;
		}
		if (key.equals("hp")) {
			return v / 1341000;
		}

		return v;
	}

	public double toTw(double v, String key) // toTeraWatts
	{
		if (key.equals("w")) {
			return v / 1000000000000.0;
		}
		if (key.equals("gw")) {
			return v / 1000.0;
		}
		if (key.equals("mw")) {
			return v / 1000000.0;
		}
		if (key.equals("hp")) {
			return v / 1341000000;
		}

		return v;
	}

	public double toHp(double v, String key) // toHorsePower
	{
		if (key.equals("w")) {
			return v * 0.00134102;
		}
		if (key.equals("gw")) {
			return v * 1341000;
		}
		if (key.equals("mw")) {
			return v * 1341.02;
		}
		if (key.equals("tw")) {
			return v / 1341000000;
		}
		return v;
	}

}