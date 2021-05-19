package com.sbcc.main;
import com.sbcc.model.*;
import com.sbcc.utility.*;
import java.util.*;
import java.lang.*;
import com.sbcc.model.Player;
import com.sbcc.model.Batsman;
import com.sbcc.model.Bowler;
import com.sbcc.utility.SBCCUtility;
import java.util.Scanner;

import com.sbcc.skeletonvalidator.SkeletonValidator;

public class UserInterface {
//public static Player pl;
	public static void main(String[] args) {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE

		SkeletonValidator validator = new SkeletonValidator();

		// CODE SKELETON - VALIDATION ENDS

		// Please start your code from here
		Scanner sc = new Scanner(System.in);
		int choice=0;
		while(choice!=3)
		{
		    System.out.println("1. Validate player details\n2. Create Batsman or Bowler\n3. Exit\nEnter your choice");
		    choice=sc.nextInt();
		    switch(choice){
		        case 1:
		            System.out.println("Enter the player details");
		            String det=sc.next();
		            SBCCUtility ob=new SBCCUtility();
		            Player p=ob.parsePlayerDetails(det);
		            if (p==null){
		                System.out.println("Please provide a valid record");
		                break;
		            } 
		            System.out.println("Player Id: "+p.getPlayerId());
		            System.out.println("Player Name: "+p.getPlayerName());
		            System.out.println("No. of matches played: "+p.getMatchesPlayed());
		            System.out.println("Total runs scored: "+p.getRunScored());
		            System.out.println("Playing zone: "+p.getPlayingZone());
		            break;
		        case 2:
		            System.out.println("Enter the player details");
		            String det1=sc.next();
		            SBCCUtility ob1=new SBCCUtility();
		            Player p1=ob1.parsePlayerDetails(det1);
		            if (p1==null){
		                System.out.println("Please provide a valid record");
		                break;
		            }
		            System.out.println("Player Id: "+p1.getPlayerId());
		            System.out.println("Player Name: "+p1.getPlayerName());
		            System.out.println("No. of matches played: "+p1.getMatchesPlayed());
		            System.out.println("Total runs scored: "+p1.getRunScored());
		            System.out.println("Playing zone: "+p1.getPlayingZone());
		            if (p1 instanceof Batsman){
		                Batsman obj=(Batsman)p1;
		                System.out.println("Number of Hundreds: "+obj.getNoOfHundreds());
		                System.out.println("Number of Fifties: "+obj.getNoOfFifties());
		                System.out.println("Star Rating: "+obj.getStarRating());
		            } 
		            else{
		                Bowler obj1=(Bowler)p1;
		                System.out.println("Number of Maidens: "+obj1.getNoOfMaiden());
		                System.out.println("Number of Hattricks: "+obj1.getNoOfHattrick());
		                System.out.println("Star Rating: "+obj1.getStarRating());
		            }
		            break;
		    } 
		}
		System.out.println("Thank you for using SBCC application");
		

		
	}

}
