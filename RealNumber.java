public class RealNumber {

	private double value;

	public RealNumber(double v) {
		value = v;
	}

	public double getValue() {
		return value;
	}

	public String toString() {
		return "" + (this.getValue());
	}

	public boolean equals(RealNumber other) {
		boolean val = false;
		if (this.value == 0) {
			val = (other.value == 0);
		}
		else {
			val = Math.abs((this.value - other.value)/this.value) <= .00001; 
		}
		return val;
	}

	public RealNumber add(RealNumber other) {
		RealNumber val = new RealNumber(value + other.value);
		return val;
	}

	public RealNumber multiply(RealNumber other) {
		RealNumber val = new RealNumber(value * other.value);
		return val;
	}

	public RealNumber divide(RealNumber other) {
		RealNumber val = new RealNumber(value / other.value);
		return val;
	}

	public RealNumber subtract(RealNumber other) {
		RealNumber val = new RealNumber(value - other.value);
		return val;
	}

}
