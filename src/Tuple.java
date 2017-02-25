/**
 * 
 * @author Brett Wilhelm
 * @author Zach Johnson
 * 
 */

public class Tuple {
	private int key;
	private float value;
	
	Tuple(int keyP, float valueP) {
		key = keyP;
		value = valueP;
	}
	
	public int getKey() {
		return key;
	}
	
	public float getValue() {
		return value;
	}
	
	public boolean equals(Tuple t) {
		if(this.key == t.getKey()&& this.value == t.getValue()){
	 		return true;
	 	}
	 	return false;
	}
}