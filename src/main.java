import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		boolean Start = util.StartUp();
		if (Start == true){
			System.out.print("START DOING STUFF");
		}
		else {
			System.out.print("Goodbye!!");
		}
		*/
		
		int mainMenuChoice = mainMenuSelection();
		
		if(mainMenuChoice == 1){
			int searchMenuChoice = searchMenuSelection();
			if(searchMenuChoice == 1){
				//search by item name
			}else if(searchMenuChoice == 2){
				//search by item category
			}else if(searchMenuChoice == 3){
				//search in a location
			}else if(searchMenuChoice == 4){
				//return to main menu
			}
		}else if(mainMenuChoice == 2){
			//add a new item
		}else if(mainMenuChoice == 3){
			//move an item
		}else if(mainMenuChoice == 4){
			//update item status
		}else if(mainMenuChoice == 5){
			//save menu and exit
		}
		
	}
	
	public static int mainMenuSelection(){
		boolean inputError = false;
		Scanner selection = new Scanner(System.in);
		do{
			try{
				inputError = false;
				System.out.println();
				System.out.println("MAIN MENU: Select what you want to do by inputting a number: ");
				System.out.println("\t1. Search for an item");
				System.out.println("\t2. Add a new item");
				System.out.println("\t3. Move an item");
				System.out.println("\t4. Update an item's status");
				System.out.println("\t5. Save and exit program");
				return Integer.parseInt(selection.nextLine());	
			}catch (Exception e){
				inputError = true;
				System.out.println("Error: input is invalid");
			}
		}while(inputError = true);
		return -1;
	}
	
	public static int searchMenuSelection(){
		boolean inputError = false;
		Scanner selection = new Scanner(System.in);
		do{
			try{
				inputError = false;
				System.out.println();
				System.out.println("SEARCH MENU: Select what you want to do by inputting a number: ");
				System.out.println("\t1. Search by item's name");
				System.out.println("\t2. Search by item's category");
				System.out.println("\t4. Search in a location");
				System.out.println("\t5. Return to Main Menu");
				return Integer.parseInt(selection.nextLine());	
			}catch (Exception e){
				inputError = true;
				System.out.println("Error: input is invalid");
			}
		}while(inputError = true);
		return -1;
	}
	
	
	public static int getInt(String prompt){
		Scanner keyboard = new Scanner(System.in);
		boolean inputError = false;
		int enteredNum = 0;
		String enteredString = "";
		do{
			try{
				System.out.println(prompt);
				enteredString = keyboard.nextLine();
				enteredNum = Integer.parseInt(enteredString.trim());
				inputError = false;
			}catch(Exception e){
				System.out.println("Your entry: \"" + enteredString + "\" is invalid. Please try again");
				inputError = true;
			}
		}while(inputError == true);
		return enteredNum;
	}
	
}
