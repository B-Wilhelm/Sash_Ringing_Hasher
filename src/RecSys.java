/** 
 * 
 * @author Brett Wilhelm
 * @author Zach Johnson
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class RecSys {
	
	RecSys(String mrMatrix) throws FileNotFoundException {
		File f = new File(mrMatrix);
		Scanner s = new Scanner(f);
		int userCount = 0, movieCount = 0;
		
		if(s.hasNextLine()) {
			userCount = s.nextInt();
			movieCount = s.nextInt();
		}
		
		float users[] = new float[userCount];
		int movies[] = new int[movieCount];
		
		for(int i = 0; i < users.length; i++) {
			users[i] = s.nextFloat();
			movies[i] = s.nextInt();
		}
	}
	
	public float ratingOf(int u, int m) {
		//TODO
		return 0;
	}
}
