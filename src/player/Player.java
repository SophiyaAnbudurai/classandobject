package player;

public class Player {

	private String Playername;
	private String PlayerPosition;
	

	public Player(String Playername, String PlayerPosition) {
		super();
		this.Playername = Playername;
		this.PlayerPosition = PlayerPosition;
		
		System.out.println(Playername+ " represents " + PlayerPosition + " Position. ");
	}
	
}
