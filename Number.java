public abstract class Number {

	private int value;

	public abstract double getValue();

	public int compareTo(Number other) {
		if (equals(other)) {
			return 0;
		}
		else {
			if (getValue() < other.getValue()) {
				return -1;
			}
			else {
				return 1;
			}
		}
	}

	public boolean equals(Number other) {
		if (getValue() == 0 || other.getValue() == 0) {
			return (getValue() == 0 && other.getValue() == 0);
		}
		else {
			double temp = getValue() - other.getValue();
			temp = temp/getValue();
			return (temp <= .00001);
		}
	}

}
