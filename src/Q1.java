import java.io.*;
import java.util.StringTokenizer;
public class Q1 {
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(new FileReader("DATA11.txt"));
		for (int times=0;times<10;times++) {
			StringTokenizer line=new StringTokenizer(in.readLine());
			int T=Integer.parseInt(line.nextToken());
			int N=Integer.parseInt(line.nextToken());
//			System.out.println(T+", "+N);
			int count=0;
			for (int x=0;x<N;x++) {
				String input=in.readLine();
				if (input.equals("B")) {
					count+=T;
				}
				if (count>0) {
					count--;
				}
			}
			System.out.println(count);
		}
		in.close();
		
	}
}
