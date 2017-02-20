/**
 * 
 * @author Brett W.
 * 
 */

public class Tuple {
	int key;
	float value;
	
	Tuple(int keyP, float valueP) {
		key = keyP;
		value = valueP;
	}
	
	int getKey() {
		return key;
	}
	
	float getValue() {
		return value;
	}
	
	boolean equals(Tuple t) {
		return (value == t.value);
	}
}