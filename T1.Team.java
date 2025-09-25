import java.util.ArrayList;
class Team{
	private String name;
	private int teamRank;
	private ArrayList <String> players = new ArrayList<>();

	public Team (String name){
		this.name= name;

	}
	public void setRank(int rank){
		this.teamRank=rank;
	}

	@Override
    public String toString(){
		return "Hold: " + name + " De Uovervindelige: "+ players + " Rang: "+ teamRank;
	}

	public void addPlayer(){
		players.add("Ekitike");
		players.add("Eze");
		players.add("Haaland");
		players.add("Palmer");
		players.add("Spence");

	}
}

