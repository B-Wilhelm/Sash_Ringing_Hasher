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
		int userCount = 0, movieCount = 0, i, j;
		
		if(s.hasNextLine()) {
			userCount = s.nextInt();
			movieCount = s.nextInt();
		}
		
		HashTable t = new HashTable(userCount);
		
//		float users[] = new float[userCount];
//		int movies[][] = new int[userCount][movieCount];
//		
//		for(i = 0; s.hasNext(); i++) {
//			users[i] = s.nextFloat();
//			for(j = 0; j < movieCount; j++) {
//				movies[i][j] = s.nextInt();
//			}
//		}
	}
	
	public float ratingOf(int u, int m) {
		//TODO
		return 0;
	}
}
