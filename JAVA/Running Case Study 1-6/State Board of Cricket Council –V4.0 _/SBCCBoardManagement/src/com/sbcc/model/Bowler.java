package com.sbcc.model;

/*The class and methods should be declared as public 
and all the attributes should be declared as private.*/
public class Bowler extends Player{
	
	// Include all attributes, getters, setters and constructors as specified in the requirement document - 1
	
	// Fill the logic of findStarRating as specified in the requirement document - 4
private int noOfMaiden;
private int noOfHattrick;
private double starRating;
public void setNoOfMaiden(int noOfMaiden){
    this.noOfMaiden=noOfMaiden;
}	
public void setNoOfHattrick(int noOfHattrick){
    this.noOfHattrick=noOfHattrick;
}
public void setStarRating(double starRating){
    this.starRating=starRating;
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
    super();
    noOfMaiden=0;
    noOfHattrick=0;
}
public Bowler(String playerId,String playerName,int matchesPlayed,int runScored,String playingZone,int noOfMaiden,int noOfHattrick){
   super(playerId,playerName,matchesPlayed,runScored,playingZone);
   this.noOfMaiden=noOfMaiden;
   this.noOfHattrick=noOfHattrick;
}
public void findStarRating(){
    starRating=((noOfMaiden*5.0)+(noOfHattrick*10.0))*getMatchesPlayed()/100;
}

}
