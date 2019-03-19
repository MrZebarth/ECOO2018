import java.util.*;
import java.io.*;
public class Q2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new FileReader("DATA21.txt"));
		//datasets
		for (int x=0;x<10;x++) {
			//read value for how many paths
			int paths=Integer.parseInt(in.readLine());
			int[][] mins=new int[paths][2];
			//loop through the paths
			for (int currentPath=0;currentPath<paths;currentPath++) {
				StringTokenizer data=new StringTokenizer(in.readLine());
				//get path ID
				mins[currentPath][0]=Integer.parseInt(data.nextToken());
				int routes=Integer.parseInt(data.nextToken());
				int[] r=new int[routes];
				for (int z=0;z<routes;z++) {
					r[z]=Integer.parseInt(data.nextToken());
				}
				Arrays.sort(r);
				mins[currentPath][1]=r[0];
			}
			//Find the minimum path
			int[] minimum=new int[paths];
			for (int z=0;z<paths;z++) {
				minimum[z]=mins[z][1];
			}
			Arrays.sort(minimum);
			ArrayList<Integer> answer=new ArrayList<>();
			for (int z=0;z<mins.length;z++) {
				if (mins[z][1]==minimum[0]) {
					answer.add(mins[z][0]);
				}
			}
			answer.sort(null);
			System.out.print(minimum[0]+" {");
			boolean test=false;
			for (int out:answer) {
				System.out.print((test?", "+out:out));
				if (!test) test=true;
			}
			System.out.println("}");
		}
		in.close();
	}

}
