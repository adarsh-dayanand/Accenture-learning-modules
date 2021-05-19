     package com.sbcc.utility;
     import com.sbcc.exception.InvalidPlayerIdException;
     import com.sbcc.model.*;
     
 public class SBCCUtility {
     	
     	// Include the logic of parsePlayerDetails method as specified in the requirement document - 2
     	public Player parsePlayerDetails(String playerDetails){
     	    String s[]=playerDetails.split(":");
    	    String a=s[0];
    	    try{
    	    validatePlayerId(a);
    	    }catch(InvalidPlayerIdException e){
    	        System.out.println(e.getMessage());
    	        return null;
    	    }
    	    String b=s[1];
    	    int c=Integer.parseInt(s[2]);
    	    int d=0;
    	    for(int i=0;i<c;i++){
    	        d=d+Integer.parseInt(s[i+3]);
    	    }
    	    String e=s[s.length-4];
    	    String f=s[s.length-3];
    	    int g=Integer.parseInt(s[s.length-2]);
    	    int h=Integer.parseInt(s[s.length-1]);
    	    Player q=null;
    	    if(f.equalsIgnoreCase("Batsman")){
    	        Batsman obj=new Batsman(a,b,c,d,e,g,h);
    	        obj.findStarRating();
    	        q=obj;
    	        return q;
    	    }else{
    	        Bowler obj=new Bowler(a,b,c,d,e,g,h);
    	        obj.findStarRating();
    	        q=obj;
    	        return q;
    	    }
    	    
    	}
    	public boolean validatePlayerId(String playerId) throws InvalidPlayerIdException{
    	   String s="[A-Z]{4}[0-9]{4}[A-Z]{1}";
    	   if(playerId.matches(s)){
    	       return true;
    	   }else{
    	       throw new InvalidPlayerIdException("Player with Id "+playerId+" is not valid");
    	   }
    	}
    	
    }