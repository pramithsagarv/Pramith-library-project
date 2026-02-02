# Pramith-library-project
1️⃣ Introduction

The Smart Library Seat Reservation System is a command-line based Java application designed to manage library seating efficiently.
It allows administrators to manage seats and students to reserve seats for specific dates and time slots.

This project demonstrates the practical usage of:
Core Java
JDBC
MySQL database
Menu-driven programming


2️⃣ Objectives of the Project

* To automate the library seat reservation process
* To avoid manual seat allocation conflicts
* To ensure proper database integrity using foreign keys
* To provide hands-on experience with JDBC and SQL
* To build a real-world menu-driven application


3️⃣ Scope of the Project

The scope of this project includes:

* Admin login and seat management
* Student login and seat reservation
* Viewing and cancelling reservations
* Secure database connectivity using JDBC

Limitations:

* Command-line based (no GUI)
* Single-seat reservation per transaction
* No automatic time-based seat release



4️⃣ Technology Stack
Technology	Description
Java	Core Java (JDK 8 or above)
Database	MySQL
Connectivity	JDBC
IDE	Eclipse / IntelliJ / NetBeans
OS	Windows / Linux



5️⃣ System Requirements
Hardware Requirements

* Minimum 4 GB RAM
* 10 GB free disk space
* Software Requirements
* Java JDK 8+
* MySQL Server
* MySQL Connector/J (JDBC Driver)
* Java IDE



6️⃣ Project Modules
6.1 Admin Module

Login authentication

Add library seats

View all seats

Remove seats (with dependency handling)

6.2 Student Module

Login authentication

View available seats

Reserve seats

View reservations

Cancel reservations

6.3 Database Module

Stores users, seats, and reservations

Maintains referential integrity using foreign keys

7️⃣  Application Architecture

The project follows a DAO (Data Access Object) design pattern.

User Interface (CLI)
        |
        v
    Menu Classes
        |
        v
     DAO Classes
        |
        v
     MySQL Database




8️⃣ Project Flow

* User launches application
* Selects Admin or Student login
* Credentials verified from database

Based on role:
* Admin manages seats
* Student reserves seats

* All operations stored in MySQL database




9️⃣ Exception Handling

* Invalid login credentials handled
* Seat availability checked before reservation
* Foreign key constraint handled during seat deletion
* Input validation using conditional checks


🔟 Security Features

* Role-based access control
* PreparedStatement used to prevent SQL Injection
* Database-level foreign key constraints




1️⃣1️⃣ Error Handling & Resolution
Problem Faced:
* Cannot delete or update a parent row: foreign key constraint fails

Solution Implemented:
* Dependent reservation records are deleted first
* Seat is deleted only after clearing references
* Maintains database integrity


1️⃣2️⃣ Testing
Test Cases:

* Valid admin login
* Invalid student login
* Seat reservation with unavailable seat
* Seat deletion with existing reservation
* Reservation cancellation
* All test cases executed successfully.



1️⃣3️⃣ Advantages

* Simple and user-friendly
* Real-world problem simulation
* Strong database integrity
* Easy to extend with new features



1️⃣4️⃣ Limitations

* No graphical user interface
* Manual date and time entry
* No concurrency handling



1️⃣5️⃣ Future Enhancements

* GUI using JavaFX or Swing
* Automatic seat release after time expiry
* Email/SMS notification
* Role-based dashboards
* Multi-slot reservations



1️⃣6️⃣ Conclusion

The Smart Library Seat Reservation System successfully demonstrates how Core Java and JDBC can be used to develop a real-world database-driven application.
The project improves understanding of database connectivity, SQL queries, and application logic while maintaining data integrity.


1️⃣7️⃣ References

* Java Documentation
* MySQL Official Documentation
* JDBC API Guide
