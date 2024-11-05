package string;

public class Test {
	
	public int[] findWord(int a[]) {
//		int count=0;
//		String[] split = str.split(" ");
//		for(String word: split) {
//			if(word.endsWith("d") || word.endsWith("s")) {
//				count++;
//			}
//		}
//		return count;
		
		
//		int n=str.length();
//		int k=pattern.length();
//		StringBuilder sb=new StringBuilder();
//		
//		for(int i=0;i<=n-k;i++) {
//			if(str.substring(i, i+k).equals(pattern)) {
//				sb.append(i).append(", ");
//			}
//		}
//		
//		
//		if(sb.length()>0) {
//			sb.setLength(sb.length()-2);
//		}
//		
//		System.out.println(sb.toString());
		
		
		
//count occurrences of 0s 1s and 2s
		int count=0, count1=0,count2=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				count++;
			}else if(a[i]==1) {
				count1++;
			}
			else if(a[i]==2)
			{
				count2++;
			}
			}
		
//System.out.print(count+" " +count1+" "+count2); 
		for(int i=0;i<a.length;i++){
			if(i<count)
			{
				a[i]=0;
			}else if(i<count+count2) {
				a[i]=2;
			}else {
				a[i]=1;
			}
		}
		return a;
	}
	
	
	
	public static void main(String[] args) {
		String str="abaababaab", pattern="aa";
		Test t=new Test();
		
		int a[] ={0,0,2,1,0,2,1,1};
		
		int[] findWord = t.findWord(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(findWord[i]+" ");
		}
//		System.out.println(cnt);
	}

}
