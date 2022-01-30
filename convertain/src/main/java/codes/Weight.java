package codes;

public class Weight {
	public double toMg(double v,String key) {
		if (key.equals("g"))
			return v * 1000.0;

		else if (key.equals("kg"))
			return v * 1000000.0;

		else if (key.equals("ton"))
			return v * 907184740.0;

		else if (key.equals("pd"))

			return v * 453592.37;

		else if (key.equals("quint"))
			return v * 100000000.0;

		return v;
	}

	public double toG(double v,String key) {
		if (key.equals("mg"))
			return v / 1000.0;

		else if (key.equals("kg"))
			return v * 1000.0;

		else if (key.equals("ton"))
			return v * 907184.74;

		else if (key.equals("pd"))
			return v * 453.592;

		else if (key.equals("quint"))
			return v * 100000.0;

		return v;
	}

	public double toKg(double v,String key) {
		if (key.equals("mg"))
			return v / 1000000.0;

		else if (key.equals("g"))
			return v / 1000.0;

		else if (key.equals("ton"))
			return v * 907.185;

		else if (key.equals("pd"))
			return v / 2.205;

		else if (key.equals("quint"))
			return v * 100.0;

		return v;
	}

	public double toTon(double v , String key) {
		if (key.equals("mg"))
			return v / 907184740.0;

		else if (key.equals("g"))
			return v / 907185.0;

		else if (key.equals("kg"))
			return v / 1000.0;

		else if (key.equals("pd"))
			return v / 2000.0;

		else if (key.equals("quint"))
			return v / 9.072;

		return v;
	}

 public double toPd(double v , String key) {
		if (key.equals("mg"))
			return v / 453592.0;

		else if (key.equals("g"))
			return v / 454.0;

		else if (key.equals("kg"))
			return v * 2.205;

		else if (key.equals("ton"))
			return v * 2000.0;

		else if (key.equals("quint"))
			return v * 220.462;

		return v;
	}

	public double toQunit(double v , String key) {
		if (key.equals("mg"))
			return v / 100000000.0;

		else if (key.equals("g"))
			return v / 100000.0;

		else if (key.equals("kg"))
			return v / 100.0;

		else if (key.equals("ton"))
			return v * 9.07185;

		else if (key.equals("pd"))
			return v / 220.0;

		return v;
	}
}