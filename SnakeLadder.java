package SnakeLadder;

import java.util.Random;

class Game{
	
	public static int dice() {
		Random num = new Random();
		int dicenum = num.nextInt(6)+1;
		return dicenum;
	}	
}

public class SnakeLadder {

	public static void main(String[] args) {
		Game player1 = new Game();
		System.out.println(player1.dice());
		
	}
		
}
