/*import java.util.*;
public class FatMouseTrade {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int floors = input.nextInt();
		int numbersOfWarehouse = input.nextInt();
		while(numbersOfCatFood != -1 && numbersOfWarehouse != -1 ){
			int[] javaBean = new int[numbersOfWarehouse];
			int[] exchange = new int[numbersOfWarehouse];
			double[] max = new double[numbersOfWarehouse];
			
			int maxK = 0;
			double sum = 0.0;
			for(int i = 0;i < numbersOfWarehouse;i ++){
				javaBeanOfEachFloor[i] = input.nextInt();
				catFoodOfEachFloor[i] = input.nextInt();
				exchangeProbalityOfEachFloor[i] = (double) ((javaBeanOfEachFloor[i] * 1.0)/ catFoodOfEachFloor[i]);
			}
			while(numbersOfCatFood != 0 && numbersOfWarehouse != 0){
				double maxExchangeProbality = -999;
				for(int i = 0;i < numbersOfWarehouse;i ++ ){
					if (exchangeProbalityOfEachFloor[i] > maxExchangeProbality){
						maxExchangeProbality = exchangeProbalityOfEachFloor[i];
						maxK = i;
					}
				}
				if(numbersOfCatFood - catFoodOfEachFloor[maxK] >= 0){
					numbersOfCatFood -= catFoodOfEachFloor[maxK];
					sum += javaBeanOfEachFloor[maxK];
					exchangeProbalityOfEachFloor[maxK] = 0;
				}else{
					sum += numbersOfCatFood * exchangeProbalityOfEachFloor[maxK];
					numbersOfCatFood = 0;
				}
			}
			sum = (double)sum;
			System.out.printf("%.3f\n", sum);
			numbersOfCatFood = input.nextInt();
			floorsOfCat = input.nextInt();
		}
		
	}
}
*/
import java.util.*;
public class FatMouseTrade {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int catFood = input.nextInt();
		int floors = input.nextInt();
		while(catFood != -1 && floors != -1 ){
			int[] floorsOfCat = new int[floors];
			int[] javaBean = new int[floors];
			double[] exchange = new double[floors];
			
			int maxK = 0;
			double sum = 0.0;
			for(int i = 0;i < floors;i ++){
				javaBean[i] = input.nextInt();
				floorsOfCat[i] = input.nextInt();
				exchange[i] = (double) ((javaBean[i] * 1.0)/ floorsOfCat[i]);
			}
			while(catFood != 0 && floors != 0){
				double max = -999;
				for(int i = 0;i < floors;i ++ ){
					if (exchange[i] > max){
						max = exchange[i];
						maxK = i;
					}
				}
				if(catFood - floorsOfCat[maxK] >= 0){
					catFood -= floorsOfCat[maxK];
					sum += javaBean[maxK];
					exchange[maxK] = 0;
				}else{
					sum += catFood * exchange[maxK];
					catFood = 0;
				}
			}
			sum = (double)sum;
			System.out.printf("%.3f\n", sum);
			catFood = input.nextInt();
			floors = input.nextInt();
		}
		
	}
}
