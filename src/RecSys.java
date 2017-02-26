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
	NearestPoints n;
	ArrayList<Float> users;
	int userCount, movieCount, i, j;
	int movies[][];
	
	RecSys(String mrMatrix) throws FileNotFoundException {
		File f = new File(mrMatrix);
		Scanner s = new Scanner(f);
		userCount = 0;
		movieCount = 0;
		
		if(s.hasNextLine()) {
			userCount = s.nextInt();
			movieCount = s.nextInt();
		}
		
		users = new ArrayList<Float>();
		movies = new int[userCount][movieCount];
		
		for(i = 0; s.hasNext(); i++) {
			users.add(s.nextFloat());
			for(j = 0; j < movieCount; j++) {
				movies[i][j] = s.nextInt();
			}
		}
		
		n = new NearestPoints(users);
		s.close();
	}
	
	public float ratingOf(int u, int m) {
		ArrayList<Float> temp1, temp2 = null, temp3 = null;
		int a = u-1, b = m-1;
		int sum = 0, count = 0, x;
		
		if(movies[a][b] != 0) { 
			return movies[a][b];
		}
		System.out.println(users.get(a));
		
		temp1 = n.npHashNearestPoints(users.get(a));
		
		if(a < users.size()-1) { temp2 = n.npHashNearestPoints(users.get(a+1)); }
		if(a > 0) { temp3 = n.npHashNearestPoints(users.get(a-1)); }
		
		for(i = 0; i < temp1.size(); i++) {
			x = users.indexOf(temp1.get(i));
			if(movies[x][b] != 0) {
				sum += movies[x][b];
				count++;
			}
			if(temp2 != null) {
				x = users.indexOf(temp2.get(i));
				if(movies[x][b] != 0) {
					sum += movies[x][b];
					count++;
				}
			}
			if(temp3 != null) {
				x = users.indexOf(temp3.get(i));
				if(movies[x][b] != 0) {
					sum += movies[x][b];
					count++;
				}
			}
		}

		return ((float)sum/(float)count);
	}
}
