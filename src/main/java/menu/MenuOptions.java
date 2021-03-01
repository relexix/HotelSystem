package menu;

import hotelsystem.tables.Booking;

import java.util.Scanner;

public class MenuOptions {
    Scanner in = new Scanner(System.in);
    private int menuNumber;
    private int checkIn;
    private int checkOut;
//    Booking booking = new Booking(); // I Will Set It On The End

    public void menuStart() {
        System.out.println(" | - - - WELCOME TO HOTEL ALEX - - - - - |");
        System.out.println(" | - - - - Here is the Menu  - - - - - - |");
        System.out.println(" | - - - Please Select An Option - - - - |");
        System.out.println(" | - For Making a Reservation press 1  - |");
        menuNumber = in.nextInt();
        if (menuNumber == 1) {
            MenuOptions.menuCheckIn();
        } else {
            System.out.println(" Not A Valid Number ");
            System.out.println(" Please Enter A Valid Number");
            menuStart();
        }

    }

    private void menuCheckIn() {
        System.out.println(" | - - - Please Enter The Dates You Want To Check In - - - |");
        System.out.println(" | - - - Format 20201230 ( Year ,Month, Day ) - - - -|");
        checkIn = in.nextInt();
        System.out.println(" You Have Set The Date For: " + checkIn);
        MenuOptions.menuCheckOut();
    }

    private void menuCheckOut() {
        System.out.println(" | - - - Well Done There, Now Please Select The CheckOut Date - - - | ");
        System.out.println(" | - - - Please Use The Same Format 20201230 - - - |");
        checkOut = in.nextInt();
        System.out.println(" You Hae Set The Date For CheckOut: " + checkOut);

    }
}