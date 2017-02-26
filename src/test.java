import java.io.FileNotFoundException;

public class test {

	public static void main(String[] args) throws FileNotFoundException {
		long startTime;
		
		startTime = System.nanoTime();
		NearestPoints n = new NearestPoints("points.txt");
		System.out.println("Time elapsed during creation of NearestPoints object from points.txt: " + (System.nanoTime()-startTime)/1000000 + " ms");

		startTime = System.nanoTime();
		n.allNearestPointsNaive();
		System.out.println("Time elapsed during naive: " + (System.nanoTime()-startTime)/1000000 + " ms");
		
		startTime = System.nanoTime();
		n.allNearestPointsHash();
		System.out.println("Time elapsed during hash: " + (System.nanoTime()-startTime)/1000000 + " ms");
		
	}

}