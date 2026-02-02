package librarySeatReservationSystem;

import java.util.Scanner;

public class StudentMenu {
	 public static void show(int userId) {
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	        	System.out.println("\n--- Student Menu ---");
	        	System.out.println("1. View Seats");
	        	System.out.println("2. Reserve Seat");
	        	System.out.println("3. My Reservations");
	        	System.out.println("4. Cancel Reservation");
	        	System.out.println("5. Logout");
	            System.out.print("Choice: ");

	            int ch = sc.nextInt();
	            switch (ch) {
	                case 1:
	                    SeatDAO.viewSeats();
	                    break;
	                case 2:
	                    System.out.print("Seat ID: ");
	                    int seatId = sc.nextInt();
	                    System.out.print("Date (YYYY-MM-DD): ");
	                    String date = sc.next();
	                    System.out.print("Time Slot: ");
	                    String slot = sc.next();
	                    ReservationDAO.reserveSeat(userId, seatId, date, slot);
	                    System.out.println("\n");
	                    break;
	                case 3:
	                    ReservationDAO.viewMyReservations(userId);
	                    break;
	                case 4:
	                    System.out.print("Reservation ID: ");
	                    int rid = sc.nextInt();
	                    ReservationDAO.cancelReservation(rid);
	                    System.out.println("\n");
	                    break;
	                case 5:
	                    return;
	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }

}
