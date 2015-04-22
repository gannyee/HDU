//
import java.util.*;
public class DigitalRoots {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String num = input.next();
		DigitalRoots digital = new DigitalRoots();
		while(!num.equals("0")){
			if(num.length() == 1)
				System.out.println(num);
			else
				System.out.println(digital.root(num));
			num = input.next();
		}
		
		
	}
	public int root(String num){
		int sum = 0;
		for(int i = 0;i < num.length();i ++){
			sum += Integer.parseInt("" + num.charAt(i));
		}
		if(sum >= 10){
			num = Integer.toString(sum);
			sum = root(num);
		}
			return sum;
	}
}
