package stream_api.deloitte;

import java.util.Arrays;

public class EmpSalarySum {
	public static void main(String[] args) {
     
		int arrays[]= {2,3,4,5,7};
		int sum=Arrays.stream(arrays).sum();
		System.out.println(sum);
		
		
	}
}
