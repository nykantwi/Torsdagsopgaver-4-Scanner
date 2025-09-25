import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{
	private ArrayList<String> actions;

	public GameMenu (ArrayList<String> actions){
		this.actions = actions;

	}

	public void displayMenu(){
		for (String act: actions){
		
		System.out.println(act);

	}
}
    public String promptUser(){
    	
		System.out.println("Type a number to choose an action " );
		Scanner sc = new Scanner(System.in);
		String userChoice = sc.nextLine();
		return userChoice;

	
 


}
}

