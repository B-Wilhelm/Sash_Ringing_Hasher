/** 
 * 
 * @author Brett Wilhelm
 * @author Zach Johnson
 *
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class NearestPoints {
	public static String NAIVE_FILENAME="NaiveSolution", HASH_FILENAME="HashSolution";
	ArrayList<Float> points, naive, hash;
	HashTable T;
	int i;
	
	NearestPoints(String dataFile) throws FileNotFoundException {
		points = new ArrayList<Float>();
		File f = new File(dataFile);
		Scanner s = new Scanner(f);
		
		float temp = 0;
		
		while(s.hasNextFloat()) {
			temp = s.nextFloat();
			points.add(temp);
		}
		
		s.close();
		buildDataStructure();
	}
	
	NearestPoints(ArrayList<Float> pointSet) {
		points = pointSet;
		buildDataStructure();
	}
	
	ArrayList<Float> naiveNearestPoints(float p){
		ArrayList<Float> naive = new ArrayList<Float>();
		
		for(i = 0; i < points.size(); i++) {
			if(Math.abs(points.get(i)-p) <= 1) {
				naive.add(points.get(i));
			}
		}
		
		return naive;
	}
	
	void buildDataStructure() {
		//Need to test run-time of this
		T = new HashTable((int)(1.5 * points.size()));
		Tuple temp;
		for(int i = 0; i < points.size(); i++) {
			temp = makeTuple(points.get(i));
			T.add(temp);
		}
		
	}
	
	ArrayList<Float> npHashNearestPoints(float p) {
		//Need to test run-time of this
		hash = new ArrayList<Float>();
		Tuple temp = makeTuple(p);
		ArrayList<Tuple> nearestPoints= new ArrayList<Tuple>();
		nearestPoints = T.search(temp.getKey());
		for(int i = 0; i < nearestPoints.size(); i++) {
			hash.add(nearestPoints.get(i).getValue());
		}
		
		return hash;
	}
	
	void allNearestPointsNaive() {
		for(i = 0; i < points.size(); i++) {
			try {
				printPoints(naiveNearestPoints(points.get(i)), NAIVE_FILENAME);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	void allNearestPointsHash(){
		for(i = 0; i < points.size(); i++) {
			try {
				printPoints(npHashNearestPoints(points.get(i)), HASH_FILENAME);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////
	
	void printPoints(ArrayList<Float> list, String filename) throws IOException {
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename+".txt"), "utf-8"));
		
		for(i = 0; i < list.size(); i++) {
			writer.write(list.get(i).toString() + "\n");
		}
		
		writer.close();
	}
	
	private Tuple makeTuple(float p) {
		int g = (int)Math.floor(p);
		Tuple t = new Tuple(g,p);
		return t;
	}
}
