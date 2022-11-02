
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		int scoreM1p1=0; //variables
		int scoreM1p2=0;
		int playAgain=3;
		int scoreM2p1=0;
		int scoreM2p2=0;
		int scoreM3p1=0;
		int scoreM3p2=0;
		int record=1;
		int recordp2=0;
		int TableScore=0;
		int BadmintonScore=0;
		int SquashScore=0;
		int TennisScore=0;
		System.out.println("Welcome to Racketlon Tournament");
		System.out.println("");
		while(playAgain==1||playAgain==3) {
		while (playAgain==1||playAgain==3) {
			System.out.println("Match "+record); //gives number of math your'e in	
			System.out.println("");
			System.out.println("Table Tenis");
			System.out.println("");

			int winner = (int) (Math.random()*2);//determines the winner
			int scoreplayer1=(int) (Math.random()*20);//determines  player1 score
			int scoreplayer2=(int) (Math.random()*20);//determines player2  score
			if (winner==1) {//if you're the winner
				System.out.println("Your score: 21 ");//;
				System.out.println("Your opponent score "+scoreplayer2);
				scoreM1p1=scoreM1p1+=21;
				scoreM1p2=scoreM1p2+=scoreplayer2;
				TableScore+=21;
			}	
			else if (winner==0) {//if you lost
				System.out.println("Your score "+scoreplayer1);
				System.out.println("Your opponent score: 21 ");
				scoreM1p1=scoreM1p1+=scoreplayer1;
				scoreM1p2=scoreM1p2+=21;
				TableScore=TableScore+=scoreplayer1;
			}

			Thread.sleep(2000);//waits 2  sec
			//

			System.out.println("");
			System.out.println("Badminton");//same as before but now the sport is badminton
			System.out.println("");
			winner = (int) (Math.random()*2);
			scoreplayer1=(int) (Math.random()*20);
			scoreplayer2=(int) (Math.random()*20);
			if (winner==1) {
				System.out.println("Your score: 21 ");
				System.out.println("Your opponent score "+scoreplayer2);
				scoreM1p1=scoreM1p1+=21;
				scoreM1p2=scoreM1p2+=scoreplayer2;
				BadmintonScore+=21;
			}	
			else if (winner==0) {
				System.out.println("Your score "+scoreplayer1);
				System.out.println("Your opponent score: 21 ");
				scoreM1p1=scoreM1p1+=scoreplayer1;
				scoreM1p2=scoreM1p2+=21;
				BadmintonScore=BadmintonScore+=scoreplayer1;
			}
			Thread.sleep(2000);
			System.out.println("");
			System.out.println("Squash");//andnow  with  squash
			System.out.println("");
			winner = (int) (Math.random()*2);
			scoreplayer1=(int) (Math.random()*20);
			scoreplayer2=(int) (Math.random()*20);
			if (winner==1) {
				System.out.println("Your score: 21 ");
				System.out.println("Your opponent score "+scoreplayer2);
				scoreM1p1=scoreM1p1+=21;
				scoreM1p2=scoreM1p2+=scoreplayer2;
				SquashScore=SquashScore+=21;
			}	
			else if (winner==0) {
				System.out.println("Your score "+scoreplayer1);
				System.out.println("Your opponent score: 21 ");
				scoreM1p1=scoreM1p1+=scoreplayer1;
				scoreM1p2=scoreM1p2+=21;
				SquashScore=SquashScore+=scoreplayer1;
			}
			Thread.sleep(2000);
			System.out.println("");
			System.out.println("Tennis");//and finally in tennis
			System.out.println("");
			winner = (int) (Math.random()*2);
			scoreplayer1=(int) (Math.random()*20);
			scoreplayer2=(int) (Math.random()*20);
			if (winner==1) {
				System.out.println("Your score: 21 ");
				System.out.println("Your opponent score "+scoreplayer2);
				scoreM1p1=scoreM1p1+=21;
				scoreM1p2=scoreM1p2+=scoreplayer2;
				TennisScore=TennisScore+=21;
			}	
			else if (winner==0) {
				System.out.println("Your score "+scoreplayer1);
				System.out.println("Your opponent score: 21 ");
				scoreM1p1=scoreM1p1+=scoreplayer1;
				scoreM1p2=scoreM1p2+=21;
				TennisScore=TennisScore+=scoreplayer1;
			}
			if (scoreM1p2>scoreM1p1) { //determines who won 
				recordp2+=1;
				System.out.println("");
				System.out.println("Your opponent wins!");
				record-=1;
			}
			else {//determines who won
				record+=1;
				System.out.println("");
				System.out.println("You win!");
			}
			System.out.println("");
			System.out.println("Your score: "+scoreM1p1+"    Your opponent score: "+scoreM1p2);//gives your score and opponent score
			Thread.sleep(2000);
			
			if (scoreM1p1>scoreM1p2) {//puts the score of the previous match into the assigned match(ej. score match 1/2/3)
				System.out.println("");
				scoreM2p1=scoreM1p1;
				scoreM1p1=0;
				scoreM2p2=scoreM1p2;
				scoreM1p2=0;
					
			}
			else if (record==2) {
			break;}
			else if (scoreM1p2>scoreM1p1||scoreM2p2>scoreM2p1||scoreM3p2>scoreM3p1)
				break;
			else if (record==4) {
				record-=1;
				break;
			}
			else if(scoreM2p1>scoreM2p2) {
				scoreM3p1=scoreM2p1;
				scoreM1p1=0;
				scoreM3p2=scoreM2p2;
				scoreM1p2=0;
			}
		}
			
			System.out.println("");
			System.out.println("Your record is "+record+"-"+recordp2);//gives your record (ej.2-1)
			System.out.println("Your total points are: "+(scoreM3p1+scoreM2p1+scoreM1p1));
			System.out.println("Your sport totals are: Table Tennis("+TableScore+") Badminton("+BadmintonScore+") Squash("+SquashScore+") Tennis("+TennisScore+")");
			System.out.print("Your best sport is: ");
//determines which sport was your best sport
			if ((TableScore>BadmintonScore&&TableScore>SquashScore&&TableScore>TennisScore)||(TableScore==BadmintonScore||TableScore==SquashScore||TableScore==TennisScore)) {
				System.out.print("Table Tennis");
			}
			else if ((BadmintonScore>TableScore&&BadmintonScore>SquashScore&&BadmintonScore>TennisScore)||(BadmintonScore==TableScore||BadmintonScore==SquashScore||BadmintonScore==TennisScore)) {
				System.out.print("Badminton");
			}
			else if ((SquashScore>TableScore&&SquashScore>BadmintonScore&&SquashScore>TennisScore)||(SquashScore==TableScore||SquashScore==BadmintonScore||SquashScore==TennisScore)) {
				System.out.print("Squash");
			}
			else if ((TennisScore>TableScore&&TennisScore>BadmintonScore&&TennisScore>SquashScore)||(TennisScore==TableScore||TennisScore==BadmintonScore||TennisScore==SquashScore)) {
				System.out.print("Tennis");
			}

			System.out.println("");
			if ((playAgain==1)&&(scoreM3p1>scoreM3p2))
				System.out.println("Congratulations! You won the tournament!");
			//says if you won the tournament or not
			System.out.println("");
			System.out.println("Would you like to play another tournament? (yes=1, no=2): ");//if the user want to play another tournament restart the values
			playAgain=in.nextInt();
			if (playAgain==1) {
				scoreM1p1=0;
				scoreM1p2=0;
				playAgain=1;
				scoreM2p1=0;
				scoreM2p2=0;
				scoreM3p1=0;
				scoreM3p2=0;
				record=1; recordp2=0;
				TennisScore=0;
				TableScore=0;
				BadmintonScore=0;
				SquashScore=0;
			}
		}
		

	}
}