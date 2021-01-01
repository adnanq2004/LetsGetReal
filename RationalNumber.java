public class RationalNumber extends Number {

	private int numerator;
	private int denominator;

	public RationalNumber(int nume, int deno) {
		//super(0.0);
		if (deno == 0) {
			numerator = 0;
			denominator = 1;
		}
		else if (deno < 0) {
			numerator = nume * -1;
			denominator = deno * -1;
		}
		else if (nume == 0) {
			numerator = 0;
			denominator = deno;
		}
		else {
			int a = deno;
			int b = nume;
			int remainder = a%b;
                	while (remainder != 0) {
                        	a = b;
                        	//System.out.println(a);
                        	b = remainder;
                        	//System.out.println(b);
                        	remainder = a%b;
                        	//System.out.println("");
                	}
                	int gcd = b;
			if ((gcd != 1)) {
				nume = nume / gcd;
                                deno = deno / gcd;
                        }
			numerator = nume;
			denominator = deno;
		}
	}

	public double getValue() {
		double val = ((double) numerator/ (double) denominator);
		//System.out.println("value " + val);
		return val;
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
		boolean val;
		//val = (Math.abs((numerator - other.numerator)/numerator) <= .00001) && (Math.abs((denominator - other.denominator)/denominator) <= .00001);
		if (numerator == 0 && other.numerator == 0) {
			val = true;
		}
		else if (denominator == 0 && other.denominator == 0) {
			val = true;
		}
		else {
			val = (numerator == other.numerator) && (denominator == other.denominator);
		}
		return val;
	} 
	
	public String toString() {
		/*if (getNumerator() == 0 || getDenominator() == 0) {
			return "0";
		}
		else if (getDenominator() == 1) {
			return "" + getNumerator();
		}
		else {*/
			return "" + getNumerator() + "/" + getDenominator();
		//}
	}

	public static int gcd(int a, int b) {
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		int remainder = a%b;
		while (remainder != 0) {
			a = b;
			//System.out.println(a);
			b = remainder;
			//System.out.println(b);
			remainder = a%b;
			//System.out.println("");
		}
		return b;
	}

	private void reduce() {
		//System.out.println("");
		int rate = gcd(denominator, numerator);
		this.numerator = this.numerator/rate;
		this.denominator = this.denominator/rate;
	}

	public RationalNumber multiply(RationalNumber other) {
		RationalNumber val = new RationalNumber((numerator * other.numerator), (denominator * other.denominator));
		return val;
	}

	public RationalNumber divide(RationalNumber other) {
		RationalNumber temp = new RationalNumber(other.denominator, other.numerator);
		RationalNumber val = this.multiply(temp);
		return val;
	}
	
	public RationalNumber add(RationalNumber other) {
		RationalNumber val = new RationalNumber(numerator * other.denominator + other.numerator * denominator, other.denominator * denominator);
		val.reduce();
		return val;
	}

	public RationalNumber subtract(RationalNumber other) {
		RationalNumber temp = new RationalNumber(other.numerator * -1, other.denominator);
		RationalNumber val = add(temp);
		return val;
	}

}
