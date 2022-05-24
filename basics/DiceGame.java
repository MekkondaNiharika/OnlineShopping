package basics;

import java.util.*;


public class DiceGame {
	
	public static int GenerateRandom() {
		Random num = new Random();
		int random = num.nextInt(7);
		return(random);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter nunber of times you want to roll the die : ");
		Scanner obj = new Scanner(System.in);
		int count = obj.nextInt();
		int computerWin = 0;
		int userWin = 0;
		for(int i = 0; i<count; i++) {
			
			int computerDie = GenerateRandom();
			System.out.println("the computer value is : "+computerDie);
			int userDie= GenerateRandom();
			System.out.println("the user value is : "+userDie);
			
			if(computerDie == userDie) {
				System.out.println("its a draw in "+i+" roll");

			}
			else if(computerDie > userDie){
				System.out.println("computer wins in "+i+" roll");
				computerWin++;
			}
			else {
				System.out.println("user wins in "+i+" roll");
				userWin++;
			}
			System.out.println(" ");
		}
		if(computerWin == userWin) {
			System.out.println("its draw in end of the game ");
			
		}
		else if(computerWin > userWin) {
			System.out.println("computer wins the game ");
			
		}
		else {
			System.out.println("user wins the game ");
		}

	}

}
