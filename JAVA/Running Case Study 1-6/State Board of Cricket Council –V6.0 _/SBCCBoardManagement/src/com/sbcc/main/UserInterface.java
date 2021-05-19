
     package com.sbcc.main;
     import com.sbcc.service.*;
     import com.sbcc.model.*;
     import com.sbcc.utility.SBCCUtility;
     import java.util.Map;
     import java.util.Scanner;
     import java.util.Set;
     import java.util.Iterator;
     import com.sbcc.skeletonvalidator.SkeletonValidator;
    
    public class UserInterface {
    
    	public static void main(String[] args) {
    		// CODE SKELETON - VALIDATION STARTS
    		// DO NOT CHANGE THIS CODE
    
    		SkeletonValidator validator = new SkeletonValidator();
    
    		// CODE SKELETON - VALIDATION ENDS
    
    		// Please start your code from here
    		Scanner sc = new Scanner(System.in);
    		SBCCService sbc=new SBCCService();
    		Object p=null;
    		int n;
    		do{
     	        System.out.println("1. Validate player details");
    	        System.out.println("2. Create Batsman or Bowler");
    		    System.out.println("3. Validation with InvalidPlayerIdException");
    		    System.out.println("4. Add Player Details");
    		    System.out.println("5. Top three players");
   		    System.out.println("6. Exit");
    		    System.out.println("Enter your choice");
    		    n=sc.nextInt();
    		    sc.nextLine();
    		    if(n==1){
    		        System.out.println("Enter the player details");
    		        String s=sc.nextLine();
    		        p=new SBCCUtility().parsePlayerDetails(s);
    		        if(p==null){
    		            System.out.println("Please provide a valid record");
    		        }else{
    		            vdisplayPlayer(p);
    		        }
    		    }
    		    else if(n==2){
    		       System.out.println("Enter the player details");
    		       String s=sc.nextLine();
    		       p=new SBCCUtility().parsePlayerDetails(s);
    		       if(p==null){
    		           System.out.println("Please provide a valid record");
    		       }else{
    		       displayPlayer(p);
    		       }
    		    }else if(n==3){
    		        System.out.println("Enter the player details");
    		        String s=sc.nextLine();
    		        p=new SBCCUtility().parsePlayerDetails(s);
    		        if(p==null){
    		            System.out.println("Please provide a valid record");
    		        }else{
    		            displayPlayer(p);
    		        }
    		        
    		    }else if(n==4){
    		        System.out.println("Enter the number of player details");
    		        int a=sc.nextInt();
    		        System.out.println("Enter the player details");
    		        String s[]=new String[a];
    		        sc.nextLine();
    		        for(int i=0;i<a;i++){
    		            s[i]=sc.nextLine();
    		        }
    		        int count=sbc.addPlayerObject(s);
    		        System.out.println(count+" valid records found");
    		        }else if(n==5){
    		            System.out.println("Enter the player type");
    		            String s=sc.next();
    		            Map<String,Double> hm=sbc.findTopPlayerDetails(s);
    		            Set set=hm.entrySet();
    		            Iterator it=set.iterator();
    		            while(it.hasNext()){
    		                Map.Entry ans=(Map.Entry) it.next();
    		                System.out.println(ans.getKey()+" "+ans.getValue());
    		            }
    		        }else if(n==6){
    		        System.out.println("Thank you for using SBCC application");
    		    }
    		}while(n!=6);
    
    		
    	}
    /*public static Player createPlayer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the player Id");
        String a=sc.nextLine();
        System.out.println("Enter the player name");
        String b=sc.nextLine();
        System.out.println("Enter the number of matches played");
       int c=sc.nextInt();
       System.out.println("Enter the total runs scored");
       int d=sc.nextInt();
       sc.nextLine();
       System.out.println("Enter the playing zone");
       String e=sc.nextLine();
       Player p=new Player(a,b,c,d,e);
       return p;
       
   }*/
   public static void displayPlayer(Object p){
       Player q=(Player)p;
       System.out.println("Player Id: "+q.getPlayerId());
       System.out.println("Player Name: "+q.getPlayerName());
       System.out.println("No. of matches played: "+q.getMatchesPlayed());
       System.out.println("Total runs scored: "+q.getRunScored());
       System.out.println("Playing zone: "+q.getPlayingZone());
       if(q instanceof Bowler){
           Bowler b=(Bowler)q;
           System.out.println("Number of Maidens: "+b.getNoOfMaiden());
           System.out.println("Number of Hattricks: "+b.getNoOfHattrick());
           System.out.println("Star Rating: "+b.getStarRating());
       }else{
           Batsman b=(Batsman)q;
           System.out.println("Number of Hundreds: "+b.getNoOfHundreds());
           System.out.println("Number of Fifties: "+b.getNoOfFifties());
           System.out.println("Star Rating: "+b.getStarRating());
   }
   }
   public static void vdisplayPlayer(Object p){
       Player q=(Player)p;
       System.out.println("Player id: "+q.getPlayerId());
       System.out.println("Player name: "+q.getPlayerName());
       System.out.println("No. of matches played: "+q.getMatchesPlayed());
       System.out.println("Total runs scored: "+q.getRunScored());
       System.out.println("Playing zone: "+q.getPlayingZone());
   }
   }
   