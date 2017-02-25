import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

/** 
 * 
 * @author Brett Wilhelm
 * @author Zach Johnson
 *
 */

public class NearestPoints {
	ArrayList<Float> points, naive, hash;
	int i;
	
	NearestPoints(String dataFile) throws FileNotFoundException {
		points = new ArrayList<Float>();
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
		points = pointSet;
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
	
	void buildDataStructure(){
		//TODO
	}
	
	ArrayList<Float> npHashNearestPoints(float p){
		hash = new ArrayList<Float>();
		
		for(i = 0; i < points.size(); i++) {
			if(Math.abs(points.get(i)-p) <= 1) {
				hash.add(points.get(i));
			}
		}
		
		return hash;
	}
	
	void allNearestPointsNaive(){
		for(i = 0; i < points.size(); i++) {
			try {
				printPoints(naiveNearestPoints(points.get(i)), "NaiveSolution");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	void allNearestPointsHash(){
		for(i = 0; i < points.size(); i++) {
			try {
				printPoints(npHashNearestPoints(points.get(i)), "HashSolution");
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
}
