import java.util.*;
	import java.util.concurrent.*;

	class Guess
	{
	int rand;
	int guessNum;
	int min=1;
	int max=5;
	int guessNum(){
		int guessNum=(int)(Math.random()*(max-min+1)+min);
		System.out.println("Guesser No :");
		while(rand>=10 && rand<0) {
			System.out.println("Please Re Enter ");
			guessNum=(int)(Math.random()*(max-min+1)+min);
			
		}
		Scanner s=new Scanner(System.in);
		
//		System.out.println("Guesser kindly guess the No: ");
//		guessNum=s.nextInt();
//		while(guessNum>20) {
//			System.out.println("Please Enter Valid Number which is below 20");
//			guessNum=s.nextInt();
//		}
//		return guessNum;
		return guessNum;
	}
	}

	class Player
	{   int playerNo;
		public Player(int playerNo) {
			
			this.playerNo=playerNo;
			
		}
	int guessNum;
	int guessNum(){
		Scanner s=new Scanner(System.in);
		System.out.println( "Player "+playerNo+" kindly guess the No: ");
		guessNum=s.nextInt();
		while(guessNum>20) {
			System.out.println("Please Enter Valid Number which is below 20");
			guessNum=s.nextInt();
		}
		return guessNum;
	}
	}

	class Umpire{
		int numFromGuesser;
		int numFromPlayer1;
		int numFromPlayer2;
		int numFromPlayer3;
		
		void collectNumFromGuesser() {
			Guess g=new Guess();
			numFromGuesser=g.guessNum();
		}
		void collectNumFromPlayers() {
			Player p1=new Player(1);
			Player p2=new Player(2);
			Player p3=new Player(3);
			numFromPlayer1=p1.guessNum();
			numFromPlayer2=p2.guessNum();
			numFromPlayer3=p3.guessNum();
		}
		void compare() {
			if(numFromGuesser== numFromPlayer1) {
				if(numFromGuesser== numFromPlayer2 && numFromGuesser== numFromPlayer3) {
					System.out.println("All Player won the Game");
				}
				else if(numFromGuesser== numFromPlayer2) {
					System.out.println("Game Tie between Player 1 and Player 2");
				}
				else if(numFromGuesser== numFromPlayer3) {
					System.out.println("Game Tie between Player 1 and Player 3");
				}else {
				System.out.println("Player 1 won the Game");
				}
			}
			else if(numFromGuesser== numFromPlayer2) {
				if(numFromGuesser== numFromPlayer1 && numFromGuesser== numFromPlayer3) {
					System.out.println("All Player won the Game");
				}
				else if(numFromGuesser== numFromPlayer1) {
					System.out.println("Game Tie between Player 1 and Player 2");
				}
				else if(numFromGuesser== numFromPlayer3) {
					System.out.println("Game Tie between Player 2 and Player 3");
				}else {
				System.out.println("Player 2 won the Game");
				}
			}
			else if(numFromGuesser== numFromPlayer3){
				if(numFromGuesser== numFromPlayer1 && numFromGuesser== numFromPlayer2) {
					System.out.println("All Player won the Game");
				}
				else if(numFromGuesser== numFromPlayer1) {
					System.out.println("Game Tie between Player 1 and Player 3");
				}
				else if(numFromGuesser== numFromPlayer2) {
					System.out.println("Game Tie between Player 2 and Player 3");
				}else {
				System.out.println("Player 3 won the Game");
				}
			}
			else {
				System.out.println("Game Lost Try Again");
			}
		}
	}


	public class Guesser {

		public static void main(String[] args) {
			Umpire u=new Umpire();
			u.collectNumFromGuesser();
			u.collectNumFromPlayers();
			u.compare();
			

		}

	}

