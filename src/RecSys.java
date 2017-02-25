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
		ArrayList<Float> similarUsers;
		int a = u-1, b = m-1;
		int sum = 0, count = 0, x;
		
		if(movies[a][b] != 0) { 
			return movies[a][b];
		}
		
		similarUsers = n.npHashNearestPoints(u);
		
		for(i = 0; i < similarUsers.size(); i++) {
			x = users.indexOf(similarUsers.get(i));
			if(movies[x][b] != 0) {
				sum += movies[x][b];
				count++;
			}
			if(similarUsers.get(i)+1 <= 4) {
				x = users.indexOf(similarUsers.get(i)+1);
				if(movies[x][b] != 0) {
					sum += movies[x][b];
					count++;
				}
			}
			if(similarUsers.get(i)-1 >= 0) {
				x = users.indexOf(similarUsers.get(i)-1);
				if(movies[x][b] != 0) {
					sum += movies[x][b];
					count++;
				}
			}
		}

		return ((float)sum/(float)count);
	}
}
