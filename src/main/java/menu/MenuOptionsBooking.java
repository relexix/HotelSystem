package menu;

import hotelsystem.tables.Booking;
import hotelsystem.tables.Payment;
import hotelsystem.tables.Room;
import repository.BookingRepository;
import repository.RoomRepository;

import java.util.List;
import java.util.Scanner;

public class MenuOptionsBooking {
    private int checkIn;
    private int checkOut;
    private String paymentMethod;
    private int roomSelected;
    //    private int roomBeds;
//    private String roomSize;
    private int totalPrice;
//    Booking booking = new Booking(); // I Will Set It On The End

    public void menuStart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" | - - - WELCOME TO HOTEL ALEX - - - - - |");
        System.out.println(" | - - - - Here is the Menu  - - - - - - |");
        System.out.println(" | - - - Please Select An Option - - - - |");
        System.out.println(" | - For Making a Reservation press 1  - |");
        int menuNumber = scanner.nextInt();
        if (menuNumber == 1) {
            menuCheckIn();
        } else {
            System.out.println(" Not A Valid Number ");
            System.out.println(" Please Enter A Valid Number");
            menuStart();
        }

    }

    private void menuCheckIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" | - - - Please Enter The Dates You Want To Check In - - - |");
        System.out.println(" | - - - Format 20201230 ( Year ,Month, Day ) - - - -|");
        checkIn = scanner.nextInt();
        if (String.valueOf(checkIn).length() == 8) {
            System.out.println(" You Have Set The Date For: " + checkIn);
            menuCheckOut();
        } else {
            System.out.println("Incorect Digit, Please Try Again !");
            menuCheckIn();
        }
    }

    private void menuCheckOut() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" | - - - Well Done There, Now Please Select The CheckOut Date - - - | ");
        System.out.println(" | - - - Please Use The Same Format 20201230 - - - |");
        checkOut = scanner.nextInt();
        if (String.valueOf(checkOut).length() == 8) {
            System.out.println(" You Hae Set The Date For CheckOut: " + checkOut);
            paymentMethod();
        } else {
            System.out.println("Incorect Digit, Please Try Again !");
            menuCheckOut();
        }
    }

    private void paymentMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("| - - - Please Select Your Payment Method - - - |");
        System.out.println("| - - - Please Select ` Cash ` Or ` Card ` - - -|");
        paymentMethod = scanner.nextLine();
        if (paymentMethod.equals("Cash") || paymentMethod.equals("Card")) {
            if (paymentMethod.equals("Cash")) {
                Payment payment = new Payment();
                payment.setPaymentId(1);
            }
            if (paymentMethod.equals("Card")) {
                Payment payment = new Payment();
                payment.setPaymentId(2);
            }
            System.out.println(" You Have Set The Payment Method For: " + paymentMethod);
            roomSelect();
        } else {
            System.out.println("Incorect, Please Try Again !");
            paymentMethod();
        }
    }

    private void roomSelect() {
        Scanner scanner = new Scanner(System.in);
        List<Room> roomList = RoomRepository.findAllRooms();
        System.out.println(roomList);
        Room room = new Room();
        System.out.println("We Have: " + roomList + "\n" + "" +
                "\n");
        System.out.println("Please Select Your Room !");
        roomSelected = scanner.nextInt();
        if (roomSelected == 1) {
            room.setRoomId(1);
            totalPrice = 300;
        } else if (roomSelected == 2) {
            room.setRoomId(2);
            totalPrice = 400;
        } else if (roomSelected == 3) {
            room.setRoomId(3);
            totalPrice = 500;
        } else {
            System.out.println("Incorect Selection, Please Try Again!");
            roomSelect();
        }
        totalPrice();
    }

//    private void roomSize() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("| - - - Please Select Room Size - - - |");
//        System.out.println("| - - - We Have Small - Medium - Large, Please Select One Of Thesse - - - |");
//        System.out.println("| - The Price For A Small Room Is 200, For Medium = 300, For Large = 500 -|");
//
//        roomSize = in.nextLine();
//
//        if (roomSize.startsWith("S")) {
//            totalPrice = 200;
//        } else if (roomSize.startsWith("M")) {
//            totalPrice = 300;
//        } else if (roomSize.startsWith("L")) {
//            totalPrice = 500;
//        } else {
//            System.out.println("Incorect Selection, Please Try Again");
//            roomSize();
//        }
//        System.out.println("| - - - You Have Selected: " + roomSize + " - - - |");
//        roomBeds();
//    }
//
//    private void roomBeds() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("| - - - Please Select Number Or Beds - - - |");
//        System.out.println("| - For 1 Bed, Price Is 150, For 2 Beds Price Is 250, For 3 Beds Price Is 350 - |");
//        roomBeds = in.nextInt();
//        if (roomBeds == 1) {
//            totalPrice += 150;
//        } else if (roomBeds == 2) {
//            totalPrice += 250;
//        } else if (roomBeds == 3) {
//            totalPrice += 350;
//        } else {
//            System.out.println("Incorect Number, Pleaase Try Again !");
//            roomBeds();
//        }
////        Room room = new Room();
////        room.setRoomId(1);
//        totalPrice();
//    }

    private void totalPrice() {
        Scanner in = new Scanner(System.in);
        System.out.println("| - - - Your Total Price Is: " + totalPrice + " - - - |");
        System.out.println("| - - - If You Want To Continue To Registration, Please Pres 1 - - - |");
        System.out.println("| - - - If You Want To Cancel The Transaction Pres 2 - - - |");
        int confirmation;
        confirmation = in.nextInt();
        if (confirmation == 1) {
            registrationStep();
        }
    }

    private void registrationStep() {
        Scanner scanner = new Scanner(System.in);
        int confirmation;
        System.out.println(" Press 1 To Se Your Rezervation Info, Or Press 2 To Continue ");
        confirmation = scanner.nextInt();
        if (confirmation == 1) {
            System.out.println(" Your Info ");
            System.out.println(" CheckIn Date: " + checkIn + " Check Out Date: " + checkOut + "\n" + "" +
                    "Payment Method: " + paymentMethod + " Room Size: " + "\n" + "" +
                    "Room Beds: ");
            registrationStep();

        } else if (confirmation == 2) {
            MenuOptionsClient menuOptionsClient = new MenuOptionsClient();
            menuOptionsClient.menuClientStart();
        } else {
            System.out.println("Incorect Number!");
            registrationStep();
        }
    }

    public void savingStep() {
        Booking booking = new Booking(checkIn, checkOut, paymentMethod, totalPrice);
        BookingRepository bookingRepository = new BookingRepository();
        bookingRepository.addBooking(booking);
    }
}