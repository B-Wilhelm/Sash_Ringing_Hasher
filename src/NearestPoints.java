import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
	ArrayList<Float> points;
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
	
	void allNearestPointsNaive() throws FileNotFoundException, UnsupportedEncodingException{
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
