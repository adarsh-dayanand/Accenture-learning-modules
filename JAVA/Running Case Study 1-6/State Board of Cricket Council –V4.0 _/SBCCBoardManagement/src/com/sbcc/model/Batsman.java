package com.sbcc.model;

/*The class and methods should be declared as public 
and all the attributes should be declared as private.*/
public class Batsman extends Player{
	
	// Include all attributes, getters, setters and constructors as specified in the requirement document - 1
	
	// Fill the logic of findStarRating as specified in the requirement document - 4
private double starRating;
private int noOfHundreds;
private int noOfFifties;
public double getStarRating(){
    return starRating;
}
public void setStarRating(double starRating){
    this.starRating=starRating;
}
public void setNoOfHundreds(int noOfHundreds){
    this.noOfHundreds=noOfHundreds;
}
public void setNoOfFifties(int noOfFifties){
    this.noOfFifties=noOfFifties;
}
public int getNoOfHundreds(){
    return noOfHundreds;
}
public int getNoOfFifties(){
    return noOfFifties;
}
public void findStarRating(){
    starRating=((noOfHundreds*10.0)+(noOfFifties*5.0))*getMatchesPlayed()/100;
}
public Batsman(){
    super();
    noOfFifties=0;
    noOfHundreds=0;
}
public Batsman(String playerId,String playerName,int matchesPlayed,int runScored,String playingZone,int noOfHundreds,int noOfFifties){
    super(playerId,playerName,matchesPlayed,runScored,playingZone);
    this.noOfHundreds=noOfHundreds;
    this.noOfFifties=noOfFifties;
}
	
	


}
