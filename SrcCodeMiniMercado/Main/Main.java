package Main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Scanner;

import database.DB;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	Scanner sc = new Scanner(System.in);
	Connection conn = DB.getConnection();
	
	Menu.menuDisplay();
	int op = sc.nextInt();
	sc.nextLine();
	
	while(op != 0) {
		
	}
	
	
	
	
	
	sc.close();
	}
}	