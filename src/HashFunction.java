import java.util.Random;

/**
 * 
 * @author Brett Wilhelm
 * @author Zach Johnson
 *
 */

public class HashFunction {
	HelperClass h = new HelperClass();
	int a, b, p;
	Random r = new Random();
	
	HashFunction(int range) {
		p = h.primeFind(range);
		a = r.nextInt(p-1)+1;
		b = r.nextInt(p-1)+1;
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
