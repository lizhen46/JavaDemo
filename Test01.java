package file;

public class Test01 {

	public static void main(String[] args) {
		System.out.println(sum(1,100));
	}
	public static int sum(int i,int d) {
		int sum=1;
		
		if(i<d) {
			
			sum=sum(++i,d)+i;
			
		}
		
		return sum;
	}
}
