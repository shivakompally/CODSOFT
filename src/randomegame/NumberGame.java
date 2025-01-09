package randomegame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Random  r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int randomNumber = r.nextInt(100)+1;
		System.out.println("rand"+randomNumber);
		int trycount =0;
		while(true) {
		System.out.println("enter the guess of yours (1-100):");
		
	int playerGuess = sc.nextInt();
	int s= trycount++;
	if(playerGuess==  randomNumber ) {
		System.out.println("you are corrrect man");
		System.out.println("you tried for::"+trycount);
		System.out.println("your tried wrong for:: "+s--);
		
		
		break;
	}
	else if(randomNumber>playerGuess){
		System.out.println("no broo the number is higher");
	}
	else {
		System.out.println("no broo the number is lower");
 
	}
	}

}
}