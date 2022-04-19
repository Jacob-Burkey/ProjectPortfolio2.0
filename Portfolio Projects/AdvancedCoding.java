package Tinkering;
import java.util.Scanner; 
public class AdvancedCoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1 = "Jacob"; 
		String name2 = "Mike"; 
		String name3 = "Connor";
		
		System.out.println("Hello my name is " + name1 + ", nice to meet you");
		System.out.println("This is my coach " + name2 + ", he is the school's Track & Field throwers coach"); 
		System.out.println("Coach, this is " + name3 + " he is my little brother and throws javelin just like me");
		
		int a = 1;
		int b = 2; 
		int c = 3;
		int d = 4;
		int e = 5;
		
		int sum1 = (a + b + c + d) / e;
		System.out.println(sum1); 
		
		Scanner zero_two = new Scanner(System.in);
		
		// Movie menu project
				System.out.println("Main Menu");
				System.out.println("=========");
				System.out.println("1.) Pinapple Express");
				System.out.println("2.) Wreck It Ralph");
				System.out.println("3.) Mulan");
				System.out.println("4.) Madagascar");
				System.out.println("What movie do you want to watch?"); 
				// Menu created 
				int movie_selection = zero_two.nextInt();
				// User input enabled 	
				switch(movie_selection)	
				{ 
				case 1:
					System.out.println("Enjoy Pinapple Express\n");
						break;
						
				case 2:
					System.out.println("Enjoy Wreck It Ralph\n");
						break;
				
				case 3:
					System.out.println("Enjoy Mulan\n");
						break;
				
				case 4: 
					System.out.println("Enjoy Madagascar\n");
						break;
				
				default:
					System.out.println("Sorry, I did not recognize that selection");
				}
				
		zero_two.close();	// Closing scanner to user input	
		
		// Start of a new program 
		
		Scanner aunt_jemima = new Scanner(System.in);
		
		System.out.println("Here is our menu.");
		System.out.println("=========");
		
		String main_menu = ("1.) Burger\n2.) Cheeseburger\n3.) Hot Dog\n4.) Chicken Nuggets\n"); 
		
		System.out.print(main_menu);

		String answer1 = ("Which would you like to order?");
		
		System.out.println(answer1);  
		int menu_choice = aunt_jemima.nextInt(); // user input required
		
		int order_number = aunt_jemima.nextInt();
		
		char desired_meal = aunt_jemima.next().charAt(0);
		
		char meal_size; // variable used later
		
		int drink_type; // variable used later
		
		int sauce_type; // variable used later
		
		char final_encounter = aunt_jemima.next().charAt(0);

		
		switch(order_number) // a list for the numbered responses
		{
		case 1:
			System.out.println("Would you like to make that a meal? (Y/N) ");
				break;
		case 2:
			System.out.println("Would you like to make that a meal? (Y/N) ");
				break;
		case 3:
			System.out.println("Would you like to make that a meal? (Y/N) ");
				break;
		case 4:
			System.out.println("Would you like to make that a meal? (Y/N) ");
				break;
		default:
			System.out.println("Sorry, I did not recognize your order number.");
		
			if(desired_meal=='Y') 
			{
				System.out.println("What meal would you like? (S, M, L, X) ");
				meal_size = aunt_jemima.next().charAt(0);
				
				System.out.println("What kind of drink do you want?");
				System.out.println("1.) Coke\t2.) Sprite\t3.) Cherry Coke");
				System.out.println("4.) Coffeet5.) Tea\t6 Water");
				System.out.println("What kind of drink would you like?");
				drink_type = aunt_jemima.nextInt(); // user input for which number is selected
				
				if(menu_choice==4) // specialized command for menu order 4 only
				{
					System.out.println("1.) Ranch\t2.) BBQ\t3.) Honey Mustard\t4.) Sweet n Sour\t5.) None");
					System.out.println("What kind of sauce do you want?");
					sauce_type = aunt_jemima.nextInt(); // user input for what kind of sauce they would like with their chicken nuggets
				}
			}
			else
			{
				System.out.println("Would you like anything else? (Y/N) ");
				// no meal choice selected
				// can be the final command if the user chooses choice N
			}	
			
		}
		
		
		if(final_encounter=='Y') // this should be asked after the first order is taken to see if the user requires anything else 
		{
			System.out.println("What would you like?");
			System.out.println("1.) Burger\n2.) Cheeseburger\n3.) Hot Dog\n4.) Chicken Nuggets\n");
			// continuation of ordering until the user is satisfied
		}
		
		else
		{
			System.out.println("Thank you, have a nice day!");
			// end of the loop of asking for orders
		}
			
			
	}

}
