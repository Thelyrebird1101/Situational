
import java.util.*;
import java.io.*;

public class CoinCounter {
public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int target = 0;
	try {
		target = Integer.parseInt(br.readLine());
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	if(target%100 == 0)
			System.out.println(target/100);
	else {	
		int[] coins = {1,5,10,20,100};
		int[] table = new int[target+1];
	for (int i = 1; i <= target; i++) {
		table[i]=Integer.MAX_VALUE;
	}
	for(int i=0; i<5; i++) {
		for(int j=1; j<=target; j++) {
			if(j>=coins[i]) {
				if(table[j]> table[j-coins[i]]+1)
						table[j] = table[j-coins[i]] +1;
			}
		}
	}
	//for (int i = 1; i <= target; i++) {
	//	System.out.print(table[i]+" ");
	//}
	System.out.print(table[target]);
		}
	}
}
