public class PlayerUtility {

	public Player findPlayerDetailsById(Player[] arr, int playerIdToSearch){
	
	//Fill the code here
		for(int i=0;i<arr.length;i++){
		    if(arr[i].getPlayerId()==playerIdToSearch){
		        return arr[i];
		    }
		}
		return null;
	}
	
	
}