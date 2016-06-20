import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		boolean Start = util.StartUp();
		if (Start == true){
			System.out.print("START DOING STUFF");
		}
		else {
			System.out.print("Goodbye!!");
		}
	}
}