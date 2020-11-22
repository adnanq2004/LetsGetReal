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

	public String toString() {
		return "" + numerator + "/" + denominator;
	}

	public static int gcd(int a, int b) {
		while (a != 0 && b != 0) {
			int c = a % b;
			a = b;
			b = c;
		}
		return a;
	}

	private void reduce() {
		int rate = gcd(denominator, numerator);
		numerator = numerator/rate;
		denominator = denominator/rate;
	}

	public RationalNumber multiply(RationalNumber other) {
		RationalNumber val = new RationalNumber((numerator * other.numerator), (denominator * other.denominator));
		return val;
	}

	public RationalNumber divide(RationalNumber other) {
		RationalNumber temp = new RationalNumber(other.denominator, other.numerator);
		return this.multiply(temp);
	}

	

}
