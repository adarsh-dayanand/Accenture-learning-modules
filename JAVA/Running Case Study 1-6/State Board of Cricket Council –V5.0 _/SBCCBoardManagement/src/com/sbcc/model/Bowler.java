package com.sbcc.model;

/*The class and methods should be declared as public 
and all the attributes should be declared as private.*/
public class Bowler extends Player{
	
	// Include all attributes, getters, setters and constructors as specified in the requirement document - 1
	private int noOfMaiden,noOfHattrick;
	private double starRating;
	public void setNoOfMaiden(int m){
	    noOfMaiden = m;
	}
	public void setNoOfHattrick(int h){
	    noOfHattrick = h;
	}
	public void setStarRating(double r){
	    starRating = r;
	}
	public int getNoOfMaiden(){
	    return noOfMaiden;
	}
	public int getNoOfHattrick(){
	    return noOfHattrick;
	}
	public double getStarRating(){
	    return starRating;
	}
	public Bowler(){
	    
	}
	public Bowler(String playerId , String playerName , int matchesPlayed, int runScored , String playingZone , int noOfMaiden , int noOfHattrick)
	{
	    super(playerId,playerName,matchesPlayed,runScored,playingZone);
	    this.noOfMaiden = noOfMaiden;
	    this.noOfHattrick = noOfHattrick;
	}
	// Fill the logic of findStarRating as specified in the requirement document - 4
	public void findStarRating(){
	    this.starRating=((this.noOfMaiden*5.0)+(this.noOfHattrick*10.0))*this.getMatchesPlayed()/100;
	}
	

}
