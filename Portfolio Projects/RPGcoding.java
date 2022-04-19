// Name: RPG Mini game
// Author: Jacob W. Burkey
// Date: 10/17/2020

package RPGminigame;
import java.util.Scanner;
public class RPGcoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner keyboard = new Scanner(System.in);
		
	// list of in game characters	
	
		
	System.out.println("Welcome to my interactive RPG test game!\n ");
	System.out.println("The characters are as follows: ");
	System.out.println("1.) A knight that is good at fighting, but is not very smart.");
	System.out.println("2.) A wizard that is very smart, but is weak.");
	System.out.println("3.) A thief that is agile and somewhat smart, middle of the road.");
	System.out.println("4.) A faithful cleric that only carries his belief nothing more.\n");
	
	// ask which character before game start
	System.out.println("Which character will you choose? ");
	int initial_character = keyboard.nextInt();
	
	switch(initial_character)
	{
	case 1: 
		if(initial_character==1)
		{
			System.out.println("A strong choice, let us begin the game!\n");
			break;
		}
	case 2: 
		if(initial_character==2)
		{
			System.out.println("A wise choice, let us begin the game!\n");
			break;
		}
	case 3:
		if(initial_character==3)
		{
			System.out.println("A solid choice, let us begin the game!\n");
			break;
		}
	case 4:
		if(initial_character==4)
		{
			System.out.println("A worthy choice, let us begin the game!\n");
			break;
		}
	} // end of switch for the initial character choices
	
	System.out.println("You begin the journey and run into a split path: \n");
	System.out.println("To the right is a chest surround by slimes ");
	System.out.println("To the left is an empty path, but something is off about it \n");
	
	System.out.println("Which path will you choose? (L/R)");
	char initial_path = keyboard.next().charAt(0);
	
	// first path 
	
	switch(initial_path)
	{
	case 1:
		if(initial_path=='L')
		{
			// empty path choice
			
			if(initial_character==1)
			{
				System.out.println("You walk right into a trap and get stuck by a poison dart.");
				System.out.println("The poison dart is fatal and you die.");
				break;
			}
			else if(initial_character==2)
			{
				System.out.println("You notice the trap but don't know how to disarm it, you get stuck by the dart.");
				System.out.println("The poison dart is fatal and you die.");
				break;
			}
			else if(initial_character==3)
			{
				System.out.println("You notice the trap and disarm it.");
				System.out.println("You survive without taking damage.\n");
				System.out.println("You continue on your journey.");
			}
			else if(initial_character==4)
			{
				System.out.println("You walk right into the trap and are stuck by the poison dart.");
				System.out.println("You use a miracle to heal yourself, surviving with 70% health left.");
				System.out.println("You continue on your journey. ");
			}
			
		} // case 1 end
	case 2: 
		if(initial_path=='R')
		{
			// slime chest choice
			
			if(initial_character==1)
			{
				System.out.println("You defeat the slimes and open the chest to get 1,000 gold");
				System.out.println("You survive with 87% health remaining.");
				System.out.println("You continue on your journey.");
			}
			else if(initial_character==2)
			{
				System.out.println("You obliterate the slimes and open the chest to get 1,000 gold.");
				System.out.println("You survive without taking a hit.");
				System.out.println("You continue on your journey.");
			}
			else if(initial_character==3)
			{
				System.out.println("You are overwhelmed by the numbers.");
				System.out.println("You are now dead.");
				break;
			}
			else if(initial_character==4)
			{
				System.out.println("You are a holy man and don't fight and are consumed by slimes.");
				System.out.println("You are now dead.");
				break;
			}
			
		} // case 2 end 
		
	} // end of switch 
	
	// path differentiates, switch for L and R
	// second path choice 
	
	switch(0)
	{
	case 1:
		if(initial_path=='L')
		{
			System.out.println("You now have one last path to choose from:");
			System.out.println("To the left, is the dungeon exit.");
			System.out.println("To the right, is a dragon guarding another chest.");
			System.out.println("Which will you choose (L/ R) \n");
			char last_path = keyboard.next().charAt(0);
			switch(last_path)
			{
			case 1:
				if(last_path=='L')
				{
					switch(0)
					{
					case 1:
						if(initial_character==1)
						{
							System.out.println("You safely exit the dungeon.");
							System.out.println("You have completed the game. Congratulations!");
						}
					case 2:
						if(initial_character==2)
						{
							System.out.println("You safely exit the dungeon.");
							System.out.println("You have completed the game. Congratulations!");
						}
					
					}
					
				}
			} // end of interior switch
			
		}
	} // end of switch left path #2
	
	switch(0)
	{
	case 1:
		if(initial_path=='R')
		{
			switch(0)
			{
			case 1:
				if(initial_character==1)
				{
					System.out.println("You fight the dragon and win! You open the chest to find a ton of jewelry.");
					System.out.println("You safely exit the dungeon.");
					System.out.println("You have completed the game. Congratulations!");
				}
			case 2:
				if(initial_character==2)
				{
					System.out.println("You use your magic and it deflects off. You get roasted alive by the dragon.");
					System.out.println("You are now dead.");
					break;
				}
			
			}
			
		}
		
	} // end of switch right path #2
	
	switch(0)
	{
	case 1:
		if(initial_path=='L')
		{
			System.out.println("You now have one last path to choose from:");
			System.out.println("To the left, is a chest.");
			System.out.println("To the right, is a golem that seems to be asleep.");
			System.out.println("Which will you choose (L/ R) \n");
			char last_path = keyboard.next().charAt(0);
			
			switch(last_path)
			{
			case 1:
				if(last_path=='L')
				{
					if(initial_character==3)
					{
						System.out.println("You claim the chest and get 1,000 gold.");
						System.out.println("You safely exit the dungeon.");
						System.out.println("You have completed the game. Congratulations!");
					}
					else if(initial_character==4)
					{
						System.out.println("You claim the chest and get 1,000 gold.");
						System.out.println("You safely exit the dungeon.");
						System.out.println("You have completed the game. Congratulations!");
					}
				}
			case 2:
				if(last_path=='R')
				{
					if(initial_character==3)
					{
						System.out.println("Your thief skills are useful and you sneak past the golem to the chest.");
						System.out.println("You safely complete the dungeon with an extra 10,000 gold.");
						System.out.println("You have completed the game. Congratulations!");
					}
					else if(initial_character==4)
					{
						System.out.println("You use your holy light to distract the golem and get 10,000 gold.");
						System.out.println("You safely exit the dungeon.");
						System.out.println("You have completed the game. Congratulations!");
					}
					
				} // end of if last_path #2
				
			} // end of switch last_path #2
			
		} // entire switch initial_path #2
		
	} // entire switch initial_path #2

	keyboard.close();
	
} // end of main method

} // end of code
