package gugudan;

import java.util.Scanner;

public class GuguDanMain {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		String inputValue = sc.nextLine();
        sc.close();
        
		String[] spritvalue = inputValue.split(",");
		
		int first = Integer.parseInt(spritvalue[0]);
		int last  = Integer.parseInt(spritvalue[1]);
		
		for (int i = 1; i <= first; i++)
			GuguDan.prtResult(GuguDan.CalResult(i, last));

	}

}
