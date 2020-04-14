
public class Reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =1234;
		int nr = 0;
		int temp, count =0;
		while(n>0) {
			temp = n%10;
			nr=nr*10+temp;
			n/=10;
			count++;
		}
		
		System.out.println(nr);
	}

	/*private static int power(int a, int b) {
		if(b==0)
			return 1;
		else {
			int result = a;
			while(b>1) {
			result=result*a;
			b--;
			}
		return result;
		}
}*/
	

}
