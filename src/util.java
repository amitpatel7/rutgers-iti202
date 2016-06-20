import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class util {

	public static boolean StartUp() {
		System.out.print("Stuff Tracker v1.0\n");
		int choice;
		boolean KeepGoing = false;
		
		//SET DEFAULT DIRECTORY
		String defaultdir = "D:\\deletethis test 1423";
		File dir = new File(defaultdir);
		
		//Check for default directory
		boolean direxists = checkdir(dir);
		if (direxists == true){
			System.out.print("WELCOME BACK!\n");
			System.out.print("You Stuff Tracker Directory is: " + dir.getAbsolutePath() + "\n");
			KeepGoing = true;
		}
		else{
		do{
			dir = new File (defaultdir);
			System.out.print("Default directory: " + dir.getAbsolutePath() + " does not exist.\n"
					+ "____________________________________________________________________\n");
			System.out.print("Enter 1 to create default directory (RECOMMENDED)\n");
			System.out.print("Enter 2 to enter custom directory path\n");
			choice = GetIntRange(1,2);
			
			if (choice == 1){
			        if (!dir.exists()) {
			            if (dir.mkdir()) {
			                System.out.println("Directory created: " + dir.getAbsolutePath());
			                direxists = true;
			            } else {
			                System.out.println("Failed to create directory.\n");
			                System.out.println("You need to manually specify the directory path.");
			            }
			        }
		    }
			if (choice == 2){
					System.out.println("Please enter a file path for your directory: ");
					String path = GetString();
					dir = new File(path);
						if (!dir.exists()) {
							if (dir.mkdir()) {
					                System.out.println("Directory created: " + dir.getAbsolutePath());
					                direxists = true;
					            } else {
					                System.out.println("Failed to create directory.");			
					            	}		
								}
							}
			if (direxists == false){
				System.out.println("Enter 1 to retry.\nEnter 2 to exit.");
				choice = GetIntRange(1,2);
				if (choice == 1){
					KeepGoing = true;
				}
			}
			if(direxists == true) {
				KeepGoing = true;
			}
		} while (direxists == false && KeepGoing == true);

	}
		
	String itempath = dir.getAbsolutePath() + "/items.txt";
	File items = new File (itempath);
	PrintWriter writer = null;
	
	if (!items.isFile()){
	try {
		writer = new PrintWriter(items, "UTF-8");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	writer.println("The first line");
	writer.println("The second line");
	writer.close();
	System.out.print(items.getAbsolutePath());
	if (items.isFile() == true ){
		System.out.print("WOOOOO");
		
	}
	}
	
	
	
	return KeepGoing;
	}
	

	
	
	// Check for default directory
	public static boolean checkdir(File dir){
		
		if (dir.exists() == true){
			return true;
		}
		else return false;
	}
	// Get int from user within defined range
	private static int GetIntRange(int min, int max){
		int checkthis;
		boolean inrange;
	
		do{
		inrange = true;
		checkthis = GetInt();
		boolean IsInRange = InRange(checkthis, min, max);
		if (IsInRange == false){
			System.out.print("Your input '" + checkthis + "' is not a valid choice.\nPlease try again...\n");
			inrange = false;
		}
		}	while (inrange == false);
			return checkthis;
		}
	// Get int from user
	private static int GetInt(){

		boolean isint = true;
		String s = null;
		int d = 0;
		
			do{
				isint = true;
				s = GetString();
					
				try {
						d = Integer.parseInt(s);
					} 
				catch (NumberFormatException e) {
						System.out.println("Your input '" + s + "' is not a integer.\nPlease try again...\n");
						isint = false;
					}
				} 
			while (isint == false);
			return d;
	}
	// Check if int is within defined range
	private static boolean InRange (int checkthis, int min, int max){
		
		if (checkthis >= min && checkthis <= max){
			return true;
		}
		else{
			return false;
		}
	}
	
	//Give string from user
	private static String GetString(){
		String s = null;
		Scanner reader = new Scanner(System.in);
		s = reader.next();
		return s;
	}

}
