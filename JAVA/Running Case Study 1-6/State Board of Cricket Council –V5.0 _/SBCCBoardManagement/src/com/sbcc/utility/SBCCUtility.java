package com.sbcc.utility;

import com.sbcc.model.*;
import java.util.regex.*;
import com.sbcc.exception.InvalidPlayerIdException;

public class SBCCUtility {
	
	// Include the logic of parsePlayerDetails method as specified in the requirement document - 2
	public static Player parsePlayerDetails(String playerDetails)
	{
	    String s = playerDetails;
	    String arr[] = s.split(":");
	    boolean res = false;
	    try{
	        res = validatePlayerId(arr[0]);
	    }
	    catch(InvalidPlayerIdException e){
	        System.out.println(e.getMessage());
	    }
	  if(res==true)
	  {
	        int matches = Integer.parseInt(arr[2]);
	   String runs[] = new String[matches];
	   for(int i=3,k=0;i<3+matches;i++,k++)
	       {
	           runs[k] = arr[i];
	       }
	        
	   if(arr[3+matches+1].equals("Batsman")){
	       Batsman b = new Batsman();
	       int totalruns = b.calculateTotalRuns(runs);
	       int hundreds = Integer.parseInt(arr[arr.length-2]);
	       int fifties = Integer.parseInt(arr[arr.length-1]);
	       Batsman bat = new Batsman(arr[0],arr[1],matches,totalruns,arr[3+matches],hundreds,fifties);
	       bat.findStarRating();
	       return bat;
	   }
	   else
	   {
	       Bowler b = new Bowler();
	       int totalruns = b.calculateTotalRuns(runs);
	       int maiden = Integer.parseInt(arr[arr.length-2]);
	       int hattrick = Integer.parseInt(arr[arr.length-1]);
	       Bowler bowl = new Bowler(arr[0],arr[1],matches,totalruns,arr[3+matches],maiden,hattrick);
	       bowl.findStarRating();
	       return bowl;
	   }
	  }
	  else
	    return null;
	}
	
	
	public static boolean validatePlayerId(String playerId) throws InvalidPlayerIdException
	{
	        if(Pattern.matches("[A-Z]{4}[0-9]{4}[A-Z]",playerId))
	            return true;
	        else 
	            throw new InvalidPlayerIdException("Player with Id "+playerId+" is not valid");
	   
	}
	
	

}
