/**
 * 
 * @author Brett Wilhelm
 * @author Zach Johnson
 *
 */

public class HashFunction {
	HelperClass h = new HelperClass();
	int a, b, p;
	
	HashFunction(int range) {
		p = h.primeFind(range);
	}
	
	float hash(int x) {
		return ((a*x+b)%p);	// We need a good hash function here
	}
	
	int getA() {
		return a;
	}
	
	void setA(int x) {
		this.a = x%p;
	}
	
	int getB() {
		return b;
	}
	
	void setB(int y) {
		this.b = y%p;
	}
	
	int getP() {
		return p;
	}
	
	void setP(int p) {
		this.p = h.primeFind(p);
	}
}
