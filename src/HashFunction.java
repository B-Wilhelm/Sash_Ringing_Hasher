import java.util.Random;

/**
 * 
 * @author Brett Wilhelm
 * @author Zach Johnson
 *
 */

public class HashFunction {
	private HelperClass h = new HelperClass();
	private int a, b, p;
	private Random r = new Random();
	
	public HashFunction(int range) {
		p = h.primeFind(range);
		a = r.nextInt(p-1)+1;
		b = r.nextInt(p-1)+1;
	}
	
	public int hash(int x) {
		int result = ((a*x+b)%p);
		if(result < 0) { 
			result += p;
		}
		return result;	// We need a good hash function here
	}
	
	public int getA() {
		return a;
	}
	
	public void setA(int x) {
		this.a = x%p;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int y) {
		this.b = y%p;
	}
	
	public int getP() {
		return p;
	}
	
	public void setP(int p) {
		this.p = h.primeFind(p);
	}
}
