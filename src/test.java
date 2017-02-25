import java.io.FileNotFoundException;

public class test {

	public static void main(String[] args) throws FileNotFoundException {		
		RecSys r = new RecSys("matrix.txt");
		NearestPoints n = new NearestPoints("points.txt");
		
		System.out.println(r.ratingOf(3,  3));
		
		System.out.println(r.ratingOf(2,  4));
		
		System.out.println(r.ratingOf(4,  4));
		
//		System.out.println(r.ratingOf(4,  3));
		
//		System.out.println(r.ratingOf(5,  2));
		
		n.allNearestPointsNaive();
		
		n.allNearestPointsHash();
	}

}