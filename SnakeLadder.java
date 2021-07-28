package SnakeLadder;

import java.util.Random;

class Game{
	int position =0;
}

public class SnakeLadder {

	public static void main(String[] args) {
		int turns=0;
		Game player1 = new Game();
		Game player2 = new Game();
	
		while(player1.position !=100 && player2.position!=100) {
		int dicenumber1= Rolldice1();
		int dicenumber2= Rolldice2();
		int option= condition();
		int move1 = dicenumber1*option;
		int move2 = dicenumber2*option;
		if(player1.position+move1>100) {
			continue;
		}
		if(player2.position+move2>100) {
			continue;
		}
		
	
		player1.position=player1.position+move1;
		player2.position=player2.position+move2;
		
		if(player1.position<0) {
			player1.position=0;
		}
		if(player2.position<0) {
			player2.position=0;
		}
		
		turns++;
		}
		if (player1.position==100) {
			System.out.println("player1 wins " +player1.position);
			
		}
		else
		{
			System.out.println("player2 wins " +player2.position);
		}
		
		System.out.println("position of player1 is : " +player1.position);
		System.out.println("position of player2 is : " +player2.position);
		System.out.println("number of turns of dice are : " +turns);
		
		
		
	}
	private static int Rolldice1() {
		Random r = new Random();
		int num = r.nextInt(6)+1;
		
		return num;
	}
	private static int Rolldice2() {
		Random r = new Random();
		int num = r.nextInt(6)+1;
		
		return num;
	}


	private static int condition() {
		Random r =new Random();
		int condtn = r.nextInt(3);
		int temp;
		if(condtn==0)
		{
			temp=0;
			
		}
		else if(condtn==1) {
			temp=1;
			
		}
		else {
			temp=-1;
		   
		}
		
		return temp;
	}
}
