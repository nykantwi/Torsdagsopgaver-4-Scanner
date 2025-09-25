import java.util.Scanner; 
class Main {
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = scan.nextLine();
		System.out.println("Hello " + name);
		
		System.out.println("Please enter your age ");
		int age  = scan.nextInt();
		System.out.println("You are " + age + " years old" );

		System.out.print("Enter your age again: ");
        int agee = scan.nextInt();		
		
	    int yearsTillRetirement = 70 - agee;
	    System.out.println("There is " + yearsTillRetirement + " years left till you can enjoy pension" );
	 }



	} 

