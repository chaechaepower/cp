import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Solution {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testN=Integer.parseInt(br.readLine());
		
		for(int t=1;t<=testN;t++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int k=Integer.parseInt(st.nextToken());
			
			int[][] arr=new int[n][n];
			
			for(int i=0;i<n;i++) {
				st=new StringTokenizer(br.readLine());
				
				for(int j=0;j<n;j++) {
					arr[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			
			int answer=0;
			
			//행 
			for(int i=0;i<n;i++) {
				int count=0;
				
				for(int j=0;j<n;j++) {
					if(arr[i][j]==0) {
						if(count==k) {
							answer++;
						}
						count=0;
					}
					else {
						count++;
					}
				}
				if(count==k) {
					answer++;
				}
			}
			
			//열 
			for(int i=0;i<n;i++) {
				int count=0;
				
				for(int j=0;j<n;j++) {
					if(arr[j][i]==0) {
						if(count==k) {
							answer++;
						}
						count=0;
					}
					else {
						count++;
					}
				}
				if(count==k) {
					answer++;
				}
			}
			
			System.out.printf("#%d %d\n",t,answer);
		}
	}
}
