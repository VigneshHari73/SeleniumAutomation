package tests;

public class febonacci {
	
public static void febo(int num) {
		
		int first = 0;
		int second = 1;
		
		for(int i = 0;i < num; i++) {
			System.out.println(first);
			int next = first+second;
			first = second;
			second = next;
			
			
		}
}
	public static void main(String[] args) {
		febo(10);
	}
	
	
	

		
				
	}
	

