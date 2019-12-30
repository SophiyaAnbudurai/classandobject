package classes;

public class Team {
	
	private String Teamname;
	private String City;
	
	public Team(String Teamname, String City) {
		super();
		this.Teamname = Teamname;
		this.City = City;
		
		System.out.println(Teamname+ " team represents " + City + " City ");
		
	}

}
