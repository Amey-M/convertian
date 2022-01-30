package codes;

public class Currency {

	public double toInr(double v, String key) {

		if (key.equals("usd")){
			return v * 74.46;
		} else if (key.equals("cad")) {
			return v * 59.26;
		} else if (key.equals("chf")) {
			return v * 80.03;
		} else if (key.equals("jpy")) {
			return v * 0.65;
		} else if (key.equals("gbp")) {
			return v * 99.97;
		} else if (key.equals("eur")) {
			return v * 84.28;
		} else if (key.equals("aud")) {
			return v * 54.36;
		} else if (key.equals("zar")) {
			return v * 4.80;
		} else if (key.equals("aed")) {
			return v * 20.27;
		}
		return v;
	}

	public double toUsd(double v, String key) {

		if (key.equals("inr")) {
			return v * 0.013;
		} else if (key.equals("cad")) {
			return v * 0.80;
		} else if (key.equals("chf")) {
			return v * 1.07;
		} else if (key.equals("jpy")) {
			return v * 0.0087;
		} else if (key.equals("gbp")) {
			return v * 1.34;
		} else if (key.equals("eur")) {
			return v * 1.13;
		} else if (key.equals("aud")) {
			return v * 0.73;
		} else if (key.equals("zar")) {
			return v * 0.065;
		} else if (key.equals("aed")) {
			return v * 0.271;
		}
		return v;
	}

	public double toCad(double v, String key) {

		if (key.equals("inr")) {
			return v * 0.017;
		} else if (key.equals("usd")) {
			return v * 1.26;
		} else if (key.equals("chf")) {
			return v * 1.35;
		} else if (key.equals("jpy")) {
			return v * 0.011;
		} else if (key.equals("gbp")) {
			return v * 1.69;
		} else if (key.equals("eur")) {
			return v * 1.42;
		} else if (key.equals("aud")) {
			return v * 0.92;
		} else if (key.equals("zar")) {
			return v * 0.081;
		} else if (key.equals("aed")) {
			return v * 0.34;
		}
		return v;
	}

	public double toChf(double v, String key) {

		if (key.equals("inr")) {
			return v * 0.012;
		} else if (key.equals("usd")) {
			return v * 0.93;
		} else if (key.equals("cad")) {
			return v * 0.74;
		} else if (key.equals("jpy")) {
			return v * 0.0081;
		} else if (key.equals("gbp")) {
			return v * 1.25;
		} else if (key.equals("eur")) {
			return v * 1.05;
		} else if (key.equals("aud")) {
			return v * 0.68;
		} else if (key.equals("zar")) {
			return v * 0.060;
		} else if (key.equals("aed")) {
			return v * 0.25;
		}
		return v;
	}

	public double toJpy(double v, String key) {

		if (key.equals("inr")) {
			return v * 1.54;
		} else if (key.equals("usd")) {
			return v * 114.82;
		} else if (key.equals("cad")) {
			return v * 91.40;
		} else if (key.equals("chf")) {
			return v * 123.42;
		} else if (key.equals("gbp")) {
			return v * 154.14;
		} else if (key.equals("eur")) {
			return v * 129.99;
		} else if (key.equals("aud")) {
			return v * 83.86;
		} else if (key.equals("zar")) {
			return v * 7.40;
		} else if (key.equals("aed")) {
			return v * 31.26;
		}
		return v;
	}

	public double toGbp(double v, String key) {

		if (key.equals("inr")) {
			return v * 0.010;
		} else if (key.equals("usd")) {
			return v * 0.74;
		} else if (key.equals("cad")) {
			return v * 0.59;
		} else if (key.equals("chf")) {
			return v * 0.80;
		} else if (key.equals("jpy")) {
			return v * 0.0065;
		} else if (key.equals("eur")) {
			return v * 0.84;
		} else if (key.equals("aud")) {
			return v * 0.54;
		} else if (key.equals("zar")) {
			return v * 0.048;
		} else if (key.equals("aed")) {
			return v * 0.20;
		}
		return v;
	}

	public double toEur(double v, String key) {

		if (key.equals("inr")) {
			return v * 0.012;
		} else if (key.equals("usd")) {
			return v * 0.88;
		} else if (key.equals("cad")) {
			return v * 0.70;
		} else if (key.equals("chf")) {
			return v * 0.95;
		} else if (key.equals("jpy")) {
			return v * 0.0077;
		} else if (key.equals("gbp")) {
			return v * 1.19;
		} else if (key.equals("aud")) {
			return v * 0.64;
		} else if (key.equals("zar")) {
			return v * 0.057;
		} else if (key.equals("aed")) {
			return v * 0.24;
		}
		return v;
	}

	public double toAud(double v, String key) {

		if (key.equals("inr")) {
			return v * 0.018;
		} else if (key.equals("usd")) {
			return v * 1.37;
		} else if (key.equals("cad")) {
			return v * 1.09;
		} else if (key.equals("chf")) {
			return v * 1.47;
		} else if (key.equals("jpy")) {
			return v * 0.012;
		} else if (key.equals("gbp")) {
			return v * 1.84;
		} else if (key.equals("eur")) {
			return v * 1.55;
		} else if (key.equals("zar")) {
			return v * 0.088;
		} else if (key.equals("aed")) {
			return v * 0.37;
		}
		return v;
	}

	public double toZar(double v, String key) {

		if (key.equals("inr")) {
			return v * 0.21;
		} else if (key.equals("usd")) {
			return v * 15.51;
		} else if (key.equals("cad")) {
			return v * 12.35;
		} else if (key.equals("chf")) {
			return v * 16.68;
		} else if (key.equals("jpy")) {
			return v * 0.14;
		} else if (key.equals("gbp")) {
			return v * 20.83;
		} else if (key.equals("eur")) {
			return v * 17.56;
		} else if (key.equals("aud")) {
			return v * 11.33;
		} else if (key.equals("aed")) {
			return v * 4.22;
		}
		return v;
	}

	public double toAed(double v, String key) {

		if (key.equals("inr")) {
			return v * 0.049;
		} else if (key.equals("usd")) {
			return v * 3.67;
		} else if (key.equals("cad")) {
			return v * 2.92;
		} else if (key.equals("chf")) {
			return v * 3.95;
		} else if (key.equals("jpy")) {
			return v * 0.032;
		} else if (key.equals("gbp")) {
			return v * 4.93;
		} else if (key.equals("eur")) {
			return v * 4.16;
		} else if (key.equals("aud")) {
			return v * 2.68;
		} else if (key.equals("zar")) {
			return v * 0.24;
		}
		return v;
	}
}
