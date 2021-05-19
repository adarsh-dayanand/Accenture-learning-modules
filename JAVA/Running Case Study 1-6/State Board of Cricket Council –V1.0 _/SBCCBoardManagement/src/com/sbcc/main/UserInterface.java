package com.sbcc.main;
import com.sbcc.model.*;

import java.util.*;
import java.lang.*;

import com.sbcc.skeletonvalidator.SkeletonValidator;

public class UserInterface {
    public static Player pl;

	public static void main(String[] args) {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE

		SkeletonValidator validator = new SkeletonValidator();

		// CODE SKELETON - VALIDATION ENDS

		// Please start your code from here
		Scanner sc = new Scanner(System.in);
		//Player pl=new Player();
		int choice=0;
		while(choice!=3){
		    System.out.println("1. Create player\n2. Display player details\n3. Exit\nEnter your choice");
		    choice=sc.nextInt();
		
		    if(choice==1){
		        System.out.println("Enter the player id");
		        String id=sc.next();
		        sc.nextLine();
		        System.out.println("Enter the player name");
		        String name=sc.nextLine();
		        //sc.nextLine();
		        System.out.println("Enter the number of matches played");
		        int matches = sc.nextInt();
		        sc.nextLine();
		        System.out.println("Enter the total runs scored");
		        int runs=sc.nextInt();
		        sc.nextLine();
		        System.out.println("Enter the playing zone");
		        String zone=sc.nextLine();
		        pl = new Player(id,name,matches,runs,zone);
		        
		    }
		    if (choice==2){
		        //pl=new Player();
		        System.out.println("Player id: "+pl.getPlayerId());
		        System.out.println("Player Name: "+pl.getPlayerName());
		        System.out.println("Matches Played: "+pl.getMatchesPlayed());
		        System.out.println("Total runs scored: "+pl.getRunScored());
		        System.out.println("Playing Zone: "+pl.getPlayingZone());
		        
		    } 
		    if(choice==3){
		        System.out.println("Thank you for using SBCC application\n");
		        System.exit(0);
		    }
		}

		
	}

}
