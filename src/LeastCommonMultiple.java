import java.util.*;
public class LeastCommonMultiple {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);//Create new Scanner for inpution 
		
		int lineNums = input.nextInt();
		int arraysOfInteger[] = new int[]{0};
		for(int i = 0;i < lineNums; i ++){
			for(int j = 0;arraysOfInteger[j] > 0;j ++)
				arraysOfInteger[j] = input.nextInt();
		}
		int multiSum = 1;
		for(int n = 0; arraysOfInteger[n] != 0;n ++){
			multiSum = multiSum * arraysOfInteger[n];
		}
		int gmd = 0;
		int m;
		for(m = 0; arraysOfInteger[m + 1] != 0;m ++){
			arraysOfInteger[m + 1] = GMD(arraysOfInteger[m],arraysOfInteger[m + 1]);
			gmd = arraysOfInteger[m + 1];
		}
		
		System.out.println(multiSum / Math.pow(gmd, m));
	}
	
	public static int GMD(int num1,int num2){
		while(num1 % num2 != 0 && num2 != 0){
			int num3 = num2;
			num2 = num1 % num2;
			num1 = num3;
		}
		return (num2);
	}

}
