import java.util.*;
public class NumberSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		int n = input.nextInt();
		
		while(A != 0 && B != 0 && n != 0){
			System.out.println(numberSequence(A,B,n % 49));
			A = input.nextInt();
			B = input.nextInt();
			n = input.nextInt();
		}
	}
	public static int numberSequence(int A,int B,int n){
		if(n == 1 || n == 2)
			return 1;
		    
		else
			return (numberSequence(A,B,n - 1) * A + numberSequence(A,B,n - 2) * B) % 7;
	}

}
