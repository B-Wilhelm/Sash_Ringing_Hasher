/** 
 * 
 * @author Brett Wilhelm
 * @author Zach Johnson
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class RecSys {
	private NearestPoints n;
	
	RecSys(String mrMatrix) throws FileNotFoundException {
		ArrayList<Float> users;
		File f = new File(mrMatrix);
		Scanner s = new Scanner(f);
		int userCount = 0, movieCount = 0, i, j;
		
		if(s.hasNextLine()) {
			userCount = s.nextInt();
			movieCount = s.nextInt();
		}
		
		users = new ArrayList<Float>();
		int movies[][] = new int[userCount][movieCount];
		
		for(i = 0; s.hasNext(); i++) {
			users.add(s.nextFloat());
			for(j = 0; j < movieCount; j++) {
				movies[i][j] = s.nextInt();
			}
		}
		
		n = new NearestPoints(users);
		
		
	}
	
	public float ratingOf(int u, int m) {
		//TODO
		return 0;
	}
}
