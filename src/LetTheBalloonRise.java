import java.util.Scanner;

public class LetTheBalloonRise {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int lineNums = input.nextInt();
		
		while(lineNums != 0){
			String[] colorArray = new String[lineNums];
			for(int i = 0;i < lineNums;i ++){
				colorArray[i] = input.next();
			}
			
			int maxNums = 0;
			int numOfcolor;
			String MaxNumsColor = "";
			for(int i = 0;i < lineNums;i ++){
				int sumColor = 1;
				for(int j = i + 1;j < lineNums;j ++){
					if(colorArray[i].equals(colorArray[j])){
						sumColor ++;
						numOfcolor  = i;
					}
				}
				if(sumColor > maxNums){
					maxNums = sumColor;
					MaxNumsColor = colorArray[i];
				}
			}
			System.out.println(MaxNumsColor);
			lineNums = input.nextInt();
		}
	}
}
