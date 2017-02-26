import java.io.FileNotFoundException;

public class test {

	public static void main(String[] args) throws FileNotFoundException {
		long startTime;
		
		startTime = System.nanoTime();
		RecSys r = new RecSys("matrix.txt");

		System.out.println("Time elapsed during creation of RecSys object from matrix.txt: " + (System.nanoTime()-startTime)/1000000000 + " sec");
		
		startTime = System.nanoTime();
		NearestPoints n = new NearestPoints("points.txt");
		System.out.println("Time elapsed during creation of NearestPoints object from points.txt: " + (System.nanoTime()-startTime)/1000000000 + " sec");
		
		//System.out.println(r.ratingOf(3,  3));
		
		//System.out.println(r.ratingOf(2,  4));
		
		//System.out.println(r.ratingOf(4,  4));
		
		System.out.println(r.n.T.size());
		System.out.println(r.ratingOf(1,  2));
		

//		System.out.println(r.ratingOf(5,  2));

		startTime = System.nanoTime();
		n.allNearestPointsNaive();
		System.out.println("Time elapsed during naive: " + (System.nanoTime()-startTime)/1000000000 + " sec");
		
		startTime = System.nanoTime();
		n.allNearestPointsHash();
		System.out.println("Time elapsed during hash: " + (System.nanoTime()-startTime)/1000000000 + " sec");
	}

}