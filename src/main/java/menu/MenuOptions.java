package menu;

import java.util.Scanner;

public class MenuOptions {
    Scanner in = new Scanner(System.in);
    private int menuNumber;
    private int checkIn;
    private int checkOut;
    private int paymentMethod;
    private int roomNumber;
    private String roomSize;
//    Booking booking = new Booking(); // I Will Set It On The End

    public void menuStart() {
        System.out.println(" | - - - WELCOME TO HOTEL ALEX - - - - - |");
        System.out.println(" | - - - - Here is the Menu  - - - - - - |");
        System.out.println(" | - - - Please Select An Option - - - - |");
        System.out.println(" | - For Making a Reservation press 1  - |");
        menuNumber = in.nextInt();
        if (menuNumber == 1) {
            menuCheckIn();
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
        menuCheckOut();
    }

    private void menuCheckOut() {
        System.out.println(" | - - - Well Done There, Now Please Select The CheckOut Date - - - | ");
        System.out.println(" | - - - Please Use The Same Format 20201230 - - - |");
        checkOut = in.nextInt();
        System.out.println(" You Hae Set The Date For CheckOut: " + checkOut);
        paymentMethod();
    }

    private void paymentMethod() {
        System.out.println("| - - - Please Select Your Payment Method - - - |");
        System.out.println("| - - - Please Select `1 for Cash ` Or `2 for Card ` - - -|");
        paymentMethod = in.nextInt();
        System.out.println(" You Have Set The Payment Method For: " + paymentMethod);
        roomNumber();
    }

    private void roomNumber() {
        System.out.println("| - - - Please Select Number Of Rooms - - - |");
        System.out.println("| - - - We Have 1 - 2 - 3 Romms Avaibles - -|");
        roomNumber = in.nextInt();
        System.out.println(" You Have Selected: " + roomNumber);
        roomSize();

    }

    private void roomSize() {
        System.out.println("| - - - Please Select Room Size - - - |");
        System.out.println("| - - - We Have Small - Medium - Large, Please Select One Of Thesse - - - |");
        roomSize = in.nextLine();
        System.out.println("| - - - You Have Selected: " + roomSize);
    }


}