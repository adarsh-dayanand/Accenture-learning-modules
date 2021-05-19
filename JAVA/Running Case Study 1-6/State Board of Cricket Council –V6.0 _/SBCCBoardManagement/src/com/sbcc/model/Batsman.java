package com.sbcc.model;
     
     /*The class and methods should be declared as public 
     and all the attributes should be declared as private.*/
     public class Batsman extends Player{
     	
     	// Include all attributes, getters, setters and constructors as specified in the requirement document - 1
     	
     	// Fill the logic of findStarRating as specified in the requirement document - 4
    	private int noOfHundreds;
    	private int noOfFifties;
    	private double starRating;
    	
    	public Batsman(){
    	    
    	}
    	public Batsman(String playerId,String playerName,int matchesPlayed,int runScored,String playingZone,int noOfHundreds,int noOfFifties){
    	    super(playerId,playerName,matchesPlayed,runScored,playingZone);
    	    this.noOfHundreds=noOfHundreds;
    	    this.noOfFifties=noOfFifties;
    	}
    	
    	public void setNoOfHundreds(int noOfHundreds){
    	    this.noOfHundreds=noOfHundreds;
    	}
    	public void setNoOfFifties(int noOfFifties){
    	    this.noOfFifties=noOfFifties;
    	}
    	public void setStarRating(double starRating){
    	    this.starRating=starRating;
    	}
    	public int getNoOfFifties(){
    	    return noOfFifties;
    	}
    	public int getNoOfHundreds(){
    	    return noOfHundreds;
    	}
    	public double getStarRating(){
    	    return starRating;
    	}
        public void findStarRating(){
            setStarRating(((noOfHundreds*10.0)+(noOfFifties*5.0))*getMatchesPlayed()/100);
        }
    
    }