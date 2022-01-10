package org.itenas.oop.jdbc.driver;
import java.util.Scanner;

public class MainDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loginValid = 0;
		String username, password, user = "postfarrel", pass = "123";
			
		do {
			System.out.println("========Login=========");
			System.out.println("Username: ");
			username = sc.next();
			System.out.println("Password: ");
			password = sc.next();
			
			if(username != user || password != pass) {
				System.out.println("Username or password is not available");
				loginValid = 0;
			}else {
				loginValid = 1;
			}
		}while(loginValid == 0);
		
		sc.close();
	}
}
