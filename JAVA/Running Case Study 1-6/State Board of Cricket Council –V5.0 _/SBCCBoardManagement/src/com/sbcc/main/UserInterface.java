package com.sbcc.main;

import java.util.Scanner;
import com.sbcc.model.*;
import com.sbcc.utility.SBCCUtility;
import com.sbcc.skeletonvalidator.SkeletonValidator;

import com.sbcc.exception.InvalidPlayerIdException;

public class UserInterface {

	public static void main(String[] args) {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE

		SkeletonValidator validator = new SkeletonValidator();

		// CODE SKELETON - VALIDATION ENDS

		// Please start your code from here
		Scanner sc = new Scanner(System.in);
		int n=0;
		Player p;
		while(true)
		{
		    System.out.println("1. Validate player details\n2. Create Batsman or Bowler\n3. Validation with InvalidPlayerIdException\n4. Exit\nEnter your choice");
		    n = Integer.parseInt(sc.nextLine());
		    String playerDetails="";
		    switch(n)
		    {
		        case 1:
		            {
		                System.out.println("Enter the player details");
		                playerDetails = sc.nextLine();
		               p = SBCCUtility.parsePlayerDetails(playerDetails);
		                    if(p==null)
		                        {
		                            System.out.println("Please provide a valid record");
		                            break;
		                        }
		                        
		                    System.out.print("Player id: "+p.getPlayerId());
		                    System.out.print("\nPlayer name: "+p.getPlayerName());
		                    System.out.print("\nNo. of matches played: "+p.getMatchesPlayed());
		                    System.out.print("\nTotal runs scored: "+p.getRunScored());
		                    System.out.println("\nPlaying zone: "+p.getPlayingZone());
		                    break;
		                }
		            case 2:
		                {
		                    System.out.println("Enter the player details");
		                    playerDetails = sc.nextLine();
		                    p = SBCCUtility.parsePlayerDetails(playerDetails);
		                    if(p==null)
		                        {
		                            System.out.println("Please provide a valid record");
		                            break;
		                        }
		                    System.out.println("Player Id: "+p.getPlayerId());
		                    System.out.println("Player Name: "+p.getPlayerName());
		                    System.out.println("No. of matches played: "+p.getMatchesPlayed());
		                    System.out.println("Total runs scored: "+p.getRunScored());
		                    System.out.println("Playing zone: "+p.getPlayingZone());
		                    String arr[] = playerDetails.split(":");
		                    if(arr[arr.length-3].equals("Batsman")){
		                        Batsman bat = (Batsman)p;
		                        System.out.println("Number of Hundreds: "+bat.getNoOfHundreds());
		                        System.out.println("Number of Fifties: "+bat.getNoOfFifties());
		                        System.out.println("Star Rating: "+bat.getStarRating());
		                    }
		                    else{
		                        Bowler bowl = (Bowler)p;
		                        System.out.println("Number of Maidens: "+bowl.getNoOfMaiden());
		                        System.out.println("Number of Hattricks: "+bowl.getNoOfHattrick());
		                        System.out.println("Star Rating: "+bowl.getStarRating());
		                    }
		                    break;
		                }
		                case 3:
		                    {
		                        System.out.println("Enter the player details");
		                        playerDetails = sc.nextLine();
		                        p = SBCCUtility.parsePlayerDetails(playerDetails);
		                        if(p==null)
		                            {
		                                System.out.println("Please provide a valid record");
		                                break;
		                            }
		                        System.out.println("Player Id: "+p.getPlayerId());
		                        System.out.println("Player Name: "+p.getPlayerName());
		                        System.out.println("No. of matches played: "+p.getMatchesPlayed());
		                        System.out.println("Total runs scored: "+p.getRunScored());
		                        System.out.println("Playing zone: "+p.getPlayingZone());
		                        if(p instanceof Batsman)
		                        {
		                            Batsman bat = (Batsman)p;
		                            System.out.println("Number of Hundreds: "+bat.getNoOfHundreds());
		                            System.out.println("Number of Fifties: "+bat.getNoOfFifties());
		                            System.out.println("Star Rating: "+bat.getStarRating());
		                        }
		                        else
		                        {
		                            Bowler bowl = (Bowler)p;
		                            System.out.println("Number of Maidens: "+bowl.getNoOfMaiden());
		                            System.out.println("Number of Hattricks: "+bowl.getNoOfHattrick());
		                            System.out.println("Star Rating: "+bowl.getStarRating());
		                        }
		                        break;
		                    }
		                case 4:
		                    {
		                        System.out.println("Thank you for using SBCC application");
		                        System.exit(0);
		                    }
		            default:
		            {
		                System.exit(0);
		            }
		    }
		}
		
        
        
		
	}

}
