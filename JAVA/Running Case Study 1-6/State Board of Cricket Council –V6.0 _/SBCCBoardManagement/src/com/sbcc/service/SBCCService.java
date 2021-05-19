    package com.sbcc.service;
     import com.sbcc.dao.*;
     import java.util.Map;
     /*The class and methods should be declared as public 
     and all the attributes should be declared as private.*/
     public class SBCCService {
     	private SBCCBoard sb=new SBCCBoard();
     	public void setSBCCBoard(SBCCBoard sb){
     	    this.sb=sb;
    	}
    	public SBCCBoard getSBCCBoard(){
    	    return sb;
    	}
    // Fill the logic of addPlayerObject and findTopPlayerDetails method as specified in the
    		// requirement document - 6
    	public int addPlayerObject(String[] pDetails){
    	    return sb.addPlayerObject(pDetails);
    	}
    	public Map<String,Double> findTopPlayerDetails(String playerType){
    	    return sb.findTopPlayerDetails(playerType);
    	}
    	
    
    }
    