//Don't change the code

public class Player {

	private int playerId;
	private String playerName;
	private int age;
	private long phoneNumber;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Player(int playerId, String playerName, int age, long phoneNumber) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
}