package librarySeatReservationSystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n--- Library Seat Reservation System ---");
	            System.out.println("1. Admin Login");
	            System.out.println("2. Student Login");
	            System.out.println("3. Exit");
	            System.out.print("Choice: ");

	            int ch = sc.nextInt();

	            if (ch == 1) {
	                System.out.print("Username: ");
	                String u = sc.next();
	                System.out.print("Password: ");
	                String p = sc.next();

	                int id = UserDAO.login(u, p, "ADMIN");
	                if (id != -1) {
	                    AdminMenu.show();
	                } else {
	                    System.out.println("Invalid admin credentials!");
	                }
	            }

	            else if (ch == 2) {
	                System.out.print("Username: ");
	                String u = sc.next();
	                System.out.print("Password: ");
	                String p = sc.next();

	                int id = UserDAO.login(u, p, "STUDENT");
	                if (id != -1) {
	                    StudentMenu.show(id);
	                } else {
	                    System.out.println("Invalid student credentials!");
	                }
	            }

	            else if (ch == 3) {
	                System.out.println("Thank you.Have a nice day.\nGoodbye 👋");
	                System.exit(0);
	            }

	            else {
	                System.out.println("Invalid choice!");
	            }
	        }


	}

}
