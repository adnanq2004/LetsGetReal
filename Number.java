public abstract class Number {

	private int value;

	public int getValue() {
		return value;
	}

	public int compareTo(Number other) {
		return getValue() - other.getValue();
		/*if (equals(other)) {
			return 0;
		}
		else {
			if ;
		}*/
	}

	public boolean equals(Number other) {
		if (getValue() == 0 || other.getValue() == 0) {
			return (getValue() == 0 && other.getValue() == 0);
		}
		else {
			int temp = getValue() - other.getValue();
			temp = temp/getValue();
			return (temp <= .00001);
		}
	}

}
