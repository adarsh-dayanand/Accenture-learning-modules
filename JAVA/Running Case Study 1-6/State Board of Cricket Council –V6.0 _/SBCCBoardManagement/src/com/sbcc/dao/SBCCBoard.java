package com.sbcc.dao;
     import com.sbcc.utility.*;
     import com.sbcc.model.*;
     import java.util.List;
     import java.util.ArrayList;
     import java.util.Map;
     import java.util.HashMap;
     import java.util.Collection;
     import java.util.Set;
   /*The class and methods should be declared as public 
    and all the attributes should be declared as private.*/
    
    public class SBCCBoard {
       private List<Player> playerList = new ArrayList<Player>();
        public void setPlayerList(List<Player> playerList){
            this.playerList=playerList;
        }
        public List<Player> getPlayerList(){
            return playerList;
        }
        public int addPlayerObject(String[] pDetails){
            Player p=null;
            for(int i=0;i<pDetails.length;i++){
            p=new SBCCUtility().parsePlayerDetails(pDetails[i]);
            if(p!=null){
            playerList.add(p);   
            }
        }
            return playerList.size();
        }
       public Map<String,Double> findTopPlayerDetails(String playerType){
            Map<String,Double> sametype=new HashMap<String,Double>();
            if(playerType.equalsIgnoreCase("Batsman")){
                for(int i=0;i<playerList.size();i++){
                    if(playerList.get(i) instanceof Batsman){
                        sametype.put(playerList.get(i).getPlayerId(),((Batsman)playerList.get(i)).getStarRating());
                    }
                }
            }else{
                for(int i=0;i<playerList.size();i++){
                    if(playerList.get(i) instanceof Bowler){
                        sametype.put(playerList.get(i).getPlayerId(),((Bowler)playerList.get(i)).getStarRating());
                    }
                }
            }
            Set<String> k=sametype.keySet();
            ArrayList<String> keys=new ArrayList<String>(k);
            Collection<Double> v=sametype.values();
            ArrayList<Double> values=new ArrayList<Double>(v);
            String kk[]=new String[keys.size()];
            Double vv[]=new Double[values.size()];
            keys.toArray(kk);
            values.toArray(vv);
            for(int i=0;i<vv.length-1;i++){
                for(int j=i+1;j<vv.length;j++){
                    if(vv[i]<vv[j]){
                        double tempv=vv[i];
                        vv[i]=vv[j];
                        vv[j]=tempv;
                        String tempk=kk[i];
                        kk[i]=kk[j];
                        kk[j]=tempk;
                    }
                }
            }
            Map<String,Double> top =new HashMap<String,Double>();
            for(int i=0;i<3;i++){
                      top.put(kk[i],vv[i]);
            }
            return top;
        }
        
    	// Include all attributes, getters, setters and constructors as specified in
    	// the requirement document - 6
    
    	// Fill the logic of addPlayerObject as specified in the requirement
    	// document - 6
    
    	// Fill the logic of calculateTotalRuns as specified in the requirement
    	// document - 6
    
    }
    
   