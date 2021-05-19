package com.sbcc.utility;

import com.sbcc.model.Player;
import java.util.*;

public class SBCCUtility {
//     private String playerId;
//     private String playerName;
//     private int matchesPlayed;
//     private int runScored;
//     private String playingZone;
// 	// Include the logic of parsePlayerDetails method as specified in the requirement document - 2
	
// 	public SBCCUtility(String playerId, String playerName, int matchesPlayed, int runScored, String playingZone){
// 	    this.playerId=playerId;
// 	    this.playerName=playerName;
// 	    this.matchesPlayed=matchesPlayed;
// 	    this.runScored=runScored;
// 	    this.playingZone=playingZone;
// 	}
	
// 	public SBCCUtility(){
	    
// 	}
	
// 	public void setPlayerId(String playerId){
// 	    this.playerId= playerId;
// 	}
// 	public String getPlayerId(){
// 	    return playerId;
// 	}
	
// 	public void setPlayerName(String playerName){
// 	    this.playerName= playerName;
// 	}
// 	public String getPlayerName(){
// 	    return playerName;
// 	}
	
// 	public void setMatchesPlayed(int matchesPlayed){
// 	    this.matchesPlayed= matchesPlayed;
// 	}
// 	public int getMatchesPlayed(){
// 	    return matchesPlayed;
// 	}
	
// 	public void setRunScored(int runScored){
// 	    this.runScored=runScored;
// 	}
// 	public int getRunScored(){
// 	    return runScored;
// 	}
	
// 	public void setPlayingZone(String playingZone){
// 	    this.playingZone=playingZone;
// 	}
// 	public String getPlayingZone(){
// 	    return playingZone;
// 	}
	
	public static Player parsePlayerDetails(String playerDetails){
	    String[] details = playerDetails.split(":");
	    String playerId=details[0];
	    String playerName=details[1];
	    int matchesPlayed= Integer.parseInt(details[2]);
	    String[] runs= new String[matchesPlayed];
	    for (int i=0; i<matchesPlayed; i++){
	        runs[i]= details[i+3];
	    } 
	    String playingZone= details[matchesPlayed+3];
	    String playerType = details[matchesPlayed+4];
	    String numberofhundredsormaidenovers= details[matchesPlayed+5];
	    String numberoffiftiesorhatrickwickets= details[matchesPlayed+6];
	    Player pp = new Player();
	    int totalRuns= pp.calculateTotalRuns(runs);
	    Player pp1 = new Player(playerId, playerName, matchesPlayed, totalRuns, playingZone);
	    //SBCCUtility obj= new SBCCUtility(playerId, playerName, matchesPlayed, totalRuns, playingZone);
	    return pp1;
	}
	
// 	public static int calculateTotalRuns(String[] securedRuns){
// 	    int totalRuns=0;
// 	    for(int i=0; i<securedRuns.length; i++){
// 	        totalRuns+= Integer.parseInt(securedRuns[i]);
// 	    }
// 	    return totalRuns;
// 	}
	
// 	public static void main (String[] args) {
// 	    Scanner sc= new Scanner(System.in);
// 	    Player obj1 = new Player();
// 	    System.out.println("1.Parse the player details and create player\n2.Exit");
// 	    int choice = sc.nextInt();
// 	    switch(choice){
// 	        case 1:
// 	            System.out.println("Enter the player details");
// 	            String inp = sc.next();
// 	            SBCCUtility.parsePlayerDetails(inp);
// 	            System.out.println("Player id:"+obj1.getPlayerId());
// 	            System.out.println("Player name:"+obj1.getPlayerName());
// 	            System.out.println("Matches played:"+obj1.getMatchesPlayed());
// 	            System.out.println("Total runs scored:"+obj1.getRunScored());
// 	            System.out.println("Playing zone:"+obj1.getPlayingZone());
// 	            break;
// 	        case 2:
// 	            System.out.println("Thank you for using SBCC application");
// 	            System.exit(0);
	                
	            
// 	    }
// 	}

}
