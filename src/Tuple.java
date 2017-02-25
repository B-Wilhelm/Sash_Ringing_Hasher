/**
 * 
 * @author Brett Wilhelm
 * @author Zach Johnson
 * 
 */

public class Tuple {
	private int key;
	private double value;
	
	Tuple(int keyP, float valueP) {
		key = keyP;
		value = valueP;
	}
	
	int getKey() {
		return key;
	}
	
	double getValue() {
		return value;
	}
	
	boolean equals(Tuple t) {
		return (this.equals(t));
	}
}