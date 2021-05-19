package com.sbcc.utility;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import com.sbcc.model.Batsman;
import com.sbcc.model.Bowler;
import com.sbcc.model.Player;
import java.util.*;
import java.util.regex.*;

public class SBCCUtility {
    public boolean validatePlayerId(String playerId){
        if(Pattern.matches("[A-Z]{4}[0-9]{4}[A-Z]{1}",playerId))
        return true;
        else return false;
    }
	
	// Include the logic of parsePlayerDetails method as specified in the requirement document - 2
	public Player parsePlayerDetails(String playerDetails){
	   int index=playerDetails.indexOf(':');
	   String Pid=playerDetails.substring(0,index);
	   boolean res=validatePlayerId(Pid);
	   if (res==true)
	   {
	       String strArray[]=playerDetails.split(":");
	       int numOfMatch=Integer.parseInt(strArray[2]);
	       if (strArray[numOfMatch+4].equals("Batsman")){
	           Player b=new Batsman();
	           b.setPlayerId(strArray[0]);
	           b.setPlayerName(strArray[1]);
	           b.setMatchesPlayed(numOfMatch);
	           String runs[]=new String[numOfMatch];
	           for (int i=0;i<numOfMatch ; i++){
	               runs[i]=strArray[i+3];
	           } 
	           b.setPlayingZone(strArray[numOfMatch+3]);
	           int Truns=b.calculateTotalRuns(runs);
	           b.setRunScored(Truns);
	           Batsman b1=(Batsman)b;
	           b1.setNoOfHundreds(Integer.parseInt(strArray[numOfMatch+5]));
	           b1.setNoOfFifties(Integer.parseInt(strArray[numOfMatch+6]));
	           b1.findStarRating();
	           return b;
	       } 
	       else {
	           Player bo=new Bowler();
	           bo.setPlayerName(strArray[1]);
	           bo.setPlayerId(strArray[0]);
	           bo.setMatchesPlayed(numOfMatch);
	           String runs1[]=new String[numOfMatch];
	           for (int j=0;j<numOfMatch ; j++){
	               runs1[j]=strArray[j+3];
	           } 
	           bo.setPlayingZone(strArray[numOfMatch+3]);
	           int Truns1=bo.calculateTotalRuns(runs1);
	           bo.setRunScored(Truns1);
	           Bowler bo1=(Bowler)bo;
	           bo1.setNoOfMaiden(Integer.parseInt(strArray[numOfMatch+5]));
	           bo1.setNoOfHattrick(Integer.parseInt(strArray[numOfMatch+6]));
	           bo1.findStarRating();
	           return bo;
	       }
	   }
	       else return null;
	   }
	}