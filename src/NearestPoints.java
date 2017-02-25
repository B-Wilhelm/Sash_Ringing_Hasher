import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/** 
 * 
 * @author Brett Wilhelm
 * @author Zach Johnson
 *
 */

public class NearestPoints {
	ArrayList<Float> points;
	
	NearestPoints(String dataFile) throws FileNotFoundException {
		File f = new File("../points.txt");
		Scanner s = new Scanner(f);
		
		while(s.hasNextLine()) {
			points.add(s.nextFloat());
			System.out.println(s.nextFloat());
		}
		
		s.close();
	}
	
	NearestPoints(ArrayList<Float> pointSet) {
		//TODO
	}
	
	ArrayList<Float>  naiveNearestPoints(float p){
		//TODO
		return null;
	}
	
	void buildDataStructure(){
		//TODO
	}
	
	ArrayList<Float> npHashNearestPoints(float p){
		//TODO
		return null;
	}
	
	void allNearestPointsNaive(){
		//TODO
	}
	
	void allNearestPointsHash(){
		//TODO
	}
}
