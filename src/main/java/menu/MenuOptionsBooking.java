package menu;

import java.util.Scanner;

public class MenuOptionsBooking {
    private int menuNumber;
    private int checkIn;
    private int checkOut;
    private String paymentMethod;
    private int roomBeds;
    private String roomSize;
    private int totalPrice;
//    Booking booking = new Booking(); // I Will Set It On The End

    public void menuStart() {
        Scanner in = new Scanner(System.in);
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
        Scanner in = new Scanner(System.in);
        System.out.println(" | - - - Please Enter The Dates You Want To Check In - - - |");
        System.out.println(" | - - - Format 20201230 ( Year ,Month, Day ) - - - -|");
        checkIn = in.nextInt();
        if (String.valueOf(checkIn).length() == 8) {
            System.out.println(" You Have Set The Date For: " + checkIn);
            menuCheckOut();
        } else {
            System.out.println("Incorect Digit, Please Try Again !");
            menuCheckIn();
        }
    }

    private void menuCheckOut() {
        Scanner in = new Scanner(System.in);
        System.out.println(" | - - - Well Done There, Now Please Select The CheckOut Date - - - | ");
        System.out.println(" | - - - Please Use The Same Format 20201230 - - - |");
        checkOut = in.nextInt();
        if (String.valueOf(checkOut).length() == 8) {
            System.out.println(" You Hae Set The Date For CheckOut: " + checkOut);
            paymentMethod();
        } else {
            System.out.println("Incorect Digit, Please Try Again !");
            menuCheckOut();
        }
    }

    private void paymentMethod() {
        Scanner in = new Scanner(System.in);
        System.out.println("| - - - Please Select Your Payment Method - - - |");
        System.out.println("| - - - Please Select ` Cash ` Or ` Card ` - - -|");
        paymentMethod = in.nextLine();
        if (paymentMethod.equals("Cash") || paymentMethod.equals("Card")) {
            System.out.println(" You Have Set The Payment Method For: " + paymentMethod);
            roomSize();
        } else {
            System.out.println("Incorect, Please Try Again !");
            paymentMethod();
        }
    }

    private void roomSize() {
        Scanner in = new Scanner(System.in);
        System.out.println("| - - - Please Select Room Size - - - |");
        System.out.println("| - - - We Have Small - Medium - Large, Please Select One Of Thesse - - - |");
        System.out.println("| - The Price For A Small Room Is 200, For Medium = 300, For Large = 500 -|");

        roomSize = in.nextLine();

        if (roomSize.startsWith("S")) {
            totalPrice = 200;
        } else if (roomSize.startsWith("M")) {
            totalPrice = 300;
        } else if (roomSize.startsWith("L")) {
            totalPrice = 500;
        } else {
            System.out.println("Incorect Selection, Please Try Again");
            roomSize();
        }
        System.out.println("| - - - You Have Selected: " + roomSize + " - - - |");
        roomBeds();
    }

    private void roomBeds() {
        Scanner in = new Scanner(System.in);
        System.out.println("| - - - Please Select Number Or Beds - - - |");
        System.out.println("| - For 1 Bed, Price Is 150, For 2 Beds Price Is 250, For 3 Beds Price Is 350 - |");
        roomBeds = in.nextInt();
        if (roomBeds == 1) {
            totalPrice += 150;
        } else if (roomBeds == 2) {
            totalPrice += 250;
        } else if (roomBeds == 3) {
            totalPrice += 350;
        } else {
            System.out.println("Incorect Number, Pleaase Try Again !");
            roomBeds();
        }
        totalPrice();
    }

    private void totalPrice() {
        Scanner in = new Scanner(System.in);
        System.out.println("| - - - Your Total Price Is: " + totalPrice + " - - - |");
        System.out.println("| - - - If You Want To Continue To Registration, Please Pres 1 - - - |");
        System.out.println("| - - - If You Want To Cancel The Transaction Pres 2 - - - |");
        int confirmation;
        confirmation = in.nextInt();
        if (confirmation == 1) {
            registrationStep(in);
        }
    }

    private void registrationStep(Scanner in) {
        int confirmation;
        System.out.println(" Press 1 To Se Your Rezervation Info, Or Press 2 To Continue ");
        confirmation = in.nextInt();
        if (confirmation == 1) {
            System.out.println(" Your Info ");
            System.out.println(" CheckIn Date: " + checkIn + " Check Out Date: " + checkOut + "\n" + "" +
                    "Payment Method: " + paymentMethod + " Room Size: " + roomSize + "\n" + "" +
                    "Room Beds: " + roomBeds);
        }else  {
            System.out.println("Incorect Number!");
            registrationStep(in);
        }
    }
}