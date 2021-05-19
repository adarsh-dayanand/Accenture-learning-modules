 package com.sbcc.model;
     
 
     
     /*The class and methods should be declared as public 
    6 and all the attributes should be declared as private.*/
     
     public abstract class Player {
         private String playerId;
        private String playerName;
        private int matchesPlayed;
        private int runScored;
        private String playingZone;
    	// Include all attributes, getters, setters and constructors as specified in the requirement document
    	
    	public Player(){
    	}
    	public Player(String playerId,String playerName,int matchesPlayed,int runScored,String playingZone){
    	    this.playerId=playerId;
    	    this.playerName=playerName;
    	    this.matchesPlayed=matchesPlayed;
    	    this.runScored=runScored;
    	    this.playingZone=playingZone;
    	}
    	public void setPlayerId(String playerId){
    	    this.playerId=playerId;
    	}
    	public void setPlayerName(String playerName){
    	    this.playerName=playerName;
    	}
    	public void setMatchesPlayed(int matchesPlayed){
    	    this.matchesPlayed=matchesPlayed;
    	}
    	public void setRunScored(int runScored){
    	    this.runScored=runScored;
    	}
    	public void setPlayingZone(String playingZone){
    	    this.playingZone=playingZone;
    	}
    	public String getPlayerId(){
    	    return playerId;
    	}
    	public String getPlayerName(){
    	    return playerName;
    	}
    	public int getMatchesPlayed(){
    	    return matchesPlayed;
    	}
    	public int getRunScored(){
    	    return runScored;
    	}
    	public String getPlayingZone(){
    	    return playingZone;
    	}
    	public int calculateTotalRuns(String[] securedRuns){
    	    int sum=0;
    	    for(int i=0;i<securedRuns.length;i++){
    	        sum=sum+Integer.parseInt(securedRuns[i]);
    	    }
    	    return sum;
    	}
    	public abstract void findStarRating();
    }
    