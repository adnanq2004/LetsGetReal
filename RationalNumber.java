public class RationalNumber extends RealNumber {

	private int numerator;
	private int denominator;

	public RationalNumber(int nume, int deno) {
		super(0.0);
		if (deno == 0) {
			numerator = 0;
			denominator = 1;
		}
		else {
			numerator = nume;
			denominator = deno;
		}
	}

	public double getValue() {
		return 0.0;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public RationalNumber reciprocal() {
		RationalNumber val = new RationalNumber(denominator, numerator);
		return val;
	}

	public boolean equals(RationalNumber other) {
		boolean val = false;
		val = (numerator == other.numerator) && (denominator == other.denominator);
		return val;
	}

}
