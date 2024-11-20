package arrays;

public class CRICKET 
{
	public static void main(String[] args) 
	{
		int score[]= {1,2,0,4,6,1,2,5,1,2,1,6,5,4,3,6,2,1};
		int noOfPlayed=0;
		for(int player=0;player<score.length;player++)
		{
			if(score[player]==5)
			{
				noOfPlayed++;
			}
		}
		int playerScore[]=new int[noOfPlayed+2];
		int total=score[0],prevBall=score[0],first=0,second=1,count=1;
		playerScore[0]+=score[0];
		boolean strike=false,nonStrike=true;
		for(int ball=1;ball<score.length;ball++)
		{
			if(score[ball]!=5)
			{
				total+=score[ball];
			}
			else if(score[ball]==5)
			{
				if(strike)
				{
					first=second;
					second=second+1;
					prevBall=0;
					strike=false;
					nonStrike=true;
					continue;
				}
				else
				{
					second=second+1;
					prevBall=0;
					strike=true;
					nonStrike=false;
					continue;
				}
			}
			if(strike)
			{
				playerScore[first]+=score[ball];
				prevBall=score[ball];
				if(prevBall%2==1)
				{
					strike=false;
					nonStrike=true;
				}				
			}
			if(nonStrike)
			{
				playerScore[second]+=score[ball];
				prevBall=score[ball];
				if(prevBall%2==1)
				{
					strike=true;
					nonStrike=false;
				}
			}
			count++;
			if(count%6==0)
			{
				strike=false;
				nonStrike=true;
				count=0;
			}
		}
		System.out.println("The Total Score Of The Match is: "+total);
		System.out.println(playerScore.length+"players played in this Match");
		System.out.println("Scores Of Each Player: ");
		for(int player=0;player<playerScore.length;player++)
		{
			System.out.println((player+1)+"player score is : "+playerScore[player]);
		}
	}
}
