 package com.sbcc.exception;
     
     /*The class and methods should be declared as public 
     and all the attributes should be declared as private.*/
     
     //Make necessary changes to make this class as Exception class
     public class InvalidPlayerIdException extends Exception{
     	
     	public InvalidPlayerIdException(String msg){
    	    super(msg);
    	}
    	//Include a single argument constructors that take String as argument as specified in the requirement document - 5
    
    }