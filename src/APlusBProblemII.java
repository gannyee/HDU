import java.math.BigInteger;
import java.util.*;
public class APlusBProblemII {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int lineNums = input.nextInt();
		
		for(int i = 0;i < lineNums;i ++){
			BigInteger num1 = input.nextBigInteger();			
			BigInteger num2 = input.nextBigInteger();
			
			System.out.println("Case " + (i + 1) + ":");
			System.out.println(num1 + " + " + num2 + " = " + num1.add(num2));
			if(i!=lineNums - 1)
				System.out.println();
		}
	}

}
