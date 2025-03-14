import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Map<String,Double> map=new HashMap<>();
		map.put("A+", 4.5);
		map.put("A0", 4.0);
		map.put("B+", 3.5);
		map.put("B0", 3.0);
		map.put("C+", 2.5);
		map.put("C0", 2.0);
		map.put("D+", 1.5);
		map.put("D0", 1.0);
		map.put("F", 0.0);
		
		int line=20;
		
		StringTokenizer st;
		
		double sum=0;
		double creditSum=0;
		
		while(line-->0) {
			double credit;
			String grade;
			
			st=new StringTokenizer(br.readLine()); 
			st.nextToken(); //과목 그냥 날림 
			
			credit=Double.parseDouble(st.nextToken());
			grade=st.nextToken();
			
			if(grade.equals("P")) {
				continue;
			}
			
			creditSum+=credit;
			sum+=map.get(grade)*credit;
		}
		
		System.out.println(sum/creditSum);
		
	}
}

