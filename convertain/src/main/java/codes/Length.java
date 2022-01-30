package codes;

public class Length {

	public double toMm(double v, String key) {
		if (key.equals("cm")) {
			return v * 10;
		} else if (key.equals("m")) {
			return v * 1000;
		} else if (key.equals("km")) {
			return v * 1000000;
		} else if (key.equals("mile")) {
			return v * 1609340;
		} else if (key.equals("yard")) {
			return v * 914.4;
		} else if (key.equals("feet")) {
			return v * 304.8;
		} else if (key == "inch") {
			return v * 25.4;
		} else if (key.equals("light")) {
			return v * 9461000000000000000.0;
		}
		return v;
	}

	public double toCm(double v, String key) {
		if (key.equals("mm")) {
			return v * 0.1;
		} else if (key.equals("m")) {
			return v * 100;
		} else if (key.equals("km")) {
			return v * 100000;
		} else if (key.equals("mile")) {
			return v * 160934;
		} else if (key.equals("yard")) {
			return v * 91.44;
		} else if (key.equals("feet")) {
			return v * 30.48;
		} else if (key == "inch") {
			return v * 2.54;
		} else if (key.equals("light")) {
			return v * 946100000000000000.0;
		}
		return v;
	}

	public double toM(double v, String key) {
		if (key.equals("mm")) {
			return v * 0.001;
		} else if (key.equals("cm")) {
			return v * 0.01;
		} else if (key.equals("km")) {
			return v * 1000;
		} else if (key.equals("mile")) {
			return v * 1609.34;
		} else if (key.equals("yard")) {
			return v * 0.9144;
		} else if (key.equals("feet")) {
			return v * 0.3048;
		} else if (key == "inch") {
			return v * 0.0254;
		} else if (key.equals("light")) {
			return v * 9461000000000000.0;
		}
		return v;
	}

	public double toKm(double v, String key) {
		if (key.equals("mm")) {
			return v * 0.000001;
		} else if (key.equals("cm")) {
			return v * 0.00001;
		} else if (key.equals("m")) {
			return v * 0.001;
		} else if (key.equals("mile")) {
			return v * 1.60934;
		} else if (key.equals("yard")) {
			return v * 0.0009144;
		} else if (key.equals("feet")) {
			return v * 0.0003048;
		} else if (key == "inch") {
			return v * 0.0000254;
		} else if (key.equals("light")) {
			return v * 946100000000000.0;
		}
		return v;
	}

	public double toMile(double v, String key) {
		if (key.equals("mm")) {
			return v * 0.00000062317;
		} else if (key.equals("cm")) {
			return v * 0.0000062317;
		} else if (key.equals("m")) {
			return v * 0.000621371;
		} else if (key.equals("km")) {
			return v * 0.62137100;
		} else if (key.equals("yard")) {
			return v * 0.000568182;
		} else if (key.equals("feet")) {
			return v * 0.000189394;
		} else if (key == "inch") {
			return v * 0.000015783;
		} else if (key.equals("light")) {
			return v * 5879000000000.0;
		}
		return v;
	}

	public double toYd(double v, String key) {
		if (key.equals("mm")) {
			return v * 0.00109361;
		} else if (key.equals("cm")) {
			return v * 0.0109361;
		} else if (key.equals("m")) {
			return v * 1.09361;
		} else if (key.equals("km")) {
			return v * 1093.61;
		} else if (key.equals("mile")) {
			return v * 1760;
		} else if (key.equals("feet")) {
			return v * 0.333333;
		} else if (key == "inch") {
			return v * 0.0277778;
		} else if (key.equals("light")) {
			return v * 10346388930000000.0;
		}
		return v;
	}

	public double toFt(double v, String key) {
		if (key.equals("mm")) {
			return v * 0.00328084251969;
		} else if (key.equals("cm")) {
			return v * 0.032808425196899998477;
		} else if (key.equals("m")) {
			return v * 3.28084;
		} else if (key.equals("km")) {
			return v * 3280.84;
		} else if (key.equals("mile")) {
			return v * 5280;
		} else if (key.equals("yard")) {
			return v * 3;
		} else if (key == "inch") {
			return v * 0.0833333;
		} else if (key.equals("light")) {
			return v * 310400000000000000.0;
		}
		return v;
	}

	public double toInch(double v, String key) {
		if (key.equals("mm")) {
			return v * 0.0393701;
		} else if (key.equals("cm")) {
			return v * 0.393701;
		} else if (key.equals("m")) {
			return v * 39.3701;
		} else if (key.equals("km")) {
			return v * 39370.1;
		} else if (key.equals("mile")) {
			return v * 63360;
		} else if (key.equals("yard")) {
			return v * 36;
		} else if (key.equals("feet")) {
			return v * 12;
		} else if (key.equals("light")) {
			return v * 372500000000000000.0;
		}
		return v;
	}

	public double toLightyear(double v, String key) {
		if (key.equals("mm")) {
			return v * 0.00000000000000000001057;
		} else if (key.equals("cm")) {
			return v * 0.0000000000000000001057;
		} else if (key.equals("m")) {
			return v * 0.0000000000000001057;
		} else if (key.equals("km")) {
			return v * 0.0000000000001057;
		} else if (key.equals("mile")) {
			return v * 0.00000000000017011;
		} else if (key.equals("yard")) {
			return v * 0.000000000000000096652;
		} else if (key.equals("feet")) {
			return v * 0.000000000000000032217;
		} else if (key == "inch") {
			return v * 0.0000000000000000026848;
		}
		return v;
	}
}
