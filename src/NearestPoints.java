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
	ArrayList<Float> points = new ArrayList<Float>();
	
	NearestPoints(String dataFile) throws FileNotFoundException {
		File f = new File(dataFile);
		Scanner s = new Scanner(f);
		
		float temp = 0;
		
		while(s.hasNextFloat()) {
			temp = s.nextFloat();
			points.add(temp);
//			System.out.println(temp);
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
