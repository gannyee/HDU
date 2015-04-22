
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.*;

public class UCalculateE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		UCalculateE ue = new UCalculateE();
		System.out.println("n e\n" + "- -----------");
		System.out.println("0 1");
		System.out.println("1 2");
		System.out.println("2 2.5");
		for(int i = 3;i <= 9;i++)
			System.out.printf("%d %.9f\n",i,ue.uCalculateE(i));	
	}
	public int factorial(int n){
		if(n == 0)
			return 1;
		else if(n == 1)
			return 1;
		else
			return factorial(n - 1) * n;
	}

	public double uCalculateE(int n){
		double sum = 0.0;
		for(int i = 0;i <= n;i ++)
			sum += (1.0 / factorial(i));
		return sum;
	}
}
