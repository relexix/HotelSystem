package menu;

import com.sun.xml.bind.v2.TODO;
import hotelsystem.tables.Client;
import repository.ClientRepository;

import java.util.Random;
import java.util.Scanner;

public class MenuOptionsClient {

    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private int phoneNumber;
    private String eMailAddress;

    public void menuClientStart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your First Name: ");
        firstName = scanner.nextLine();
        System.out.println("Please Enter Your Last Name: ");
        lastName = scanner.nextLine();
        System.out.println("Please Enter Your Age: ");
        age = scanner.nextInt();
        System.out.println("Please Enter Your Phone Number(9 digit): ");
        phoneNumber();
    }

    /// Todo Fix This
    private void phoneNumber() {
        Scanner scanner = new Scanner(System.in);
        phoneNumber = scanner.nextInt();
        if (String.valueOf(phoneNumber).length() == 9) {
            System.out.println("Please Enter Your Address:(City): ");
            address = scanner.nextLine();
            System.out.println("Please Enter Your Email Address: ");
            eMailAddress = scanner.nextLine();
            System.out.println("Thank You For Your Reservation!");
            addClient();
        } else {
            System.out.println("Incorect Number,Please Try Again!");
            phoneNumber();
        }
    }

    private void addClient() {
        Client client = new Client(firstName, lastName, age, address, phoneNumber, eMailAddress);
        ClientRepository clientRepository = new ClientRepository();
        clientRepository.addClient(client);
        MenuOptionsBooking menuOptionsBooking = new MenuOptionsBooking();
        menuOptionsBooking.savingStep();
    }
}
