//Shelby Brown
import java.util.*;

public class LogicError {
	
	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		int length, width, perimeter; //Declaring the variables
		
		System.out.println("Enter the length and width of a rectangle");
		System.out.println("and I will compute the perimeter.");
		//Instructions for the user.
		length = kbd.nextInt();
		width = kbd.nextInt();
		//Input provided by the user.
		perimeter = (length + width) + (length + width); //The lenth and width are added together to find the perimeter.
		
		System.out.println("The perimeter is:");
		System.out.println( perimeter ); //The perimeter is printed out of the screen.
		
		kbd.close();
	} 
}
