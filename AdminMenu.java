package librarySeatReservationSystem;

import java.util.Scanner;

public class AdminMenu {
	public static void show() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add Seat");
            System.out.println("2. View Seats");
            System.out.println("3. Remove Seat");
            System.out.println("4. Logout");
            System.out.print("Choice: ");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Seat Number: ");
                    SeatDAO.addSeat(sc.next());
                    break;
                case 2:
                    SeatDAO.viewSeats();
                    break;
                case 3:
                    System.out.print("Seat ID: ");
                    SeatDAO.deleteSeat(sc.nextInt());
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }


}
