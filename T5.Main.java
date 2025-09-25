import java.util.ArrayList;
import java.util.Scanner;
class Main {
	public static void main(String[]args){
		ArrayList<String> actions = new ArrayList<String>();
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");
    // Test System.out.print(actions.get(2));

// 4g. instantiate the Game menu class with action list as an arg. to the constructor
    GameMenu menu = new GameMenu(actions);
	menu.displayMenu();
	
	String userChoice = menu.promptUser();
	
	int choiceNumber = Integer.parseInt(userChoice);
	 doAction(choiceNumber);


   
 }
 public static void doAction(int action){
    	System.out.println("You chose: " + action);
    }
    

}
